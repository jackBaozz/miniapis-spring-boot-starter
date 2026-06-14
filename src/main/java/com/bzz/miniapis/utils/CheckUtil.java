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

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 校验工具类
 *
 * @author bzz
 */
public class CheckUtil {

    /**
     * 使用正则表达式判断是否是邮箱格式
     */
    public static Boolean isEmail(Object value) {
        if (value == null) {
            return Boolean.FALSE;
        }
        if (value instanceof String) {
            String regEx = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
            Pattern p = Pattern.compile(regEx);
            Matcher m = p.matcher((String) value);
            if (m.matches()) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    /**
     * 判断是否是手机号格式
     */
    public static Boolean isPhone(Object value) {
        if (value == null) {
            return Boolean.FALSE;
        }
        if (value instanceof String) {
            String regEx = "^1[3-9]\\d{9}$";
            Pattern p = Pattern.compile(regEx);
            Matcher m = p.matcher((String) value);
            return m.matches();
        }
        return Boolean.FALSE;
    }

    /**
     * 判断是否是URL格式
     */
    public static Boolean isUrl(Object value) {
        if (value == null) {
            return Boolean.FALSE;
        }
        if (value instanceof String) {
            String regEx = "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]$";
            Pattern p = Pattern.compile(regEx);
            Matcher m = p.matcher((String) value);
            return m.matches();
        }
        return Boolean.FALSE;
    }

    /**
     * 判断参数是否不为空 (支持String, Collection, Map, 数组)
     */
    public static Boolean isNotEmpty(Object value) {
        if (value == null) {
            return Boolean.FALSE;
        }
        if (value instanceof String) {
            return !((String) value).trim().isEmpty();
        }
        if (value instanceof java.util.Collection) {
            return !((java.util.Collection<?>) value).isEmpty();
        }
        if (value instanceof java.util.Map) {
            return !((java.util.Map<?, ?>) value).isEmpty();
        }
        Boolean arrayResult = isArrayNotEmpty(value);
        if (arrayResult != null) {
            return arrayResult;
        }
        return Boolean.TRUE;
    }

    /**
     * 判断是否不能为 null
     */
    public static Boolean isNotNull(Object value) {
        return value != null;
    }

    /**
     * 判断是否为纯数字
     */
    public static Boolean isNumeric(Object value) {
        if (value == null) {
            return Boolean.FALSE;
        }
        if (value instanceof String) {
            return ((String) value).matches("\\d+");
        }
        if (value instanceof Number) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    /**
     * 判断数组是否不为空，若不是数组则返回 null
     */
    private static Boolean isArrayNotEmpty(Object value) {
        if (value instanceof Object[]) return ((Object[]) value).length > 0;
        if (value instanceof int[]) return ((int[]) value).length > 0;
        if (value instanceof long[]) return ((long[]) value).length > 0;
        if (value instanceof short[]) return ((short[]) value).length > 0;
        if (value instanceof byte[]) return ((byte[]) value).length > 0;
        if (value instanceof double[]) return ((double[]) value).length > 0;
        if (value instanceof float[]) return ((float[]) value).length > 0;
        if (value instanceof boolean[]) return ((boolean[]) value).length > 0;
        if (value instanceof char[]) return ((char[]) value).length > 0;
        return null;
    }

}
