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

package com.bzz.miniapis.anotation;

import com.bzz.miniapis.enums.Check;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 接口参数校验注解
 */
@Target(ElementType.METHOD) // 目标作用在方法上
@Retention(RetentionPolicy.RUNTIME) // 运行时保留
public @interface DoCheck {

    // 校验方式 （枚举）
    Check value() default Check.Email;

    // 校验参数
    String arg() default "";

    // 错误信息
    String msg() default "";

}
