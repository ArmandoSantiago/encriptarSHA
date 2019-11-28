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
                stringBuffer.append(Integer.toHexString((array[i] & 0xFF) | 0x100));
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static String obtenerSHA(String texto) {
        try {
            System.out.println("Incia la conversion de " + texto);
            System.out.println("**********************************************************");
            byte [] textoBytes = texto.getBytes();
            for (int i = 0; i < textoBytes.length ; i++) {
                System.out.println("Texto en bytes " + i + " es " + textoBytes[i]);
            }
            System.out.println("**********************************************************");

            StringBuffer stringBuffer = new StringBuffer();
            MessageDigest messageDigest = MessageDigest.getInstance("SHA");
            byte[] array = messageDigest.digest(textoBytes);
            for (int i = 0; i < array.length; i++) {
//                System.out.println("Iteracion " + i + " es " + array[i]);
                System.out.println("Iteracion  de Integer" + i + " es " + Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1,3));
                stringBuffer.append(Integer.toHexString((array[i] & 0xFF) | 0x100));

            }
            System.out.println("**********************************************************");


            return stringBuffer.toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;

    }


}
