package com.smu.mscda;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;

public class StringService {

    public String capitalizeInput(String input) {
        if (input == null) {
            return null;
        }
        return StringUtils.capitalize(input);
    }

    public String generateMd5Hex(String input) {
        if (input == null) {
            return null;
        }
        return DigestUtils.md5Hex(input);
    }
}