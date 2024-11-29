package org.example.utils;

import cn.hutool.crypto.SecureUtil;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import static com.mysql.cj.util.StringUtils.urlEncode;


public class SignUntil {





    /**
     * 生成sign
     * @param key
     * @param secret
     * @param param
     * @param timestamp
     * @return
     */
    public static String generateSign(String key, String secret, String param, Long timestamp) {
        if (param == null) {
            param = "";
        }
        String str = param + timestamp + key + secret;
        return SecureUtil.md5(str).toUpperCase();
    }

}
