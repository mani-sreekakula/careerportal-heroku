package com.career.security;

import java.security.*;
import java.math.*;

public class Encrypt {

    public static String encrypt(String plain) throws Exception {

        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(plain.getBytes(), 0, plain.length());
        String cyper = new BigInteger(1, md.digest()).toString(16);
        System.out.println("MD5: " + cyper);
        return cyper;
    }
}
