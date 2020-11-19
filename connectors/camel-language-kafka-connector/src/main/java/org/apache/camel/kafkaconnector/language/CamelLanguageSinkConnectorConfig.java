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
package org.apache.camel.kafkaconnector.language;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelLanguageSinkConnectorConfig
        extends
            CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_LANGUAGE_PATH_LANGUAGE_NAME_CONF = "camel.sink.path.languageName";
    public static final String CAMEL_SINK_LANGUAGE_PATH_LANGUAGE_NAME_DOC = "Sets the name of the language to use One of: [bean] [constant] [exchangeProperty] [file] [groovy] [header] [javascript] [jsonpath] [mvel] [ognl] [] [ref] [simple] [spel] [sql] [terser] [tokenize] [xpath] [xquery] [xtokenize]";
    public static final String CAMEL_SINK_LANGUAGE_PATH_LANGUAGE_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_LANGUAGE_PATH_RESOURCE_URI_CONF = "camel.sink.path.resourceUri";
    public static final String CAMEL_SINK_LANGUAGE_PATH_RESOURCE_URI_DOC = "Path to the resource, or a reference to lookup a bean in the Registry to use as the resource";
    public static final String CAMEL_SINK_LANGUAGE_PATH_RESOURCE_URI_DEFAULT = null;
    public static final String CAMEL_SINK_LANGUAGE_ENDPOINT_ALLOW_CONTEXT_MAP_ALL_CONF = "camel.sink.endpoint.allowContextMapAll";
    public static final String CAMEL_SINK_LANGUAGE_ENDPOINT_ALLOW_CONTEXT_MAP_ALL_DOC = "Sets whether the context map should allow access to all details. By default only the message body and headers can be accessed. This option can be enabled for full access to the current Exchange and CamelContext. Doing so impose a potential security risk as this opens access to the full power of CamelContext API.";
    public static final Boolean CAMEL_SINK_LANGUAGE_ENDPOINT_ALLOW_CONTEXT_MAP_ALL_DEFAULT = false;
    public static final String CAMEL_SINK_LANGUAGE_ENDPOINT_BINARY_CONF = "camel.sink.endpoint.binary";
    public static final String CAMEL_SINK_LANGUAGE_ENDPOINT_BINARY_DOC = "Whether the script is binary content or text content. By default the script is read as text content (eg java.lang.String)";
    public static final Boolean CAMEL_SINK_LANGUAGE_ENDPOINT_BINARY_DEFAULT = false;
    public static final String CAMEL_SINK_LANGUAGE_ENDPOINT_CACHE_SCRIPT_CONF = "camel.sink.endpoint.cacheScript";
    public static final String CAMEL_SINK_LANGUAGE_ENDPOINT_CACHE_SCRIPT_DOC = "Whether to cache the compiled script and reuse Notice reusing the script can cause side effects from processing one Camel org.apache.camel.Exchange to the next org.apache.camel.Exchange.";
    public static final Boolean CAMEL_SINK_LANGUAGE_ENDPOINT_CACHE_SCRIPT_DEFAULT = false;
    public static final String CAMEL_SINK_LANGUAGE_ENDPOINT_CONTENT_CACHE_CONF = "camel.sink.endpoint.contentCache";
    public static final String CAMEL_SINK_LANGUAGE_ENDPOINT_CONTENT_CACHE_DOC = "Sets whether to use resource content cache or not";
    public static final Boolean CAMEL_SINK_LANGUAGE_ENDPOINT_CONTENT_CACHE_DEFAULT = true;
    public static final String CAMEL_SINK_LANGUAGE_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_LANGUAGE_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_LANGUAGE_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_LANGUAGE_ENDPOINT_SCRIPT_CONF = "camel.sink.endpoint.script";
    public static final String CAMEL_SINK_LANGUAGE_ENDPOINT_SCRIPT_DOC = "Sets the script to execute";
    public static final String CAMEL_SINK_LANGUAGE_ENDPOINT_SCRIPT_DEFAULT = null;
    public static final String CAMEL_SINK_LANGUAGE_ENDPOINT_TRANSFORM_CONF = "camel.sink.endpoint.transform";
    public static final String CAMEL_SINK_LANGUAGE_ENDPOINT_TRANSFORM_DOC = "Whether or not the result of the script should be used as message body. This options is default true.";
    public static final Boolean CAMEL_SINK_LANGUAGE_ENDPOINT_TRANSFORM_DEFAULT = true;
    public static final String CAMEL_SINK_LANGUAGE_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_LANGUAGE_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_LANGUAGE_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_LANGUAGE_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.language.lazyStartProducer";
    public static final String CAMEL_SINK_LANGUAGE_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_LANGUAGE_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_LANGUAGE_COMPONENT_AUTOWIRED_ENABLED_CONF = "camel.component.language.autowiredEnabled";
    public static final String CAMEL_SINK_LANGUAGE_COMPONENT_AUTOWIRED_ENABLED_DOC = "Whether autowiring is enabled. This is used for automatic autowiring options (the option must be marked as autowired) by looking up in the registry to find if there is a single instance of matching type, which then gets configured on the component. This can be used for automatic configuring JDBC data sources, JMS connection factories, AWS Clients, etc.";
    public static final Boolean CAMEL_SINK_LANGUAGE_COMPONENT_AUTOWIRED_ENABLED_DEFAULT = true;

    public CamelLanguageSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelLanguageSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_LANGUAGE_PATH_LANGUAGE_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_LANGUAGE_PATH_LANGUAGE_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_LANGUAGE_PATH_LANGUAGE_NAME_DOC);
        conf.define(CAMEL_SINK_LANGUAGE_PATH_RESOURCE_URI_CONF, ConfigDef.Type.STRING, CAMEL_SINK_LANGUAGE_PATH_RESOURCE_URI_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_LANGUAGE_PATH_RESOURCE_URI_DOC);
        conf.define(CAMEL_SINK_LANGUAGE_ENDPOINT_ALLOW_CONTEXT_MAP_ALL_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_LANGUAGE_ENDPOINT_ALLOW_CONTEXT_MAP_ALL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_LANGUAGE_ENDPOINT_ALLOW_CONTEXT_MAP_ALL_DOC);
        conf.define(CAMEL_SINK_LANGUAGE_ENDPOINT_BINARY_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_LANGUAGE_ENDPOINT_BINARY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_LANGUAGE_ENDPOINT_BINARY_DOC);
        conf.define(CAMEL_SINK_LANGUAGE_ENDPOINT_CACHE_SCRIPT_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_LANGUAGE_ENDPOINT_CACHE_SCRIPT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_LANGUAGE_ENDPOINT_CACHE_SCRIPT_DOC);
        conf.define(CAMEL_SINK_LANGUAGE_ENDPOINT_CONTENT_CACHE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_LANGUAGE_ENDPOINT_CONTENT_CACHE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_LANGUAGE_ENDPOINT_CONTENT_CACHE_DOC);
        conf.define(CAMEL_SINK_LANGUAGE_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_LANGUAGE_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_LANGUAGE_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_LANGUAGE_ENDPOINT_SCRIPT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_LANGUAGE_ENDPOINT_SCRIPT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_LANGUAGE_ENDPOINT_SCRIPT_DOC);
        conf.define(CAMEL_SINK_LANGUAGE_ENDPOINT_TRANSFORM_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_LANGUAGE_ENDPOINT_TRANSFORM_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_LANGUAGE_ENDPOINT_TRANSFORM_DOC);
        conf.define(CAMEL_SINK_LANGUAGE_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_LANGUAGE_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_LANGUAGE_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_LANGUAGE_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_LANGUAGE_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_LANGUAGE_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_LANGUAGE_COMPONENT_AUTOWIRED_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_LANGUAGE_COMPONENT_AUTOWIRED_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_LANGUAGE_COMPONENT_AUTOWIRED_ENABLED_DOC);
        return conf;
    }
}