package cn.acey.integrate.usmartbox.comfiguration;

import cn.acey.integrate.usmartbox.client.ApiClient;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

@Configuration
@EnableConfigurationProperties(UsmartboxProperties.class)
public class UsmartboxConfiguration implements DisposableBean {

    private ApiClient apiClient;

    @Autowired
    private UsmartboxProperties properties;

    @Bean
    @ConditionalOnMissingBean(ApiClient.class)
    public ApiClient usmartBoxApiClient(){
        apiClient = new ApiClient();
        apiClient.setBasePath(properties.getHost());
        cn.acey.integrate.usmartbox.client.Configuration.setDefaultApiClient(apiClient);
        return apiClient;
    }

    @Override
    public void destroy() throws Exception {

    }
}
