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
package org.apache.camel.kafkaconnector.stomp;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelStompSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_STOMP_PATH_DESTINATION_CONF = "camel.source.path.destination";
    public static final String CAMEL_SOURCE_STOMP_PATH_DESTINATION_DOC = "Name of the queue";
    public static final String CAMEL_SOURCE_STOMP_PATH_DESTINATION_DEFAULT = null;
    public static final String CAMEL_SOURCE_STOMP_ENDPOINT_BROKER_URLCONF = "camel.source.endpoint.brokerURL";
    public static final String CAMEL_SOURCE_STOMP_ENDPOINT_BROKER_URLDOC = "The URI of the Stomp broker to connect to";
    public static final String CAMEL_SOURCE_STOMP_ENDPOINT_BROKER_URLDEFAULT = "tcp://localhost:61613";
    public static final String CAMEL_SOURCE_STOMP_ENDPOINT_CUSTOM_HEADERS_CONF = "camel.source.endpoint.customHeaders";
    public static final String CAMEL_SOURCE_STOMP_ENDPOINT_CUSTOM_HEADERS_DOC = "To set custom headers";
    public static final String CAMEL_SOURCE_STOMP_ENDPOINT_CUSTOM_HEADERS_DEFAULT = null;
    public static final String CAMEL_SOURCE_STOMP_ENDPOINT_HOST_CONF = "camel.source.endpoint.host";
    public static final String CAMEL_SOURCE_STOMP_ENDPOINT_HOST_DOC = "The virtual host name";
    public static final String CAMEL_SOURCE_STOMP_ENDPOINT_HOST_DEFAULT = null;
    public static final String CAMEL_SOURCE_STOMP_ENDPOINT_VERSION_CONF = "camel.source.endpoint.version";
    public static final String CAMEL_SOURCE_STOMP_ENDPOINT_VERSION_DOC = "The stomp version (1.1, or 1.2)";
    public static final String CAMEL_SOURCE_STOMP_ENDPOINT_VERSION_DEFAULT = null;
    public static final String CAMEL_SOURCE_STOMP_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF = "camel.source.endpoint.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_STOMP_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_STOMP_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_STOMP_ENDPOINT_EXCEPTION_HANDLER_CONF = "camel.source.endpoint.exceptionHandler";
    public static final String CAMEL_SOURCE_STOMP_ENDPOINT_EXCEPTION_HANDLER_DOC = "To let the consumer use a custom ExceptionHandler. Notice if the option bridgeErrorHandler is enabled then this option is not in use. By default the consumer will deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final String CAMEL_SOURCE_STOMP_ENDPOINT_EXCEPTION_HANDLER_DEFAULT = null;
    public static final String CAMEL_SOURCE_STOMP_ENDPOINT_EXCHANGE_PATTERN_CONF = "camel.source.endpoint.exchangePattern";
    public static final String CAMEL_SOURCE_STOMP_ENDPOINT_EXCHANGE_PATTERN_DOC = "Sets the exchange pattern when the consumer creates an exchange. One of: [InOnly] [InOut] [InOptionalOut]";
    public static final String CAMEL_SOURCE_STOMP_ENDPOINT_EXCHANGE_PATTERN_DEFAULT = null;
    public static final String CAMEL_SOURCE_STOMP_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.source.endpoint.basicPropertyBinding";
    public static final String CAMEL_SOURCE_STOMP_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_STOMP_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SOURCE_STOMP_ENDPOINT_HEADER_FILTER_STRATEGY_CONF = "camel.source.endpoint.headerFilterStrategy";
    public static final String CAMEL_SOURCE_STOMP_ENDPOINT_HEADER_FILTER_STRATEGY_DOC = "To use a custom HeaderFilterStrategy to filter header to and from Camel message.";
    public static final String CAMEL_SOURCE_STOMP_ENDPOINT_HEADER_FILTER_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SOURCE_STOMP_ENDPOINT_SYNCHRONOUS_CONF = "camel.source.endpoint.synchronous";
    public static final String CAMEL_SOURCE_STOMP_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SOURCE_STOMP_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SOURCE_STOMP_ENDPOINT_LOGIN_CONF = "camel.source.endpoint.login";
    public static final String CAMEL_SOURCE_STOMP_ENDPOINT_LOGIN_DOC = "The username";
    public static final String CAMEL_SOURCE_STOMP_ENDPOINT_LOGIN_DEFAULT = null;
    public static final String CAMEL_SOURCE_STOMP_ENDPOINT_PASSCODE_CONF = "camel.source.endpoint.passcode";
    public static final String CAMEL_SOURCE_STOMP_ENDPOINT_PASSCODE_DOC = "The password";
    public static final String CAMEL_SOURCE_STOMP_ENDPOINT_PASSCODE_DEFAULT = null;
    public static final String CAMEL_SOURCE_STOMP_ENDPOINT_SSL_CONTEXT_PARAMETERS_CONF = "camel.source.endpoint.sslContextParameters";
    public static final String CAMEL_SOURCE_STOMP_ENDPOINT_SSL_CONTEXT_PARAMETERS_DOC = "To configure security using SSLContextParameters";
    public static final String CAMEL_SOURCE_STOMP_ENDPOINT_SSL_CONTEXT_PARAMETERS_DEFAULT = null;
    public static final String CAMEL_SOURCE_STOMP_COMPONENT_BROKER_URLCONF = "camel.component.stomp.brokerURL";
    public static final String CAMEL_SOURCE_STOMP_COMPONENT_BROKER_URLDOC = "The URI of the Stomp broker to connect to";
    public static final String CAMEL_SOURCE_STOMP_COMPONENT_BROKER_URLDEFAULT = "tcp://localhost:61613";
    public static final String CAMEL_SOURCE_STOMP_COMPONENT_CUSTOM_HEADERS_CONF = "camel.component.stomp.customHeaders";
    public static final String CAMEL_SOURCE_STOMP_COMPONENT_CUSTOM_HEADERS_DOC = "To set custom headers";
    public static final String CAMEL_SOURCE_STOMP_COMPONENT_CUSTOM_HEADERS_DEFAULT = null;
    public static final String CAMEL_SOURCE_STOMP_COMPONENT_HOST_CONF = "camel.component.stomp.host";
    public static final String CAMEL_SOURCE_STOMP_COMPONENT_HOST_DOC = "The virtual host name";
    public static final String CAMEL_SOURCE_STOMP_COMPONENT_HOST_DEFAULT = null;
    public static final String CAMEL_SOURCE_STOMP_COMPONENT_VERSION_CONF = "camel.component.stomp.version";
    public static final String CAMEL_SOURCE_STOMP_COMPONENT_VERSION_DOC = "The stomp version (1.1, or 1.2)";
    public static final String CAMEL_SOURCE_STOMP_COMPONENT_VERSION_DEFAULT = null;
    public static final String CAMEL_SOURCE_STOMP_COMPONENT_BRIDGE_ERROR_HANDLER_CONF = "camel.component.stomp.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_STOMP_COMPONENT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_STOMP_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_STOMP_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.stomp.basicPropertyBinding";
    public static final String CAMEL_SOURCE_STOMP_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_STOMP_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SOURCE_STOMP_COMPONENT_CONFIGURATION_CONF = "camel.component.stomp.configuration";
    public static final String CAMEL_SOURCE_STOMP_COMPONENT_CONFIGURATION_DOC = "Component configuration.";
    public static final String CAMEL_SOURCE_STOMP_COMPONENT_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SOURCE_STOMP_COMPONENT_HEADER_FILTER_STRATEGY_CONF = "camel.component.stomp.headerFilterStrategy";
    public static final String CAMEL_SOURCE_STOMP_COMPONENT_HEADER_FILTER_STRATEGY_DOC = "To use a custom org.apache.camel.spi.HeaderFilterStrategy to filter header to and from Camel message.";
    public static final String CAMEL_SOURCE_STOMP_COMPONENT_HEADER_FILTER_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SOURCE_STOMP_COMPONENT_LOGIN_CONF = "camel.component.stomp.login";
    public static final String CAMEL_SOURCE_STOMP_COMPONENT_LOGIN_DOC = "The username";
    public static final String CAMEL_SOURCE_STOMP_COMPONENT_LOGIN_DEFAULT = null;
    public static final String CAMEL_SOURCE_STOMP_COMPONENT_PASSCODE_CONF = "camel.component.stomp.passcode";
    public static final String CAMEL_SOURCE_STOMP_COMPONENT_PASSCODE_DOC = "The password";
    public static final String CAMEL_SOURCE_STOMP_COMPONENT_PASSCODE_DEFAULT = null;
    public static final String CAMEL_SOURCE_STOMP_COMPONENT_SSL_CONTEXT_PARAMETERS_CONF = "camel.component.stomp.sslContextParameters";
    public static final String CAMEL_SOURCE_STOMP_COMPONENT_SSL_CONTEXT_PARAMETERS_DOC = "To configure security using SSLContextParameters";
    public static final String CAMEL_SOURCE_STOMP_COMPONENT_SSL_CONTEXT_PARAMETERS_DEFAULT = null;
    public static final String CAMEL_SOURCE_STOMP_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_CONF = "camel.component.stomp.useGlobalSslContextParameters";
    public static final String CAMEL_SOURCE_STOMP_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DOC = "Enable usage of global SSL context parameters.";
    public static final Boolean CAMEL_SOURCE_STOMP_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DEFAULT = false;

    public CamelStompSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelStompSourceConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_STOMP_PATH_DESTINATION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_STOMP_PATH_DESTINATION_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_STOMP_PATH_DESTINATION_DOC);
        conf.define(CAMEL_SOURCE_STOMP_ENDPOINT_BROKER_URLCONF, ConfigDef.Type.STRING, CAMEL_SOURCE_STOMP_ENDPOINT_BROKER_URLDEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_STOMP_ENDPOINT_BROKER_URLDOC);
        conf.define(CAMEL_SOURCE_STOMP_ENDPOINT_CUSTOM_HEADERS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_STOMP_ENDPOINT_CUSTOM_HEADERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_STOMP_ENDPOINT_CUSTOM_HEADERS_DOC);
        conf.define(CAMEL_SOURCE_STOMP_ENDPOINT_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_STOMP_ENDPOINT_HOST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_STOMP_ENDPOINT_HOST_DOC);
        conf.define(CAMEL_SOURCE_STOMP_ENDPOINT_VERSION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_STOMP_ENDPOINT_VERSION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_STOMP_ENDPOINT_VERSION_DOC);
        conf.define(CAMEL_SOURCE_STOMP_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_STOMP_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_STOMP_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_STOMP_ENDPOINT_EXCEPTION_HANDLER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_STOMP_ENDPOINT_EXCEPTION_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_STOMP_ENDPOINT_EXCEPTION_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_STOMP_ENDPOINT_EXCHANGE_PATTERN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_STOMP_ENDPOINT_EXCHANGE_PATTERN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_STOMP_ENDPOINT_EXCHANGE_PATTERN_DOC);
        conf.define(CAMEL_SOURCE_STOMP_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_STOMP_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_STOMP_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SOURCE_STOMP_ENDPOINT_HEADER_FILTER_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_STOMP_ENDPOINT_HEADER_FILTER_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_STOMP_ENDPOINT_HEADER_FILTER_STRATEGY_DOC);
        conf.define(CAMEL_SOURCE_STOMP_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_STOMP_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_STOMP_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SOURCE_STOMP_ENDPOINT_LOGIN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_STOMP_ENDPOINT_LOGIN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_STOMP_ENDPOINT_LOGIN_DOC);
        conf.define(CAMEL_SOURCE_STOMP_ENDPOINT_PASSCODE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_STOMP_ENDPOINT_PASSCODE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_STOMP_ENDPOINT_PASSCODE_DOC);
        conf.define(CAMEL_SOURCE_STOMP_ENDPOINT_SSL_CONTEXT_PARAMETERS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_STOMP_ENDPOINT_SSL_CONTEXT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_STOMP_ENDPOINT_SSL_CONTEXT_PARAMETERS_DOC);
        conf.define(CAMEL_SOURCE_STOMP_COMPONENT_BROKER_URLCONF, ConfigDef.Type.STRING, CAMEL_SOURCE_STOMP_COMPONENT_BROKER_URLDEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_STOMP_COMPONENT_BROKER_URLDOC);
        conf.define(CAMEL_SOURCE_STOMP_COMPONENT_CUSTOM_HEADERS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_STOMP_COMPONENT_CUSTOM_HEADERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_STOMP_COMPONENT_CUSTOM_HEADERS_DOC);
        conf.define(CAMEL_SOURCE_STOMP_COMPONENT_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_STOMP_COMPONENT_HOST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_STOMP_COMPONENT_HOST_DOC);
        conf.define(CAMEL_SOURCE_STOMP_COMPONENT_VERSION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_STOMP_COMPONENT_VERSION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_STOMP_COMPONENT_VERSION_DOC);
        conf.define(CAMEL_SOURCE_STOMP_COMPONENT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_STOMP_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_STOMP_COMPONENT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_STOMP_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_STOMP_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.LOW, CAMEL_SOURCE_STOMP_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SOURCE_STOMP_COMPONENT_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_STOMP_COMPONENT_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_STOMP_COMPONENT_CONFIGURATION_DOC);
        conf.define(CAMEL_SOURCE_STOMP_COMPONENT_HEADER_FILTER_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_STOMP_COMPONENT_HEADER_FILTER_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_STOMP_COMPONENT_HEADER_FILTER_STRATEGY_DOC);
        conf.define(CAMEL_SOURCE_STOMP_COMPONENT_LOGIN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_STOMP_COMPONENT_LOGIN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_STOMP_COMPONENT_LOGIN_DOC);
        conf.define(CAMEL_SOURCE_STOMP_COMPONENT_PASSCODE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_STOMP_COMPONENT_PASSCODE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_STOMP_COMPONENT_PASSCODE_DOC);
        conf.define(CAMEL_SOURCE_STOMP_COMPONENT_SSL_CONTEXT_PARAMETERS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_STOMP_COMPONENT_SSL_CONTEXT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_STOMP_COMPONENT_SSL_CONTEXT_PARAMETERS_DOC);
        conf.define(CAMEL_SOURCE_STOMP_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_STOMP_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_STOMP_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DOC);
        return conf;
    }
}