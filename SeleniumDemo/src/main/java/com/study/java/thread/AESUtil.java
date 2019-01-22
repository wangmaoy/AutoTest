package com.study.java.thread;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class AESUtil {

    public static SecretKeySpec getKey(String seed){
        SecretKeySpec key = null;
        try {
            key = new SecretKeySpec(hex2byte(seed.getBytes()), "AES");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  key;
    }


    public static String getEncString(String strMing, String seed) {
        byte[] byteMi = null;
        byte[] byteMing = null;
        String strMi = "";
        try {
            return byte2hex(getEncCode(strMing.getBytes("GBK"),seed));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            byteMing = null;
            byteMi = null;
        }
        return strMi;
    }

    public static String getDesString(String strMi, String seed) {
        byte[] byteMing = null;
        byte[] byteMi = null;
        String strMing = "";
        try {
            return new String(getDesCode(hex2byte(strMi.getBytes()),seed),"GBK");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            byteMing = null;
            byteMi = null;
        }
        return strMing;
    }

    private static byte[] getEncCode(byte[] byteS, String seed) {
        SecretKeySpec key = getKey(seed);
        byte[] byteFina = null;
        Cipher cipher;
        try {
            cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, key);
            byteFina = cipher.doFinal(byteS);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            cipher = null;
        }
        return byteFina;
    }

    private static byte[] getDesCode(byte[] byteD, String seed) {
        SecretKeySpec key = getKey(seed);
        Cipher cipher;
        byte[] byteFina = null;
        try {
            cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, key);
            byteFina = cipher.doFinal(byteD);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            cipher = null;
        }
        return byteFina;
    }


    public static String byte2hex(byte[] b) {
        String hs = "";
        String stmp = "";
        for (int n = 0; n < b.length; n++) {
            stmp = (Integer.toHexString(b[n] & 0XFF));
            if (stmp.length() == 1)
                hs = hs + "0" + stmp;
            else
                hs = hs + stmp;
        }
        return hs.toUpperCase();
    }

    public static byte[] hex2byte(byte[] b) {
        if ((b.length % 2) != 0)
            throw new IllegalArgumentException("");
        byte[] b2 = new byte[b.length / 2];
        for (int n = 0; n < b.length; n += 2) {
            String item = new String(b, n, 2);
            b2[n / 2] = (byte) Integer.parseInt(item, 16);
        }
        return b2;
    }

    public static void main(String[] args) {
        String tydm=AESUtil.getEncString("B37932912","7C3197A2F1FA7B51E96408421B4DA88F");
        System.out.println("tydm: "+tydm);
        String jgmc=AESUtil.getEncString("北京京东世纪贸易有限公司","7C3197A2F1FA7B51E96408421B4DA88F");
        System.out.println("jgmc: "+jgmc);
        String jgmc1=AESUtil.getEncString("京东商城","7C3197A2F1FA7B51E96408421B4DA88F");
        System.out.println("jgmc1: "+jgmc1);
        String bgrq1=AESUtil.getEncString("2015-01-01","7C3197A2F1FA7B51E96408421B4DA88F");
        System.out.println("bgrq1: "+bgrq1);
        String jgmc2=AESUtil.getEncString("京东金融","7C3197A2F1FA7B51E96408421B4DA88F");
        System.out.println("jgmc2: "+jgmc2);
        String bgrq2=AESUtil.getEncString("2013-10-11","7C3197A2F1FA7B51E96408421B4DA88F");
        System.out.println("bgrq2: "+bgrq2);

    }

}
