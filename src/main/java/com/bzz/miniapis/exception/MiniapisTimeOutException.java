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
package com.bzz.miniapis.exception;

/**
 * 超时异常
 *
 * @author bzz
 */
public class MiniapisTimeOutException extends MiniapisException {

    private static final long serialVersionUID = 1L;

    public MiniapisTimeOutException(String desc) {
        super(MiniapisType.CLIENT_TIMEOUT, desc);
    }

    public MiniapisTimeOutException(Throwable t) {
        super(MiniapisType.CLIENT_TIMEOUT, t);
    }

    public MiniapisTimeOutException(String desc, Throwable t) {
        super(MiniapisType.CLIENT_TIMEOUT, desc, t);
    }

}
