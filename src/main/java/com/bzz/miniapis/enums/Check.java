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

package com.bzz.miniapis.enums;

import com.bzz.miniapis.utils.CheckUtil;

import java.util.function.Function;

/**
 * 校验枚举类
 *
 * @author bzz
 */
public enum Check {

    // 邮箱校验方式
    Email("参数应为Email地址", CheckUtil::isEmail),

    // 手机号校验方式
    Phone("参数应为手机号", CheckUtil::isPhone),

    // URL校验方式
    Url("参数应为URL地址", CheckUtil::isUrl),

    // 非空校验方式
    NotEmpty("参数不能为空", CheckUtil::isNotEmpty),

    // 非Null校验方式
    NotNull("参数不能为null", CheckUtil::isNotNull),

    // 数字校验方式
    Numeric("参数应为数字", CheckUtil::isNumeric);

    private final String msg;

    /**
     * 函数式接口.Object:传入参数类型,Boolean:返回类型
     */
    private final Function<Object, Boolean> function;

    Check(String msg, Function<Object, Boolean> function) {
        this.msg = msg;
        this.function = function;
    }

    public String getMsg() {
        return msg;
    }

    public Function<Object, Boolean> getFunction() {
        return function;
    }

}
