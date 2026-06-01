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
import com.bzz.miniapis.sdk.placeholder.Comment;
import com.bzz.miniapis.sdk.placeholder.JsonPlaceholderClient;
import com.bzz.miniapis.sdk.placeholder.Post;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = {MiniapisAutoConfiguration.class})
@TestPropertySource(locations = "classpath:test.properties")
public class PlaceholderTest {

    @Autowired
    private JsonPlaceholderClient placeholderClient;

    @Test
    public void testGetPost() {
        assertNotNull(placeholderClient);
        Post post = placeholderClient.getPost(1);
        assertNotNull(post);
        assertEquals(1, post.getId());
        assertNotNull(post.getTitle());
        assertNotNull(post.getBody());
        System.out.println("JSONPlaceholder getPost(1) = " + post);
    }

    @Test
    public void testGetPosts() {
        assertNotNull(placeholderClient);
        List<Post> posts = placeholderClient.getPosts();
        assertNotNull(posts);
        assertFalse(posts.isEmpty());
        assertTrue(posts.size() >= 100);
        System.out.println("JSONPlaceholder getPosts() size = " + posts.size());
    }

    @Test
    public void testGetComments() {
        assertNotNull(placeholderClient);
        List<Comment> comments = placeholderClient.getCommentsByPostId(1);
        assertNotNull(comments);
        assertFalse(comments.isEmpty());
        System.out.println("JSONPlaceholder getCommentsByPostId(1) size = " + comments.size());
    }
}
