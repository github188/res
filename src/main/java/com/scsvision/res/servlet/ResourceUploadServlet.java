package com.scsvision.res.servlet;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.scsvision.res.exception.ErrorCode;
import com.scsvision.res.util.Configuration;

/**
 * ResourceUploadServlet
 * 
 * @author MIKE
 *         <p />
 *         Create at 2015 下午5:33:53
 */
public class ResourceUploadServlet extends HttpServlet {

	public static final String PATH_PREFIX = "/res/file/";

	/**
	 * 
	 */
	private static final long serialVersionUID = -4827020140575014965L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// 检查是否文件上传请求
		boolean isMultipart = ServletFileUpload.isMultipartContent(req);
		// 生成文件的路劲列表
		List<String> paths = new LinkedList<String>();
		try {
			if (isMultipart) {
				// 解析请求
				DiskFileItemFactory factory = new DiskFileItemFactory();
				ServletFileUpload upload = new ServletFileUpload(factory);
				List items = upload.parseRequest(req);
				Iterator iter = items.iterator();
				// 获取配置路径
				String dir = Configuration.getInstance().loadProperties(
						"root.dir");
				SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
				Date now = new Date();
				StringBuffer path = new StringBuffer();
				path.append(dir);
				path.append("/");
				path.append(sdf.format(now));
				// 创建文件夹
				File directory = new File(path.toString());
				if (!directory.exists()) {
					directory.mkdirs();
				}
				sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
				path.append("/");
				path.append(sdf.format(now));
				path.append("-");
				String prefix = path.toString();
				int seq = 1;
				while (iter.hasNext()) {
					FileItem item = (FileItem) iter.next();
					if (item.getContentType().contains(
							"application/octet-stream")) {
						// 获取扩展名
						String ext = "";
						String fileName = item.getName();
						int index = fileName.lastIndexOf(".");
						if (index > 0 && index < fileName.length()) {
							ext = fileName.substring(index);
						}
						String filePath = prefix + seq++ + ext;
						paths.add(filePath);
						item.write(new File(filePath));
					} else {
						System.out.println(item.getContentType());
					}
				}
				writeResult(ErrorCode.SUCCESS, "", paths, resp);
			} else {
				writeResult(ErrorCode.NOT_MULTIPART_REQUEST,
						"Request is not a multipart request !", paths, resp);
				return;
			}
		} catch (Exception e) {
			e.printStackTrace();
			writeResult(ErrorCode.ERROR, e.getMessage(), paths, resp);
			return;
		}
	}

	private void writeResult(String code, String message, List<String> paths,
			HttpServletResponse resp) throws IOException {
		String dir = Configuration.getInstance().loadProperties("root.dir");
		int begin = dir.length() + 1;
		StringBuffer sb = new StringBuffer();
		sb.append("<Response Code=\"");
		sb.append(code);
		sb.append("\" Message=\"");
		sb.append("\">");
		sb.append(System.lineSeparator());
		for (String path : paths) {
			sb.append("  <Item Url=\"");
			sb.append(PATH_PREFIX + path.substring(begin));
			sb.append("\" />");
			sb.append(System.lineSeparator());
		}
		sb.append("</Response>");
		resp.setCharacterEncoding("utf8");
		resp.getWriter().print(sb.toString());
		resp.getWriter().flush();
		resp.getWriter().close();
	}
}
