package com.company;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hash {


    public static String getHashSHA(String txt) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA");
            byte[] array = messageDigest.digest(txt.getBytes());
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < array.length; ++i) {
                stringBuffer.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1, 3));
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }


}
