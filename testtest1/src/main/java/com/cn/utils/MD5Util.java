package com.cn.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @Auther: mazhiqiang
 * @Date: 2019\1\28 0028 15:38
 * @Description:
 */
public class MD5Util {

    public MD5Util() {
    }

    public static String getPwd(String pwd) {
        try {
            MessageDigest digest = MessageDigest.getInstance("md5");
            byte[] bs = digest.digest(pwd.getBytes());
            String hexString = "";
            byte[] var4 = bs;
            int var5 = bs.length;

            for(int var6 = 0; var6 < var5; ++var6) {
                byte b = var4[var6];
                int temp = b & 255;
                if (temp < 16 && temp >= 0) {
                    hexString = hexString + "0" + Integer.toHexString(temp);
                } else {
                    hexString = hexString + Integer.toHexString(temp);
                }
            }

            return hexString;
        } catch (NoSuchAlgorithmException var9) {
            var9.printStackTrace();
            return "";
        }
    }

    public static void main(String[] args) {
        String pwd = getPwd("abc");
        System.out.println(pwd);
    }
}
