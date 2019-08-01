
package com.engine.util;

import com.esotericsoftware.reflectasm.MethodAccess;


/**
 * 反射帮助类
 * @author tfs
 *
 */

public class ReflexUtil {

	public static Object invokeMethod(String className, String method, Object... data) throws Exception {
		try {
			Class<?> clazz = Class.forName(className);
			Object objClazz = clazz.newInstance();
			MethodAccess access = MethodAccess.get(clazz);
			Object obj = access.invoke(objClazz, method, data);
			return obj;
		} catch (Exception e) {
			String msg = "反射调用异常("+e.getMessage()+":" + className+")";
			LoginHelper.error(msg, ReflexUtil.class.getName());
			throw new RuntimeException(e);
		}
	}
}

