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

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * 获取异常的详细信息
 *
 * @author bzz
 **/
public final class ExceptionUtil {

    private ExceptionUtil() {
    }

    public static String toExceptionString(Exception exception) {
        if (exception == null) {
            return null;
        }

        return detailMessage(exception);
    }

    private static String detailMessage(Exception exception) {
        String result;
        ByteArrayOutputStream baos = null;
        PrintStream ps = null;
        try {
            baos = new ByteArrayOutputStream();
            ps = new PrintStream(baos);
            exception.printStackTrace(ps);
            result = baos.toString().trim();
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (baos != null) {
                try {
                    baos.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }


    public static String simpleMessage(Exception exception) {
        String result = "";
        if (exception != null) {
            if (!exception.getMessage().isEmpty()) {
                result = exception.getMessage();
            } else {
                result = exception.toString();
            }
        }

        return result;
    }


}
