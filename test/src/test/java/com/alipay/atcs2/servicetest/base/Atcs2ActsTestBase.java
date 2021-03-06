/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alipay.atcs2.servicetest.base;

import com.alipay.test.acts.template.ActsTestBase;

public class Atcs2ActsTestBase extends ActsTestBase{

    //add property
    static {
        System.setProperty("test_artifacts",
                "commons-pool-,commons-beanutils-,commons-dbcp-,guava-,ats-common-,cmmons-io-,atd-app-server-,cloning,objenesis,acts-common-util-,acts-common-dto,acts-core-,itest-common-lang-");
    }
}

 
