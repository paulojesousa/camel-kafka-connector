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
package org.apache.camel.kafkaconnector.kubernetesjob;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelKubernetesjobSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_KUBERNETESJOB_PATH_MASTER_URL_CONF = "camel.source.path.masterUrl";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_PATH_MASTER_URL_DOC = "Kubernetes Master url";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_PATH_MASTER_URL_DEFAULT = null;
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_API_VERSION_CONF = "camel.source.endpoint.apiVersion";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_API_VERSION_DOC = "The Kubernetes API Version to use";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_API_VERSION_DEFAULT = null;
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_DNS_DOMAIN_CONF = "camel.source.endpoint.dnsDomain";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_DNS_DOMAIN_DOC = "The dns domain, used for ServiceCall EIP";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_DNS_DOMAIN_DEFAULT = null;
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_KUBERNETES_CLIENT_CONF = "camel.source.endpoint.kubernetesClient";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_KUBERNETES_CLIENT_DOC = "Default KubernetesClient to use if provided";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_KUBERNETES_CLIENT_DEFAULT = null;
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_PORT_NAME_CONF = "camel.source.endpoint.portName";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_PORT_NAME_DOC = "The port name, used for ServiceCall EIP";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_PORT_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_PORT_PROTOCOL_CONF = "camel.source.endpoint.portProtocol";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_PORT_PROTOCOL_DOC = "The port protocol, used for ServiceCall EIP";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_PORT_PROTOCOL_DEFAULT = "tcp";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF = "camel.source.endpoint.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CRD_GROUP_CONF = "camel.source.endpoint.crdGroup";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CRD_GROUP_DOC = "The Consumer CRD Resource Group we would like to watch";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CRD_GROUP_DEFAULT = null;
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CRD_NAME_CONF = "camel.source.endpoint.crdName";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CRD_NAME_DOC = "The Consumer CRD Resource name we would like to watch";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CRD_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CRD_PLURAL_CONF = "camel.source.endpoint.crdPlural";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CRD_PLURAL_DOC = "The Consumer CRD Resource Plural we would like to watch";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CRD_PLURAL_DEFAULT = null;
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CRD_SCOPE_CONF = "camel.source.endpoint.crdScope";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CRD_SCOPE_DOC = "The Consumer CRD Resource Scope we would like to watch";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CRD_SCOPE_DEFAULT = null;
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CRD_VERSION_CONF = "camel.source.endpoint.crdVersion";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CRD_VERSION_DOC = "The Consumer CRD Resource Version we would like to watch";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CRD_VERSION_DEFAULT = null;
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_LABEL_KEY_CONF = "camel.source.endpoint.labelKey";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_LABEL_KEY_DOC = "The Consumer Label key when watching at some resources";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_LABEL_KEY_DEFAULT = null;
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_LABEL_VALUE_CONF = "camel.source.endpoint.labelValue";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_LABEL_VALUE_DOC = "The Consumer Label value when watching at some resources";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_LABEL_VALUE_DEFAULT = null;
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_NAMESPACE_CONF = "camel.source.endpoint.namespace";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_NAMESPACE_DOC = "The namespace";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_NAMESPACE_DEFAULT = null;
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_POOL_SIZE_CONF = "camel.source.endpoint.poolSize";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_POOL_SIZE_DOC = "The Consumer pool size";
    public static final Integer CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_POOL_SIZE_DEFAULT = 1;
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_RESOURCE_NAME_CONF = "camel.source.endpoint.resourceName";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_RESOURCE_NAME_DOC = "The Consumer Resource Name we would like to watch";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_RESOURCE_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_EXCEPTION_HANDLER_CONF = "camel.source.endpoint.exceptionHandler";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_EXCEPTION_HANDLER_DOC = "To let the consumer use a custom ExceptionHandler. Notice if the option bridgeErrorHandler is enabled then this option is not in use. By default the consumer will deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_EXCEPTION_HANDLER_DEFAULT = null;
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_EXCHANGE_PATTERN_CONF = "camel.source.endpoint.exchangePattern";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_EXCHANGE_PATTERN_DOC = "Sets the exchange pattern when the consumer creates an exchange. One of: [InOnly] [InOut] [InOptionalOut]";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_EXCHANGE_PATTERN_DEFAULT = null;
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.source.endpoint.basicPropertyBinding";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CONNECTION_TIMEOUT_CONF = "camel.source.endpoint.connectionTimeout";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CONNECTION_TIMEOUT_DOC = "Connection timeout in milliseconds to use when making requests to the Kubernetes API server.";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CONNECTION_TIMEOUT_DEFAULT = null;
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_SYNCHRONOUS_CONF = "camel.source.endpoint.synchronous";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CA_CERT_DATA_CONF = "camel.source.endpoint.caCertData";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CA_CERT_DATA_DOC = "The CA Cert Data";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CA_CERT_DATA_DEFAULT = null;
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CA_CERT_FILE_CONF = "camel.source.endpoint.caCertFile";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CA_CERT_FILE_DOC = "The CA Cert File";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CA_CERT_FILE_DEFAULT = null;
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CLIENT_CERT_DATA_CONF = "camel.source.endpoint.clientCertData";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CLIENT_CERT_DATA_DOC = "The Client Cert Data";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CLIENT_CERT_DATA_DEFAULT = null;
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CLIENT_CERT_FILE_CONF = "camel.source.endpoint.clientCertFile";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CLIENT_CERT_FILE_DOC = "The Client Cert File";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CLIENT_CERT_FILE_DEFAULT = null;
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CLIENT_KEY_ALGO_CONF = "camel.source.endpoint.clientKeyAlgo";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CLIENT_KEY_ALGO_DOC = "The Key Algorithm used by the client";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CLIENT_KEY_ALGO_DEFAULT = null;
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CLIENT_KEY_DATA_CONF = "camel.source.endpoint.clientKeyData";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CLIENT_KEY_DATA_DOC = "The Client Key data";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CLIENT_KEY_DATA_DEFAULT = null;
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CLIENT_KEY_FILE_CONF = "camel.source.endpoint.clientKeyFile";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CLIENT_KEY_FILE_DOC = "The Client Key file";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CLIENT_KEY_FILE_DEFAULT = null;
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CLIENT_KEY_PASSPHRASE_CONF = "camel.source.endpoint.clientKeyPassphrase";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CLIENT_KEY_PASSPHRASE_DOC = "The Client Key Passphrase";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CLIENT_KEY_PASSPHRASE_DEFAULT = null;
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_OAUTH_TOKEN_CONF = "camel.source.endpoint.oauthToken";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_OAUTH_TOKEN_DOC = "The Auth Token";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_OAUTH_TOKEN_DEFAULT = null;
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_PASSWORD_CONF = "camel.source.endpoint.password";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_PASSWORD_DOC = "Password to connect to Kubernetes";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_TRUST_CERTS_CONF = "camel.source.endpoint.trustCerts";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_TRUST_CERTS_DOC = "Define if the certs we used are trusted anyway or not";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_TRUST_CERTS_DEFAULT = null;
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_USERNAME_CONF = "camel.source.endpoint.username";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_USERNAME_DOC = "Username to connect to Kubernetes";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_USERNAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_KUBERNETESJOB_COMPONENT_BRIDGE_ERROR_HANDLER_CONF = "camel.component.kubernetes-job.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_COMPONENT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_KUBERNETESJOB_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_KUBERNETESJOB_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.kubernetes-job.basicPropertyBinding";
    public static final String CAMEL_SOURCE_KUBERNETESJOB_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_KUBERNETESJOB_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;

    public CamelKubernetesjobSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelKubernetesjobSourceConnectorConfig(
            Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_KUBERNETESJOB_PATH_MASTER_URL_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_KUBERNETESJOB_PATH_MASTER_URL_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_KUBERNETESJOB_PATH_MASTER_URL_DOC);
        conf.define(CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_API_VERSION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_API_VERSION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_API_VERSION_DOC);
        conf.define(CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_DNS_DOMAIN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_DNS_DOMAIN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_DNS_DOMAIN_DOC);
        conf.define(CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_KUBERNETES_CLIENT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_KUBERNETES_CLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_KUBERNETES_CLIENT_DOC);
        conf.define(CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_PORT_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_PORT_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_PORT_NAME_DOC);
        conf.define(CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_PORT_PROTOCOL_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_PORT_PROTOCOL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_PORT_PROTOCOL_DOC);
        conf.define(CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CRD_GROUP_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CRD_GROUP_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CRD_GROUP_DOC);
        conf.define(CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CRD_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CRD_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CRD_NAME_DOC);
        conf.define(CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CRD_PLURAL_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CRD_PLURAL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CRD_PLURAL_DOC);
        conf.define(CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CRD_SCOPE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CRD_SCOPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CRD_SCOPE_DOC);
        conf.define(CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CRD_VERSION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CRD_VERSION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CRD_VERSION_DOC);
        conf.define(CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_LABEL_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_LABEL_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_LABEL_KEY_DOC);
        conf.define(CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_LABEL_VALUE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_LABEL_VALUE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_LABEL_VALUE_DOC);
        conf.define(CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_NAMESPACE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_NAMESPACE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_NAMESPACE_DOC);
        conf.define(CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_POOL_SIZE_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_POOL_SIZE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_POOL_SIZE_DOC);
        conf.define(CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_RESOURCE_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_RESOURCE_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_RESOURCE_NAME_DOC);
        conf.define(CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_EXCEPTION_HANDLER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_EXCEPTION_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_EXCEPTION_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_EXCHANGE_PATTERN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_EXCHANGE_PATTERN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_EXCHANGE_PATTERN_DOC);
        conf.define(CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CONNECTION_TIMEOUT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CONNECTION_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CONNECTION_TIMEOUT_DOC);
        conf.define(CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CA_CERT_DATA_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CA_CERT_DATA_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CA_CERT_DATA_DOC);
        conf.define(CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CA_CERT_FILE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CA_CERT_FILE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CA_CERT_FILE_DOC);
        conf.define(CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CLIENT_CERT_DATA_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CLIENT_CERT_DATA_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CLIENT_CERT_DATA_DOC);
        conf.define(CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CLIENT_CERT_FILE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CLIENT_CERT_FILE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CLIENT_CERT_FILE_DOC);
        conf.define(CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CLIENT_KEY_ALGO_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CLIENT_KEY_ALGO_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CLIENT_KEY_ALGO_DOC);
        conf.define(CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CLIENT_KEY_DATA_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CLIENT_KEY_DATA_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CLIENT_KEY_DATA_DOC);
        conf.define(CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CLIENT_KEY_FILE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CLIENT_KEY_FILE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CLIENT_KEY_FILE_DOC);
        conf.define(CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CLIENT_KEY_PASSPHRASE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CLIENT_KEY_PASSPHRASE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_CLIENT_KEY_PASSPHRASE_DOC);
        conf.define(CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_OAUTH_TOKEN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_OAUTH_TOKEN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_OAUTH_TOKEN_DOC);
        conf.define(CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_PASSWORD_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_PASSWORD_DOC);
        conf.define(CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_TRUST_CERTS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_TRUST_CERTS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_TRUST_CERTS_DOC);
        conf.define(CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_USERNAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_USERNAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_KUBERNETESJOB_ENDPOINT_USERNAME_DOC);
        conf.define(CAMEL_SOURCE_KUBERNETESJOB_COMPONENT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_KUBERNETESJOB_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_KUBERNETESJOB_COMPONENT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_KUBERNETESJOB_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_KUBERNETESJOB_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.LOW, CAMEL_SOURCE_KUBERNETESJOB_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        return conf;
    }
}