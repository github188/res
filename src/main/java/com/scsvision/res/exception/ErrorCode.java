package com.scsvision.res.exception;

/**
 * 错误编码集合
 * 
 * @author huangbuji
 *         <p />
 *         create at 2013-3-20 下午01:54:52
 */
public class ErrorCode {
	/**
	 * URL错误
	 */
	public static final String URL_ERROR = "613";
	/**
	 * 网络IO异常
	 */
	public static final String NETWORK_IO_ERROR = "612";
	/**
	 * 未知错误
	 */
	public static final String ERROR = "561";
	/**
	 * 成功
	 */
	public static final String SUCCESS = "200";
	/**
	 * 密码错误
	 */
	public static final String AUTHORISE_FAILED = "401";
	/**
	 * 缺少参数
	 */
	public static final String PARAMETER_NOT_FOUND = "400";
	/**
	 * 非法参数
	 */
	public static final String PARAMETER_INVALID = "451";
	/**
	 * 目标资源未找到，通常在查询指定ID的对象时没有返回时用到
	 */
	public static final String RESOURCE_NOT_FOUND = "410";
	/**
	 * 请求消息头缺少Content-Length
	 */
	public static final String CONTENT_LENGTH_NOT_FOUND = "411";
	/**
	 * 编码格式错误，系统不支持utf8编码
	 */
	public static final String ENCODING_ERROR = "440";
	/**
	 * 子节点存在,不允许删除和移动
	 */
	public static final String CHILDREN_EXIST = "441";
	/**
	 * 对象唯一属性重复异常
	 */
	public static final String UNIQUE_PROPERTY_DUPLICATE = "442";
	/**
	 * 平台License验证错误
	 */
	public static final String LICENSE_VERIFY_FAILED = "443";
	/**
	 * 用户会话过期
	 */
	public static final String USER_SESSION_EXPIRED = "454";
	/**
	 * 数据设备对应机构错误
	 */
	public static final String DETECTOR_MAPPING_ORGAN_ERROR = "456";
	/**
	 * 数据库访问错误
	 */
	public static final String DATABASE_ACCESS_ERROR = "560";
	/**
	 * 达到用户最大登录数量，不允许登录
	 */
	public static final String MAX_CONNECT_LIMIT = "445";
	/**
	 * 用户名不存在
	 */
	public static final String USER_NOT_FOUND = "630";
	/**
	 * 用户密码错误
	 */
	public static final String PASSWORD_ERROR = "631";
	/**
	 * 用户状态不可用
	 */
	public static final String USER_STATUS_INVALID = "632";
	/**
	 * 用户角色无权限
	 */
	public static final String USER_ROLE_INVALID = "633";
	/**
	 * 名称已存在
	 */
	public static final String NAME_EXIST = "634";
	/**
	 * 登录账号已存在
	 */
	public static final String USER_ACCOUNT_EXIST = "636";
	/**
	 * admin用户的角色不允许修改
	 */
	public static final String ADMIN_ROLE_CANNOT_EDIT = "637";
	/**
	 * 通道号不合法
	 */
	public static final String CHANNEL_NUMBER_INVALID = "638";
	/**
	 * 通道号重复
	 */
	public static final String CHANNEL_NUMBER_EXIST = "635";
	/**
	 * 达到用户最大登录数
	 */
	public static final String USER_MAX_CONNECT_LIMIT = "639";
	/**
	 * 内网IP重复
	 */
	public static final String LANIP_EXIST = "640";
	/**
	 * 设备型号名称重复
	 */
	public static final String DEVICE_MODEL_NAME_EXIST = "641";
	/**
	 * License文件格式不正确
	 */
	public static final String LICENSE_FORMAT_INVALID = "642";
	/**
	 * 文件上传请求中缺失Filedata参数
	 */
	public static final String MISSING_PARAMETER_FILEDATA = "643";
	/**
	 * 文件上传接口的HTTP请求头中没有标识文件上传头域
	 */
	public static final String NOT_MULTIPART_REQUEST = "644";
	/**
	 * License文件被非法修改过，验证不通过
	 */
	public static final String LICENSE_HAS_BEEN_CHANGED = "645";
	/**
	 * 服务器主板序列号验证失败
	 */
	public static final String MOTHER_BOARD_VERIFY_FAILED = "646";
	/**
	 * 服务器CPUID验证失败
	 */
	public static final String CPUID_VERIFY_FAILED = "647";
	/**
	 * 服务器MAC地址验证失败
	 */
	public static final String MAC_VERIFY_FAILED = "648";
	/**
	 * 用户数量超过License的最大限制
	 */
	public static final String USER_AMOUNT_LIMIT = "649";
	/**
	 * License中的用户数量数值非法
	 */
	public static final String USER_AMOUNT_INVALID = "650";
	/**
	 * 数据设备数量超过License的最大限制
	 */
	public static final String DEVICE_AMOUNT_LIMIT = "651";
	/**
	 * License中的数据设备数量数值非法
	 */
	public static final String DEVICE_AMOUNT_INVALID = "652";
	/**
	 * 摄像头数量超过License的最大限制
	 */
	public static final String CAMERA_AMOUNT_LIMIT = "653";
	/**
	 * License中的摄像头数量数值非法
	 */
	public static final String CAMERA_AMOUNT_INVALID = "654";
	/**
	 * 平台的License授权已经过期
	 */
	public static final String LICENSE_EXPIRED = "655";
	/**
	 * License中的授权过期时间格式非法
	 */
	public static final String LICENSE_EXPIRED_FORMAT_INVALID = "656";
	/**
	 * 机构下存在资源
	 */
	public static final String RESOURCE_ORGAN_EXIST = "657";
	/**
	 * 服务器下存在资源
	 */
	public static final String RESOURCE_SERVER_EXIST = "658";

	/**
	 * excel模板dvr为空
	 */
	public static final String EXCEL_DVR_IS_NULL = "659";

	/**
	 * excel模板个格式不正确
	 */
	public static final String EXCEL_FORMAT_INVALID = "660";

	/**
	 * 创建摄像头、报警输入等二级设备时，通道数量达到最大限制
	 */
	public static final String CHANNEL_AMOUNT_OVER_LIMIT = "661";

	/**
	 * excel模板内容有误
	 */
	public static final String EXCEL_CONTENT_ERROR = "662";
	/**
	 * 系统时间被恶意修改
	 */
	public static final String SYSTEM_BAD_CHANGED = "663";
	/**
	 * 用户会话被管理员踢出
	 */
	public static final String USER_SESSION_KICK_OFF = "664";
	/**
	 * 解析XML错误
	 */
	public static final String XML_PARSE_ERROR = "665";
	/**
	 * 前一路段已被选择
	 */
	public static final String FRONT_ORGAN_ID_EXIST = "666";
	/**
	 * 后一路段已被选择
	 */
	public static final String BACK_ORGAN_ID_EXIST = "667";
	/**
	 * 前后路段已被选择
	 */
	public static final String FRONT_AND_BACK_ORGAN_EXIST = "668";
	/**
	 * 不支持的数据库
	 */
	public static final String NOT_SUPPORT_DATABASE = "669";
	/**
	 * 队长已存在
	 */
	public static final String IS_ADMIN_EXIST = "670";
	/**
	 * 事件状态不正确，已被其他人处理
	 */
	public static final String EVENT_SCHEME_GENERATED = "671";
	/**
	 * 必要信息缺失
	 */
	public static final String IMPORTANT_DATA_MISSING = "672";
	/**
	 * 配置项不存在
	 */
	public static final String CONFIG_MISSING = "673";
	/**
	 * ActiveMq通信异常
	 */
	public static final String AMQ_CONNECTION_ERROR = "674";
	/**
	 * JNDI查找异常
	 */
	public static final String JNDI_FIND_ERROR = "675";
	
}
