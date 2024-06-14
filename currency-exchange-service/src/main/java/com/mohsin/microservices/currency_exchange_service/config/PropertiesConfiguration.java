package com.mohsin.microservices.currency_exchange_service.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties
@Component
public class PropertiesConfiguration {
    @Value("${server.port}")
    private String serverPort;

    @Value("${eureka.client.serviceUrl.defaultZone}")
    private String eurekaServiceUrl;

    public String getServerPort() {
        return serverPort;
    }

    public void setServerPort(String serverPort) {
        this.serverPort = serverPort;
    }

    public String getEurekaServiceUrl() {
        return eurekaServiceUrl;
    }

    public void setEurekaServiceUrl(String eurekaServiceUrl) {
        this.eurekaServiceUrl = eurekaServiceUrl;
    }
}
