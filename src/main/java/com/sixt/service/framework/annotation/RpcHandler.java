/**
 * Copyright 2016-2017 Sixt GmbH & Co. Autovermietung KG
 * Licensed under the Apache License, Version 2.0 (the "License"); you may 
 * not use this file except in compliance with the License. You may obtain a 
 * copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT 
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the 
 * License for the specific language governing permissions and limitations 
 * under the License.
 */

package com.sixt.service.framework.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * This annotation is used to annotate that a class is an RpcHandler. The framework
 * uses classpath scanning to find the RpcHandlers and registers them automatically.
 * Classes with this annotation should also implement ServiceMethodHandler
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface RpcHandler {

    /**
     * The name under which the handler will be registered
     */
    String value();
}

