/*
 * Copyright 2023 bzz
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.bzz.miniapis.utils;

/**
 * Unicode工具类
 *
 * @author bzz
 */
public class UnicodeUtil {

    /**
     * 将字符串编码为unicode格式
     *
     * @param str 待编码的字符串
     * @return 编码后的unicode字符串
     */
    public static String encode(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c < 256) {
                sb.append(c);
            } else {
                sb.append("\\u").append(String.format("%04x", (int) c));
            }
        }
        return sb.toString();
    }

    /**
     * 将unicode字符串解码为普通字符串
     *
     * @param str 待解码的unicode字符串
     * @return 解码后的普通字符串
     */
    public static String decode(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            char c = str.charAt(i);
            if (c == '\\' && i + 1 < str.length() && str.charAt(i + 1) == 'u') {
                String code = str.substring(i + 2, i + 6);
                sb.append((char) Integer.parseInt(code, 16));
                i += 6;
            } else {
                sb.append(c);
                i++;
            }
        }
        return sb.toString();
    }

}
