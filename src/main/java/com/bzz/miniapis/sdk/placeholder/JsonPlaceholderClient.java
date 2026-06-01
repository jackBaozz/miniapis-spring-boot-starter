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

package com.bzz.miniapis.sdk.placeholder;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

/**
 * JSONPlaceholder 声明式客户端
 *
 * @author bzz
 */
@HttpExchange
public interface JsonPlaceholderClient {

    /**
     * 根据 ID 获取帖子
     */
    @GetExchange("/posts/{id}")
    Post getPost(@PathVariable("id") Integer id);

    /**
     * 获取所有帖子列表
     */
    @GetExchange("/posts")
    List<Post> getPosts();

    /**
     * 获取指定帖子的所有评论
     */
    @GetExchange("/posts/{id}/comments")
    List<Comment> getCommentsByPostId(@PathVariable("id") Integer id);
}
