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
package org.apache.camel.kafkaconnector.beanstalk;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelBeanstalkSinkConnectorConfig
        extends
            CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_BEANSTALK_PATH_CONNECTION_SETTINGS_CONF = "camel.sink.path.connectionSettings";
    public static final String CAMEL_SINK_BEANSTALK_PATH_CONNECTION_SETTINGS_DOC = "Connection settings host:port/tube";
    public static final String CAMEL_SINK_BEANSTALK_PATH_CONNECTION_SETTINGS_DEFAULT = null;
    public static final String CAMEL_SINK_BEANSTALK_ENDPOINT_COMMAND_CONF = "camel.sink.endpoint.command";
    public static final String CAMEL_SINK_BEANSTALK_ENDPOINT_COMMAND_DOC = "put means to put the job into Beanstalk. Job body is specified in the Camel message body. Job ID will be returned in beanstalk.jobId message header. delete, release, touch or bury expect Job ID in the message header beanstalk.jobId. Result of the operation is returned in beanstalk.result message header kick expects the number of jobs to kick in the message body and returns the number of jobs actually kicked out in the message header beanstalk.result. One of: [bury] [release] [put] [touch] [delete] [kick]";
    public static final String CAMEL_SINK_BEANSTALK_ENDPOINT_COMMAND_DEFAULT = null;
    public static final String CAMEL_SINK_BEANSTALK_ENDPOINT_JOB_DELAY_CONF = "camel.sink.endpoint.jobDelay";
    public static final String CAMEL_SINK_BEANSTALK_ENDPOINT_JOB_DELAY_DOC = "Job delay in seconds.";
    public static final Integer CAMEL_SINK_BEANSTALK_ENDPOINT_JOB_DELAY_DEFAULT = 0;
    public static final String CAMEL_SINK_BEANSTALK_ENDPOINT_JOB_PRIORITY_CONF = "camel.sink.endpoint.jobPriority";
    public static final String CAMEL_SINK_BEANSTALK_ENDPOINT_JOB_PRIORITY_DOC = "Job priority. (0 is the highest, see Beanstalk protocol)";
    public static final Long CAMEL_SINK_BEANSTALK_ENDPOINT_JOB_PRIORITY_DEFAULT = 1000L;
    public static final String CAMEL_SINK_BEANSTALK_ENDPOINT_JOB_TIME_TO_RUN_CONF = "camel.sink.endpoint.jobTimeToRun";
    public static final String CAMEL_SINK_BEANSTALK_ENDPOINT_JOB_TIME_TO_RUN_DOC = "Job time to run in seconds. (when 0, the beanstalkd daemon raises it to 1 automatically, see Beanstalk protocol)";
    public static final Integer CAMEL_SINK_BEANSTALK_ENDPOINT_JOB_TIME_TO_RUN_DEFAULT = 60;
    public static final String CAMEL_SINK_BEANSTALK_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_BEANSTALK_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_BEANSTALK_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_BEANSTALK_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.sink.endpoint.basicPropertyBinding";
    public static final String CAMEL_SINK_BEANSTALK_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_BEANSTALK_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_BEANSTALK_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_BEANSTALK_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_BEANSTALK_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_BEANSTALK_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.beanstalk.lazyStartProducer";
    public static final String CAMEL_SINK_BEANSTALK_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_BEANSTALK_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_BEANSTALK_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.beanstalk.basicPropertyBinding";
    public static final String CAMEL_SINK_BEANSTALK_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_BEANSTALK_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_BEANSTALK_COMPONENT_CONNECTION_SETTINGS_FACTORY_CONF = "camel.component.beanstalk.connectionSettingsFactory";
    public static final String CAMEL_SINK_BEANSTALK_COMPONENT_CONNECTION_SETTINGS_FACTORY_DOC = "Custom ConnectionSettingsFactory. Specify which ConnectionSettingsFactory to use to make connections to Beanstalkd. Especially useful for unit testing without beanstalkd daemon (you can mock ConnectionSettings)";
    public static final String CAMEL_SINK_BEANSTALK_COMPONENT_CONNECTION_SETTINGS_FACTORY_DEFAULT = null;

    public CamelBeanstalkSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelBeanstalkSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_BEANSTALK_PATH_CONNECTION_SETTINGS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_BEANSTALK_PATH_CONNECTION_SETTINGS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BEANSTALK_PATH_CONNECTION_SETTINGS_DOC);
        conf.define(CAMEL_SINK_BEANSTALK_ENDPOINT_COMMAND_CONF, ConfigDef.Type.STRING, CAMEL_SINK_BEANSTALK_ENDPOINT_COMMAND_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BEANSTALK_ENDPOINT_COMMAND_DOC);
        conf.define(CAMEL_SINK_BEANSTALK_ENDPOINT_JOB_DELAY_CONF, ConfigDef.Type.INT, CAMEL_SINK_BEANSTALK_ENDPOINT_JOB_DELAY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BEANSTALK_ENDPOINT_JOB_DELAY_DOC);
        conf.define(CAMEL_SINK_BEANSTALK_ENDPOINT_JOB_PRIORITY_CONF, ConfigDef.Type.LONG, CAMEL_SINK_BEANSTALK_ENDPOINT_JOB_PRIORITY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BEANSTALK_ENDPOINT_JOB_PRIORITY_DOC);
        conf.define(CAMEL_SINK_BEANSTALK_ENDPOINT_JOB_TIME_TO_RUN_CONF, ConfigDef.Type.INT, CAMEL_SINK_BEANSTALK_ENDPOINT_JOB_TIME_TO_RUN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BEANSTALK_ENDPOINT_JOB_TIME_TO_RUN_DOC);
        conf.define(CAMEL_SINK_BEANSTALK_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_BEANSTALK_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BEANSTALK_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_BEANSTALK_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_BEANSTALK_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BEANSTALK_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_BEANSTALK_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_BEANSTALK_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BEANSTALK_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_BEANSTALK_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_BEANSTALK_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BEANSTALK_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_BEANSTALK_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_BEANSTALK_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.LOW, CAMEL_SINK_BEANSTALK_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_BEANSTALK_COMPONENT_CONNECTION_SETTINGS_FACTORY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_BEANSTALK_COMPONENT_CONNECTION_SETTINGS_FACTORY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_BEANSTALK_COMPONENT_CONNECTION_SETTINGS_FACTORY_DOC);
        return conf;
    }
}