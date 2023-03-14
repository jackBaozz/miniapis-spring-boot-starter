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

package com.bzz.miniapis.web;

import com.bzz.miniapis.anotation.DoCheck;
import com.bzz.miniapis.enums.Check;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试的入口
 *
 * 如果要测试,这里需要引入 spring-boot-starter-web包
 */
@RestController
public class TestController {

    private final Logger log = LoggerFactory.getLogger(TestController.class);

    @DoCheck(value = Check.Email, arg = "email", msg = "邮箱格式不正确！")
    @GetMapping("/test")
    public R<String> sendEmail(@RequestParam("email") String email) {
        log.info("校验参数：{}", email);
        return R.success("发送成功");
    }

}
