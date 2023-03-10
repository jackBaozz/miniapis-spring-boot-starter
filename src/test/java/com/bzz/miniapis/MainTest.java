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


import com.bzz.miniapis.web.R;
import com.bzz.miniapis.web.TestController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = {TestController.class})
@TestPropertySource(locations = "classpath:test.properties")
public class MainTest {

    @Autowired
    private TestController testController;

    /**
     * 只校验功能开关
     */
    @Value("${miniapis.check.enabled}")
    private boolean enabled;


    @Test
    public void getInfo1() {
        assertEquals(true, enabled);
    }

    /**
     * check.enabled=true的时候
     */
    @Test
    public void getInfo2() {
        //是否会将testController加载到Spring application context
        assertThat(testController, notNullValue());
        assertEquals(true, enabled);

        R<String> rightR = testController.sendEmail("123456@qq.com");
        assertEquals(rightR.getCode() + "", "200");
        assertEquals(rightR.getMsg(), "操作成功");

        R<String> wrongR = testController.sendEmail("123456");
        assertEquals(wrongR.getCode() + "", "500");
        assertEquals(wrongR.getMsg(), "邮箱格式不正确！");
    }


    /**
     * check.enabled=false的时候
     */
    @Test
    public void getInfo3() {
        //是否会将testController加载到Spring application context
        assertThat(testController, notNullValue());
        assertEquals(false, enabled);

        //如果开关关闭,那么不管邮箱格式是否合理, 都默认合理
        R<String> wrongR = testController.sendEmail("123456");
        assertEquals(wrongR.getCode() + "", "200");
        assertEquals(wrongR.getMsg(), "操作成功");
    }

}
