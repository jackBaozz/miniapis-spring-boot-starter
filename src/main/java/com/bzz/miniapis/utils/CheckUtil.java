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

}
