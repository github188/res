package com.scsvision.res.servlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.scsvision.res.util.Configuration;

/**
 * GetImageServlet
 * 
 * @author MIKE
 *         <p />
 *         Create at 2015 上午10:06:38
 */
public class GetImageServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6902889977384567084L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String path = req.getParameter("path");
		if (null == path || path.trim().length() == 0) {
			resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
			return;
		}
		String absolutePath = Configuration.getInstance().loadProperties(
				"root.dir");
		absolutePath += "/" + path;
		File file = new File(absolutePath);
		if (!file.exists()) {
			resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
			return;
		}
		FileInputStream in = new FileInputStream(file);
		ServletOutputStream out = resp.getOutputStream();
		byte[] buffer = new byte[4096];
		int count = 0;
		while ((count = in.read(buffer)) != -1) {
			out.write(buffer, 0, count);
		}
		out.flush();
		in.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String path = req.getParameter("path");
		if (null == path || path.trim().length() == 0) {
			resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
			return;
		}
		String absolutePath = Configuration.getInstance().loadProperties(
				"root.dir");
		absolutePath += "/" + path;
		File file = new File(absolutePath);
		if (!file.exists()) {
			resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
			return;
		}
		if (!file.delete()) {
			log("ERROR " + absolutePath + " delete failed !");
		}
	}
}
