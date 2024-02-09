package com.smu.mscda;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;

public class StringCapitalizer {

    public void capitalize(String input) {
        String capitalizedString =  StringUtils.capitalize(input);
        System.out.println("Capitalized String is :"+ capitalizedString);

    }
}
