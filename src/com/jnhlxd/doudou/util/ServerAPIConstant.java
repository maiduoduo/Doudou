package com.jnhlxd.doudou.util;

import com.qianjiang.framework.app.QJApplicationBase;
import com.qianjiang.framework.util.AppUtil;

/**
 * 定义与服务器端的接口交互需要用到的常量
 * 
 * @author zou.sq
 */
public class ServerAPIConstant {
	public static final String API_LOGIN = "/user/login";
	public static final String API_CHECK_VERSION = "/status/checkVersion";
	public static final String API_SUBMIT_SIGN_INFO = "/kaoqin/submitSignInfo";

	public static final String API_ROOT_URL = "api_root_url";
	public static final String KEY_APP_SIGN = "appSign";
	public static final String KEY_USER_NAME = "user_name";
	public static final String KEY_SMS_ID = "sms_id";
	public static final String KEY_PWD = "pwd";
	public static final String KEY_APP = "app";
	public static final String KEY_DATA = "data";
	public static final String KEY_USER_INFO = "userInfo";
	public static final String KEY_CLASS_INFO = "classInfo";
	public static final String KEY_SCHOOL_INFO = "schoolInfo";

	public static String getApiRootUrl() {
		return AppUtil.getMetaDataByKey(QJApplicationBase.CONTEXT, API_ROOT_URL);
	}

	public static String getAppSign() {
		return AppUtil.getMetaDataByKey(QJApplicationBase.CONTEXT, KEY_APP_SIGN);
	}

	/**
	 * 获取接口地址
	 * 
	 * @param interfaceName
	 *            接口名字
	 * @return String
	 * @throws
	 */
	public static String getUrl(String interfaceName) {
		return getApiRootUrl() + interfaceName;
	}

}