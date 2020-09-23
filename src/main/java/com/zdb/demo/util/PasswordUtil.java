package com.zdb.demo.util;

import org.apache.commons.codec.binary.Hex;

import java.security.MessageDigest;
import java.util.Random;

public class PasswordUtil {
	
	private static Integer MAX = 16;  //32位随机数
	
	public static String getSalt(){
		StringBuffer buffer = new StringBuffer("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"); 
        StringBuffer sb = new StringBuffer(); 
        Random random = new Random(); 
        int range = buffer.length(); 
        for (int i = 0; i < MAX; i ++) { 
            sb.append(buffer.charAt(random.nextInt(range))); 
        } 
        return sb.toString(); 
	}
	
	
	/**
	 * 生成含有随机盐的密码
	 */
	public static String generate(String password, String salt) {
 		password = md5Hex(password + salt);
 		char[] cs = new char[48];
 		for (int i = 0; i < 48; i += 3) {
 			cs[i] = password.charAt(i / 3 * 2);
 			char c = salt.charAt(i / 3);
 			cs[i + 1] = c;
 			cs[i + 2] = password.charAt(i / 3 * 2 + 1);
 		}
		return new String(cs);
	}
	
	/**
	 * 校验密码是否正确
	 */
	public static boolean verify(String password, String md5) {
 		char[] cs1 = new char[32];
		char[] cs2 = new char[16];
		for (int i = 0; i < 48; i += 3) {
			cs1[i / 3 * 2] = md5.charAt(i);
			cs1[i / 3 * 2 + 1] = md5.charAt(i + 2);
			cs2[i / 3] = md5.charAt(i + 1);
		}
		String salt = new String(cs2);
		return md5Hex(password + salt).equals(new String(cs1));
	}
	
	/**
	 * 获取十六进制字符串形式的MD5摘要
	 */
	public static String md5Hex(String src) {
		try {
			MessageDigest md5 = MessageDigest.getInstance("MD5");
			byte[] bs = md5.digest(src.getBytes());
			return new String(new Hex().encode(bs));
		} catch (Exception e) {
			return null;
		}
	}

	public static void main(String[] args) {
		String salt = getSalt();
		System.out.println(salt);
		String password = generate("admin", salt);
		System.out.println(password);
		System.out.println(password.length());
		System.out.println(verify("admin", password));
	}
}
