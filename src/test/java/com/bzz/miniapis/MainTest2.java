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
import com.bzz.miniapis.web.GlobalExceptionHandler;
import com.bzz.miniapis.web.R;
import com.bzz.miniapis.web.TestController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.Method;

import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.*;
import static org.mockito.Mockito.doReturn;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {CheckAutoConfigure.class, DoCheckPoint.class, TestController.class, GlobalExceptionHandler.class})
@TestPropertySource(locations = "classpath:test.properties")
public class MainTest2 {

    //引用
    //@Autowired
    //private MockMvc mockMvc;

    @SpyBean
    private TestController testController;

    @SpyBean
    private DoCheckPoint aop;

    @Value("${miniapis.enabled}")
    private boolean mainSwitch;

    /**
     * 只校验功能开关
     */
    @Value("${miniapis.check.enabled}")
    private boolean enabled;

    @Before
    public void before() {
        //Mockito初始化
        MockitoAnnotations.initMocks(this);
        System.out.println("miniapis.enabled=" + mainSwitch);
    }

    @Test
    public void testSendEmail() throws Throwable {
        //是否会将testController加载到Spring application context
        assertThat(testController, notNullValue());
        assertEquals(true, enabled);

        //定义调用规则
        doReturn(null).when(this.aop).doCheck(null);
        //Mockito.verify(this.doCheckPoint, Mockito.times(1)).doCheck(null);
        //Mockito.doReturn(R.fail(300, "邮箱格式不正确！", "邮箱格式不正确！")).when(this.testController).sendEmail("123456");
        Mockito.when(this.testController.sendEmail("123456@qq.com")).thenReturn(R.success(200, "操作成功", "发送成功"));
        Mockito.when(this.testController.sendEmail("123456")).thenThrow(new IllegalArgumentException("邮箱格式不正确！"));

        //方法调用
        //1.成功的例子
        R<String> result = testController.sendEmail("123456@qq.com");
        assertEquals(result.getCode() + "", "200");
        assertEquals(result.getMsg(), "操作成功");
        assertEquals(result.getData(), "发送成功");

        //2.失败的例子
        Exception exception = assertThrows("断言抛出错误", IllegalArgumentException.class, () -> {
            //这里是实际的方法调用,用断言异常包裹
            //这里表示执行这一行代码肯定会抛出IllegalArgumentException类的异常
            testController.sendEmail("123456");
        });
        assertEquals("邮箱格式不正确！", exception.getMessage());
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



}
