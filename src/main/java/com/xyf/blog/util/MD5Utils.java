package com.xyf.blog.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Utils {

    /**
     * MD5加密类
     * @param str 要加密的字符串
     * @return 加密后的字符串
     */
    public static String code(String str) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(str.getBytes());
            byte[] bytes = md.digest();
            int i;
            StringBuffer buff = new StringBuffer("");
            for (int offset = 0; offset < bytes.length; offset++) {
                i = bytes[offset];
                if (i < 0)
                    i += 256;
                if (i < 16)
                    buff.append("0");
                buff.append(Integer.toHexString(i));
            }
            // 32位加密
            return buff.toString();
            // 16位加密
//            return buff.toString().substring(8, 24);
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.println(code("111111"));
    }
}
