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
 */
public enum Check {

    // 邮箱校验方式
    // Boolean res = annotation.value().function.apply(argValue);
    Email("参数应为Email地址", CheckUtil::isEmail);

    public String msg;

    /**
     * 函数式接口.Object:传入参数类型,Boolean:返回类型
     */
    public Function<Object, Boolean> function;

    Check(String msg, Function<Object, Boolean> function) {
        this.msg = msg;
        this.function = function;
    }

}
