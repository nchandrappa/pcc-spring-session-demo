package io.pivotal.data.pcc.config;

import org.apache.geode.cache.client.ClientRegionShortcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.session.data.gemfire.config.annotation.web.http.EnableGemFireHttpSession;
import org.springframework.session.data.gemfire.config.annotation.web.http.GemFireHttpSessionConfiguration;


@EnableGemFireHttpSession(
	    clientRegionShortcut = ClientRegionShortcut.PROXY,
	    poolName = "DEFAULT",
	    regionName = "example_partition_region",
	    sessionSerializerBeanName = GemFireHttpSessionConfiguration.SESSION_DATA_SERIALIZER_BEAN_NAME
	  )
@Profile("cloud")
@Configuration
public class CloudCacheConfig {

}
