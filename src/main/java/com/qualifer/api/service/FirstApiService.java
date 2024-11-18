package com.qualifer.api.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FirstApiService implements ApiService {

    private final RestTemplate restTemplate;

    public FirstApiService(@Qualifier("firstApiRestTemplate")RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public String fetchData() {
        String apiUrl = "https://jsonplaceholder.typicode.com/posts/1";
        return restTemplate.getForObject(apiUrl, String.class);
    }
}
