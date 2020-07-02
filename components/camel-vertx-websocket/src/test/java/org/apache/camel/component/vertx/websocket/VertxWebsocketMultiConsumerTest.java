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
package org.apache.camel.component.vertx.websocket;

import java.util.stream.Stream;

import org.apache.camel.RoutesBuilder;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.junit.jupiter.api.Test;

public class VertxWebsocketMultiConsumerTest extends VertxWebSocketTestSupport {

    @Test
    public void testMultipleConsumersForSameHostAndPort() throws Exception {
        MockEndpoint mockEndpoint = getMockEndpoint("mock:result");
        mockEndpoint.expectedBodiesReceivedInAnyOrder("Hello A", "Hello B", "Hello C");

        Stream.of("A", "B", "C").forEach(body -> {
            template.sendBody("vertx-websocket:localhost:" + port + "/test/a", body);
        });

        mockEndpoint.assertIsSatisfied();
    }

    @Override
    protected RoutesBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                fromF("vertx-websocket:localhost:%d/test/a", port)
                        .setBody(simple("Hello ${body}"))
                        .to("mock:result");

                fromF("vertx-websocket:localhost:%d/test/b", port)
                        .setBody(simple("Hello ${body}"))
                        .to("mock:result");

                fromF("vertx-websocket:localhost:%d/test/c", port)
                        .setBody(simple("Hello ${body}"))
                        .to("mock:result");
            }
        };
    }
}
