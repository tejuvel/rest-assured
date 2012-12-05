/*
 * Copyright 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.jayway.restassured.builder;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ResponseSpecBuilderTest {
    @Rule
    public ExpectedException exception = ExpectedException.none();


    @Test public void
    response_spec_doesnt_throw_NPE_when_logging_all_after_creation() {
        exception.expect(IllegalStateException.class);
        exception.expectMessage("Cannot configure logging since request specification is not defined. You may be misusing the API.");

        new ResponseSpecBuilder().build().log().all(true);
    }
}
