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


import com.bzz.miniapis.anotation.DoCheck;
import com.bzz.miniapis.aop.DoCheckPoint;
import com.bzz.miniapis.config.CheckAutoConfigure;
import com.bzz.miniapis.enums.Check;
import com.bzz.miniapis.web.R;
import com.bzz.miniapis.web.TestController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.lang.reflect.Method;

import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = {CheckAutoConfigure.class, DoCheckPoint.class, TestController.class})
@TestPropertySource(locations = "classpath:test.properties")
public class MainTest2 {

    //引用
    @Autowired
    private MockMvc mockMvc;
    //    @SpyBean
//    //@MockBean
//    TestController testController;
    @Autowired
    private TestController testController;

    @Autowired
    private DoCheckPoint doCheckPoint;


    @Value("${miniapis.enabled}")
    private boolean mainSwitch;

    /**
     * 只校验功能开关
     */
    @Value("${miniapis.check.enabled}")
    private boolean enabled;

    @Before
    public void before() {
        System.out.println("miniapis.enabled=" + mainSwitch);
    }


    @Test
    public void testSendEmailWithCorrectEmailFormat() {
        String correctEmail = "123456@qq.com";
        R<String> result = testController.sendEmail(correctEmail);
        assertEquals("发送成功", result.getData());
    }

    @Test
    public void testSendEmailWithIncorrectEmailFormat() {
        String incorrectEmail = "123456";
        try {
            R<String> result = testController.sendEmail(incorrectEmail);
            //assertEquals(result.getCode() + "", "500");
            //assertEquals(result.getMsg(), "邮箱格式不正确！");
        } catch (IllegalArgumentException e) {
            assertEquals("邮箱格式不正确！", e.getMessage());
        }
    }


    @Test
    public void testDoCheckAnnotationOnSendEmailMethod() throws NoSuchMethodException {
        Method method = TestController.class.getMethod("sendEmail", String.class);
        assertNotNull(method);
        DoCheck annotation = method.getAnnotation(DoCheck.class);
        assertNotNull(annotation);
        assertEquals(Check.Email, annotation.value());
        assertEquals("email", annotation.arg());
        assertEquals("邮箱格式不正确！", annotation.msg());
    }


    @Test
    public void testSendEmail() {
        // 初始化待测试对象
        TestController testController = new TestController();

        // 调用带注解的方法进行测试
        R<String> result = testController.sendEmail("test");

        //是否会将testController加载到Spring application context
        assertThat(testController, notNullValue());
        assertEquals(true, enabled);

//        R<String> rightR = testController.sendEmail("123456@qq.com");
//        assertEquals(rightR.getCode() + "", "200");
//        assertEquals(rightR.getMsg(), "操作成功");


//        Mockito.doReturn(null).when(this.doCheckPoint).doCheck(null);
//        Mockito.doReturn(null).when(this.testController).sendEmail("123456");
//        Mockito.verify(this.doCheckPoint, Mockito.times(1)).doCheck(null);


        R<String> wrongR = testController.sendEmail("123456");
        assertEquals(wrongR.getCode() + "", "500");
        assertEquals(wrongR.getMsg(), "邮箱格式不正确！");
    }


}
