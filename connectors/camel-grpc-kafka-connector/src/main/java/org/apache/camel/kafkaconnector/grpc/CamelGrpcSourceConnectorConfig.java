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
package org.apache.camel.kafkaconnector.grpc;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelGrpcSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_GRPC_PATH_HOST_CONF = "camel.source.path.host";
    public static final String CAMEL_SOURCE_GRPC_PATH_HOST_DOC = "The gRPC server host name. This is localhost or 0.0.0.0 when being a consumer or remote server host name when using producer.";
    public static final String CAMEL_SOURCE_GRPC_PATH_HOST_DEFAULT = null;
    public static final String CAMEL_SOURCE_GRPC_PATH_PORT_CONF = "camel.source.path.port";
    public static final String CAMEL_SOURCE_GRPC_PATH_PORT_DOC = "The gRPC local or remote server port";
    public static final Integer CAMEL_SOURCE_GRPC_PATH_PORT_DEFAULT = null;
    public static final String CAMEL_SOURCE_GRPC_PATH_SERVICE_CONF = "camel.source.path.service";
    public static final String CAMEL_SOURCE_GRPC_PATH_SERVICE_DOC = "Fully qualified service name from the protocol buffer descriptor file (package dot service definition name)";
    public static final String CAMEL_SOURCE_GRPC_PATH_SERVICE_DEFAULT = null;
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_AUTO_DISCOVER_CLIENT_INTERCEPTORS_CONF = "camel.source.endpoint.autoDiscoverClientInterceptors";
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_AUTO_DISCOVER_CLIENT_INTERCEPTORS_DOC = "Setting the autoDiscoverClientInterceptors mechanism, if true, the component will look for a ClientInterceptor instance in the registry automatically otherwise it will skip that checking.";
    public static final Boolean CAMEL_SOURCE_GRPC_ENDPOINT_AUTO_DISCOVER_CLIENT_INTERCEPTORS_DEFAULT = true;
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_FLOW_CONTROL_WINDOW_CONF = "camel.source.endpoint.flowControlWindow";
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_FLOW_CONTROL_WINDOW_DOC = "The HTTP/2 flow control window size (MiB)";
    public static final Integer CAMEL_SOURCE_GRPC_ENDPOINT_FLOW_CONTROL_WINDOW_DEFAULT = 1048576;
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_MAX_MESSAGE_SIZE_CONF = "camel.source.endpoint.maxMessageSize";
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_MAX_MESSAGE_SIZE_DOC = "The maximum message size allowed to be received/sent (MiB)";
    public static final Integer CAMEL_SOURCE_GRPC_ENDPOINT_MAX_MESSAGE_SIZE_DEFAULT = 4194304;
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF = "camel.source.endpoint.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_GRPC_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_CONSUMER_STRATEGY_CONF = "camel.source.endpoint.consumerStrategy";
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_CONSUMER_STRATEGY_DOC = "This option specifies the top-level strategy for processing service requests and responses in streaming mode. If an aggregation strategy is selected, all requests will be accumulated in the list, then transferred to the flow, and the accumulated responses will be sent to the sender. If a propagation strategy is selected, request is sent to the stream, and the response will be immediately sent back to the sender. One of: [AGGREGATION] [PROPAGATION]";
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_CONSUMER_STRATEGY_DEFAULT = "PROPAGATION";
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_FORWARD_ON_COMPLETED_CONF = "camel.source.endpoint.forwardOnCompleted";
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_FORWARD_ON_COMPLETED_DOC = "Determines if onCompleted events should be pushed to the Camel route.";
    public static final Boolean CAMEL_SOURCE_GRPC_ENDPOINT_FORWARD_ON_COMPLETED_DEFAULT = false;
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_FORWARD_ON_ERROR_CONF = "camel.source.endpoint.forwardOnError";
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_FORWARD_ON_ERROR_DOC = "Determines if onError events should be pushed to the Camel route. Exceptions will be set as message body.";
    public static final Boolean CAMEL_SOURCE_GRPC_ENDPOINT_FORWARD_ON_ERROR_DEFAULT = false;
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_MAX_CONCURRENT_CALLS_PER_CONNECTION_CONF = "camel.source.endpoint.maxConcurrentCallsPerConnection";
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_MAX_CONCURRENT_CALLS_PER_CONNECTION_DOC = "The maximum number of concurrent calls permitted for each incoming server connection";
    public static final Integer CAMEL_SOURCE_GRPC_ENDPOINT_MAX_CONCURRENT_CALLS_PER_CONNECTION_DEFAULT = 2147483647;
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_ROUTE_CONTROLLED_STREAM_OBSERVER_CONF = "camel.source.endpoint.routeControlledStreamObserver";
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_ROUTE_CONTROLLED_STREAM_OBSERVER_DOC = "Lets the route to take control over stream observer. If this value is set to true, then the response observer of gRPC call will be set with the name GrpcConstants.GRPC_RESPONSE_OBSERVER in the Exchange object. Please note that the stream observer's onNext(), onError(), onCompleted() methods should be called in the route.";
    public static final Boolean CAMEL_SOURCE_GRPC_ENDPOINT_ROUTE_CONTROLLED_STREAM_OBSERVER_DEFAULT = false;
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_EXCEPTION_HANDLER_CONF = "camel.source.endpoint.exceptionHandler";
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_EXCEPTION_HANDLER_DOC = "To let the consumer use a custom ExceptionHandler. Notice if the option bridgeErrorHandler is enabled then this option is not in use. By default the consumer will deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_EXCEPTION_HANDLER_DEFAULT = null;
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_EXCHANGE_PATTERN_CONF = "camel.source.endpoint.exchangePattern";
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_EXCHANGE_PATTERN_DOC = "Sets the exchange pattern when the consumer creates an exchange. One of: [InOnly] [InOut] [InOptionalOut]";
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_EXCHANGE_PATTERN_DEFAULT = null;
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_SYNCHRONOUS_CONF = "camel.source.endpoint.synchronous";
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SOURCE_GRPC_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_AUTHENTICATION_TYPE_CONF = "camel.source.endpoint.authenticationType";
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_AUTHENTICATION_TYPE_DOC = "Authentication method type in advance to the SSL/TLS negotiation One of: [NONE] [GOOGLE] [JWT]";
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_AUTHENTICATION_TYPE_DEFAULT = "NONE";
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_JWT_ALGORITHM_CONF = "camel.source.endpoint.jwtAlgorithm";
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_JWT_ALGORITHM_DOC = "JSON Web Token sign algorithm One of: [HMAC256] [HMAC384] [HMAC512]";
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_JWT_ALGORITHM_DEFAULT = "HMAC256";
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_JWT_ISSUER_CONF = "camel.source.endpoint.jwtIssuer";
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_JWT_ISSUER_DOC = "JSON Web Token issuer";
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_JWT_ISSUER_DEFAULT = null;
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_JWT_SECRET_CONF = "camel.source.endpoint.jwtSecret";
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_JWT_SECRET_DOC = "JSON Web Token secret";
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_JWT_SECRET_DEFAULT = null;
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_JWT_SUBJECT_CONF = "camel.source.endpoint.jwtSubject";
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_JWT_SUBJECT_DOC = "JSON Web Token subject";
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_JWT_SUBJECT_DEFAULT = null;
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_KEY_CERT_CHAIN_RESOURCE_CONF = "camel.source.endpoint.keyCertChainResource";
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_KEY_CERT_CHAIN_RESOURCE_DOC = "The X.509 certificate chain file resource in PEM format link";
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_KEY_CERT_CHAIN_RESOURCE_DEFAULT = null;
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_KEY_PASSWORD_CONF = "camel.source.endpoint.keyPassword";
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_KEY_PASSWORD_DOC = "The PKCS#8 private key file password";
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_KEY_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_KEY_RESOURCE_CONF = "camel.source.endpoint.keyResource";
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_KEY_RESOURCE_DOC = "The PKCS#8 private key file resource in PEM format link";
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_KEY_RESOURCE_DEFAULT = null;
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_NEGOTIATION_TYPE_CONF = "camel.source.endpoint.negotiationType";
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_NEGOTIATION_TYPE_DOC = "Identifies the security negotiation type used for HTTP/2 communication One of: [TLS] [PLAINTEXT_UPGRADE] [PLAINTEXT]";
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_NEGOTIATION_TYPE_DEFAULT = "PLAINTEXT";
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_SERVICE_ACCOUNT_RESOURCE_CONF = "camel.source.endpoint.serviceAccountResource";
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_SERVICE_ACCOUNT_RESOURCE_DOC = "Service Account key file in JSON format resource link supported by the Google Cloud SDK";
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_SERVICE_ACCOUNT_RESOURCE_DEFAULT = null;
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_TRUST_CERT_COLLECTION_RESOURCE_CONF = "camel.source.endpoint.trustCertCollectionResource";
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_TRUST_CERT_COLLECTION_RESOURCE_DOC = "The trusted certificates collection file resource in PEM format for verifying the remote endpoint's certificate";
    public static final String CAMEL_SOURCE_GRPC_ENDPOINT_TRUST_CERT_COLLECTION_RESOURCE_DEFAULT = null;
    public static final String CAMEL_SOURCE_GRPC_COMPONENT_BRIDGE_ERROR_HANDLER_CONF = "camel.component.grpc.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_GRPC_COMPONENT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_GRPC_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_GRPC_COMPONENT_AUTOWIRED_ENABLED_CONF = "camel.component.grpc.autowiredEnabled";
    public static final String CAMEL_SOURCE_GRPC_COMPONENT_AUTOWIRED_ENABLED_DOC = "Whether autowiring is enabled. This is used for automatic autowiring options (the option must be marked as autowired) by looking up in the registry to find if there is a single instance of matching type, which then gets configured on the component. This can be used for automatic configuring JDBC data sources, JMS connection factories, AWS Clients, etc.";
    public static final Boolean CAMEL_SOURCE_GRPC_COMPONENT_AUTOWIRED_ENABLED_DEFAULT = true;

    public CamelGrpcSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelGrpcSourceConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_GRPC_PATH_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_GRPC_PATH_HOST_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_GRPC_PATH_HOST_DOC);
        conf.define(CAMEL_SOURCE_GRPC_PATH_PORT_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_GRPC_PATH_PORT_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_GRPC_PATH_PORT_DOC);
        conf.define(CAMEL_SOURCE_GRPC_PATH_SERVICE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_GRPC_PATH_SERVICE_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_GRPC_PATH_SERVICE_DOC);
        conf.define(CAMEL_SOURCE_GRPC_ENDPOINT_AUTO_DISCOVER_CLIENT_INTERCEPTORS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_GRPC_ENDPOINT_AUTO_DISCOVER_CLIENT_INTERCEPTORS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GRPC_ENDPOINT_AUTO_DISCOVER_CLIENT_INTERCEPTORS_DOC);
        conf.define(CAMEL_SOURCE_GRPC_ENDPOINT_FLOW_CONTROL_WINDOW_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_GRPC_ENDPOINT_FLOW_CONTROL_WINDOW_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GRPC_ENDPOINT_FLOW_CONTROL_WINDOW_DOC);
        conf.define(CAMEL_SOURCE_GRPC_ENDPOINT_MAX_MESSAGE_SIZE_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_GRPC_ENDPOINT_MAX_MESSAGE_SIZE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GRPC_ENDPOINT_MAX_MESSAGE_SIZE_DOC);
        conf.define(CAMEL_SOURCE_GRPC_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_GRPC_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GRPC_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_GRPC_ENDPOINT_CONSUMER_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_GRPC_ENDPOINT_CONSUMER_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GRPC_ENDPOINT_CONSUMER_STRATEGY_DOC);
        conf.define(CAMEL_SOURCE_GRPC_ENDPOINT_FORWARD_ON_COMPLETED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_GRPC_ENDPOINT_FORWARD_ON_COMPLETED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GRPC_ENDPOINT_FORWARD_ON_COMPLETED_DOC);
        conf.define(CAMEL_SOURCE_GRPC_ENDPOINT_FORWARD_ON_ERROR_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_GRPC_ENDPOINT_FORWARD_ON_ERROR_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GRPC_ENDPOINT_FORWARD_ON_ERROR_DOC);
        conf.define(CAMEL_SOURCE_GRPC_ENDPOINT_MAX_CONCURRENT_CALLS_PER_CONNECTION_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_GRPC_ENDPOINT_MAX_CONCURRENT_CALLS_PER_CONNECTION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GRPC_ENDPOINT_MAX_CONCURRENT_CALLS_PER_CONNECTION_DOC);
        conf.define(CAMEL_SOURCE_GRPC_ENDPOINT_ROUTE_CONTROLLED_STREAM_OBSERVER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_GRPC_ENDPOINT_ROUTE_CONTROLLED_STREAM_OBSERVER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GRPC_ENDPOINT_ROUTE_CONTROLLED_STREAM_OBSERVER_DOC);
        conf.define(CAMEL_SOURCE_GRPC_ENDPOINT_EXCEPTION_HANDLER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_GRPC_ENDPOINT_EXCEPTION_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GRPC_ENDPOINT_EXCEPTION_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_GRPC_ENDPOINT_EXCHANGE_PATTERN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_GRPC_ENDPOINT_EXCHANGE_PATTERN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GRPC_ENDPOINT_EXCHANGE_PATTERN_DOC);
        conf.define(CAMEL_SOURCE_GRPC_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_GRPC_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GRPC_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SOURCE_GRPC_ENDPOINT_AUTHENTICATION_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_GRPC_ENDPOINT_AUTHENTICATION_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GRPC_ENDPOINT_AUTHENTICATION_TYPE_DOC);
        conf.define(CAMEL_SOURCE_GRPC_ENDPOINT_JWT_ALGORITHM_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_GRPC_ENDPOINT_JWT_ALGORITHM_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GRPC_ENDPOINT_JWT_ALGORITHM_DOC);
        conf.define(CAMEL_SOURCE_GRPC_ENDPOINT_JWT_ISSUER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_GRPC_ENDPOINT_JWT_ISSUER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GRPC_ENDPOINT_JWT_ISSUER_DOC);
        conf.define(CAMEL_SOURCE_GRPC_ENDPOINT_JWT_SECRET_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_GRPC_ENDPOINT_JWT_SECRET_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GRPC_ENDPOINT_JWT_SECRET_DOC);
        conf.define(CAMEL_SOURCE_GRPC_ENDPOINT_JWT_SUBJECT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_GRPC_ENDPOINT_JWT_SUBJECT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GRPC_ENDPOINT_JWT_SUBJECT_DOC);
        conf.define(CAMEL_SOURCE_GRPC_ENDPOINT_KEY_CERT_CHAIN_RESOURCE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_GRPC_ENDPOINT_KEY_CERT_CHAIN_RESOURCE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GRPC_ENDPOINT_KEY_CERT_CHAIN_RESOURCE_DOC);
        conf.define(CAMEL_SOURCE_GRPC_ENDPOINT_KEY_PASSWORD_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_GRPC_ENDPOINT_KEY_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GRPC_ENDPOINT_KEY_PASSWORD_DOC);
        conf.define(CAMEL_SOURCE_GRPC_ENDPOINT_KEY_RESOURCE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_GRPC_ENDPOINT_KEY_RESOURCE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GRPC_ENDPOINT_KEY_RESOURCE_DOC);
        conf.define(CAMEL_SOURCE_GRPC_ENDPOINT_NEGOTIATION_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_GRPC_ENDPOINT_NEGOTIATION_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GRPC_ENDPOINT_NEGOTIATION_TYPE_DOC);
        conf.define(CAMEL_SOURCE_GRPC_ENDPOINT_SERVICE_ACCOUNT_RESOURCE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_GRPC_ENDPOINT_SERVICE_ACCOUNT_RESOURCE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GRPC_ENDPOINT_SERVICE_ACCOUNT_RESOURCE_DOC);
        conf.define(CAMEL_SOURCE_GRPC_ENDPOINT_TRUST_CERT_COLLECTION_RESOURCE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_GRPC_ENDPOINT_TRUST_CERT_COLLECTION_RESOURCE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GRPC_ENDPOINT_TRUST_CERT_COLLECTION_RESOURCE_DOC);
        conf.define(CAMEL_SOURCE_GRPC_COMPONENT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_GRPC_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GRPC_COMPONENT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_GRPC_COMPONENT_AUTOWIRED_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_GRPC_COMPONENT_AUTOWIRED_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GRPC_COMPONENT_AUTOWIRED_ENABLED_DOC);
        return conf;
    }
}