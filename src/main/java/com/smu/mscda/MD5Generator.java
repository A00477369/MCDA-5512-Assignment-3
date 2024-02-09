package com.smu.mscda;

import org.apache.commons.codec.digest.DigestUtils;

public class MD5Generator {
    public void GenerateMD5(String input) {

        String md5Hex =  DigestUtils.md5Hex(input);
        System.out.println("MD5 hex is : "+ md5Hex);

    }
}
