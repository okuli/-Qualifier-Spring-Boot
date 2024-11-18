package com.qualifer.api.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SecondApiService implements ApiService {

    private final RestTemplate restTemplate;

    public SecondApiService(@Qualifier("secondApiRestTemplate") RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public String fetchData() {
        String apiUrl = "https://api.open-meteo.com/v1/forecast?latitude=52.52&longitude=13.405&current_weather=true";
        return restTemplate.getForObject(apiUrl, String.class);
    }
}
