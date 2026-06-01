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

package com.bzz.miniapis;

import com.bzz.miniapis.config.MiniapisAutoConfiguration;
import com.bzz.miniapis.web.GlobalExceptionHandler;
import com.bzz.miniapis.web.R;
import com.bzz.miniapis.web.TestController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = {MiniapisAutoConfiguration.class, TestController.class, GlobalExceptionHandler.class},
                properties = {
                    "miniapis.enabled=true",
                    "miniapis.check.enabled=false"
                })
public class Main3Test {

    @Autowired
    private TestController testController;

    @Test
    public void getInfo3() {
        // Test that the controller is loaded
        assertThat(testController, notNullValue());

        // Since miniapis.check.enabled=false, the verification is skipped, so even an invalid email returns 200 Success
        R<String> wrongR = testController.sendEmail("123456");
        assertEquals("200", wrongR.getCode() + "");
        assertEquals("操作成功", wrongR.getMsg());
    }
}
