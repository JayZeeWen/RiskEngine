package com.engine.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {

	private static SimpleDateFormat defaultDateFormat = new SimpleDateFormat(
			"yyyyMMddHHmmssSSS");
	
	/**
	 * Prefix for system property placeholders: "${"
	 */
	public static final String PLACEHOLDER_PREFIX = "${";
	/**
	 * Suffix for system property placeholders: "}"
	 */
	public static final String PLACEHOLDER_SUFFIX = "}";



	public static String resolvePlaceholders(String text, Map<String, String> parameter) {
		if (parameter == null || parameter.isEmpty()) {
			return text;
		}
		StringBuffer buf = new StringBuffer(text);
		int startIndex = buf.indexOf(PLACEHOLDER_PREFIX);
		while (startIndex != -1) {
			int endIndex = buf.indexOf(PLACEHOLDER_SUFFIX, startIndex + PLACEHOLDER_PREFIX.length());
			if (endIndex != -1) {
				String placeholder = buf.substring(startIndex + PLACEHOLDER_PREFIX.length(), endIndex);
				int nextIndex = endIndex + PLACEHOLDER_SUFFIX.length();
				try {
					String propVal = parameter.get(placeholder);
					if (propVal != null) {
						buf.replace(startIndex, endIndex + PLACEHOLDER_SUFFIX.length(), propVal);
						nextIndex = startIndex + propVal.length();
					}
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				startIndex = buf.indexOf(PLACEHOLDER_PREFIX, nextIndex);
			} else {
				startIndex = -1;
			}
		}
		return buf.toString();
	}

	/**
	 * 生成时间戳+三位随机数
	 * @return
	 */
	public static String generateID() {
		Date date = new Date();
		StringBuffer s = new StringBuffer(defaultDateFormat.format(date));
		return s.append((new Random().nextInt(900) + 100)).toString();
	}
	
	/**
	 * 校验值是否是小数
	 * @param str
	 * @return
	 */
	public static boolean checkDecimal(String str) {
		Pattern p = Pattern.compile("\\d+\\.\\d+$");
		Matcher m = p.matcher(str);
		return m.find();
	}

	/**
	 * 校验值是否是整数
	 * @param str
	 * @return
	 */
	public static boolean checkInt(String str) {
		Pattern p = Pattern.compile("^\\d+$");
		Matcher m = p.matcher(str);
		return m.find();
	}

	/**
	 * 验证手机号
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isMobile(String str) {
		Pattern p = Pattern.compile("^[1][3,4,5,8][0-9]{9}$"); // 验证手机号
		Matcher m = p.matcher(str);
		return m.find();
	}

	public static boolean emailFormat(String email) {
		Pattern pattern = Pattern
				.compile("^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$");
		Matcher m = pattern.matcher(email);
		return m.find();
	}
	
	/**
	 * 生成uuid加入时间处理
	 * @return
	 */
	public static synchronized String makeUUIDWithTime() {
		UUID uuid = UUID.randomUUID();
		String uuidStr = uuid.toString().replaceAll("-", "");
		StringBuilder sb = new StringBuilder();
		String currentTime = defaultDateFormat.format(new Date());
		sb.append(currentTime).append(uuidStr.substring(currentTime.length(), 32));
		return sb.toString();
	}
	
	/**
	 * 生成uuid
	 * @return
	 */
	public static synchronized String makeUUID() {
		UUID uuid = UUID.randomUUID();
		String uuidStr = uuid.toString().replaceAll("-", "");
		return uuidStr;
	}
	
	/**
	 * 更正前台输入金额格式
	 * 
	 * @param amount
	 * @return
	 */
	public static String CorrectAmount(String amount) {

		// 判断是不是整数
		String regAmt = "^([1-9]{1}\\d*)";
		Pattern p = Pattern.compile(regAmt);
		Matcher m = p.matcher(amount);
		if (m.matches()) {
			amount = amount + ".00";
		}

		// 判断是不是只有一位小数
		regAmt = "^([0-9]{1}\\d*(\\.[0-9]{1}))";
		p = Pattern.compile(regAmt);
		m = p.matcher(amount);
		if (m.matches()) {
			amount = amount + "0";
		}

		// 返回两位小数
		return amount;
	}
	

	
	/**
	 * 生成6位验证码, 时间到毫秒+3位随机数
	 * 
	 * @return
	 */
	public static boolean isEmpty(String str) {
		return str == null||str.trim().equals("");
	}

	
}
