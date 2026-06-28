/*
 * Copyright 2023 bzz
 *
 * Licensed under the Apache License, Version 2.0 (the "License;
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

package com.bzz.miniapis.aop;

import com.bzz.miniapis.anotation.DoCheck;
import com.bzz.miniapis.enums.Check;
import com.bzz.miniapis.exception.MiniapisIllegalParametersException;





import java.util.logging.Logger;


import com.bzz.miniapis.config.CheckProperties;

import java.lang.reflect.Method;

/**
 * aop切面方法（执行校验工作）
 */


public class DoCheckPoint {

    // 记录日志
    private final Logger log = Logger.getLogger(DoCheckPoint.class.getName());

    
    private CheckProperties checkProperties;

    /**
     * 自定义切入点
     * 切入点说明：这样指定的切入点是任何一个执行的方法有一个 @DoCheck 注解的连接点（这里连接点可以看是方法）
     */


    /**
     * 定义环绕通知
     */
    
    public Object doCheck(Object target, java.lang.reflect.Method method, Object[] args) throws Throwable {
        // TODO: implement proxy check
        return null;
    }

    /**
     * 获取方法信息
     */
    

    /**
     * 获取方法的所有参数名字
     */
    

    /**
     * 获取需要检验的参数值
     *
     * @param target     需要校验的参数名
     * @param args       被修饰的方法中所有的参数
     * @param paramNames 被修饰的方法中所有的参数名
     */
    public Object getArgValue(String target, Object[] args, String[] paramNames) {
        // 标记当前遍历的索引（因为args和paramNames是一一对应的）
        int idx = 0;
        // 遍历参数名
        for (String name : paramNames) {
            // 匹配对应的参数名则直接返回对应的参数值
            if (name.equals(target)) {
                return args[idx];
            }
            idx++;
        }
        return null;
    }

}
