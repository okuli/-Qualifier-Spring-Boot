package com.qualifer.api.config;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

    @Bean
    @Qualifier("firstApiRestTemplate")
    public RestTemplate firstApiRestTemplate() {
        return new RestTemplate();
    }

    @Bean
    @Qualifier("secondApiRestTemplate")
    public RestTemplate secondApiRestTemplate() {
        return new RestTemplate();
    }
}