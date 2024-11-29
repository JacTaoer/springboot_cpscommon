package org.example.utils;

import cn.hutool.crypto.SecureUtil;

import java.util.Map;
import java.util.TreeMap;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SignUtil {

    public static String getKkySign(Map<String, String> params, String userKey) {
        // 使用TreeMap自动对参数按key字典顺序排序
        TreeMap<String, String> sortedParams = new TreeMap<>(params);

        // 构建签名的字符串
        StringBuilder signText = new StringBuilder();
        for (Map.Entry<String, String> entry : sortedParams.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            // 跳过值为空或key为'sign'的参数
            if (value.isEmpty() || "sign".equals(key)) {
                continue;
            }

            // 参数之间用'&'连接
            if (signText.length() > 0) {
                signText.append('&');
            }

            signText.append(key).append('=').append(value);
        }

        // 在签名字符串末尾添加用户密钥
        signText.append(userKey);

        // 使用MD5生成最终的签名
        return md5(signText.toString());
    }

    private static String md5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            // 将字节数组转换为十六进制字符串
            StringBuilder hexString = new StringBuilder();
            for (int i = 0; i < messageDigest.length; i++) {
                String hex = Integer.toHexString(0xff & messageDigest[i]);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("MD5 cryptographic algorithm is not available.", e);
        }
    }


}