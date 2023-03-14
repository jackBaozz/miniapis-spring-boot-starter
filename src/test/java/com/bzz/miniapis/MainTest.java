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


import com.bzz.miniapis.aop.DoCheckPoint;
import com.bzz.miniapis.config.CheckAutoConfigure;
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

import java.util.LinkedList;
import java.util.List;

import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = {CheckAutoConfigure.class, DoCheckPoint.class, TestController.class, GlobalExceptionHandler.class})
@TestPropertySource(locations = "classpath:test.properties")
public class MainTest {

    @SpyBean
    private TestController testController;


    /**
     * 只校验功能开关
     */
    @Value("${miniapis.check.enabled}")
    private boolean enabled;


    @Value("${miniapis.enabled}")
    private boolean mainSwitch;

    @Before
    public void before() {
        //Mockito初始化
        MockitoAnnotations.initMocks(this);
        System.out.println("miniapis.enabled=" + mainSwitch);
    }

    @Test
    public void getInfo1() {
        System.out.println("miniapis.check.enabled=" + enabled);
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

        //真实调用
        //doCallRealMethod().when(this.testController.sendEmail("123456"));
        Mockito.when(this.testController.sendEmail("123456"))
                .thenReturn(R.success(500, "邮箱格式不正确！", "发送失败"));
        R<String> wrongR = testController.sendEmail("123456");
        assertEquals(wrongR.getCode() + "", "500");
        assertEquals(wrongR.getMsg(), "邮箱格式不正确！");
        assertEquals(wrongR.getData(), "发送失败");
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


    @Test
    public void mockTesk() {
        // mock creation 创建mock对象
        List mockedList = mock(List.class);

        //using mock object 使用mock对象
        mockedList.add("one");
        mockedList.add("two");
        mockedList.size();
        mockedList.clear();


        //verification 验证
        //验证上面的操作,一一对应
        verify(mockedList).add("one");
        verify(mockedList).add("two");
        verify(mockedList).size();
        verify(mockedList).clear();


        //如果上面的验证缺少,下面这个验证会抛出异常,表示有步骤缺少了验证verify
        verifyNoMoreInteractions(mockedList, description("有步骤缺少了验证verify"));


        List list = new LinkedList();
        List spy = spy(list);


        doReturn("foo").when(spy).get(0);
        //doReturn("bar").when(spy.get(1));
        when(spy.get(0)).thenReturn("foo");

    }


}
