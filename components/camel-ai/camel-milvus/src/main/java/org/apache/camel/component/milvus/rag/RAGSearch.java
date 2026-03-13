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
package org.apache.camel.component.milvus.rag;

import java.util.ArrayList;
import java.util.List;

import io.milvus.common.clientenum.ConsistencyLevelEnum;
import io.milvus.param.highlevel.dml.SearchSimpleParam;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.component.milvus.MilvusAction;
import org.apache.camel.component.milvus.MilvusHeaders;

public class RAGSearch implements Processor {

    private String collectionName = "rag_collection";
    private String outputFields = "content";
    private String limit = "10";
    private String filter;

    @SuppressWarnings("unchecked")
    @Override
    public void process(Exchange exchange) throws Exception {
        List<Float> queryEmbedding = exchange.getIn().getBody(List.class);
        long searchLimit = Long.parseLong(limit);

        List<String> fields = new ArrayList<>();
        for (String field : outputFields.split(",")) {
            String trimmed = field.trim();
            if (!trimmed.isEmpty()) {
                fields.add(trimmed);
            }
        }

        SearchSimpleParam.Builder builder = SearchSimpleParam.newBuilder()
                .withCollectionName(collectionName)
                .withVectors(queryEmbedding)
                .withLimit(searchLimit)
                .withOutputFields(fields)
                .withConsistencyLevel(ConsistencyLevelEnum.STRONG);

        if (filter != null && !filter.isEmpty()) {
            builder.withFilter(filter);
        }

        SearchSimpleParam param = builder.build();

        exchange.getIn().setBody(param);
        exchange.getIn().setHeader(MilvusHeaders.ACTION, MilvusAction.SEARCH);
    }

    public String getCollectionName() {
        return collectionName;
    }

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    public String getOutputFields() {
        return outputFields;
    }

    public void setOutputFields(String outputFields) {
        this.outputFields = outputFields;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }
}
