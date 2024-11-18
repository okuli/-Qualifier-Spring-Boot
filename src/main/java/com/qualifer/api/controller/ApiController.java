package com.qualifer.api.controller;


import com.qualifer.api.service.ApiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    private final ApiService firstApiService;
    private final ApiService secondApiService;

    public ApiController(ApiService firstApiService, ApiService secondApiService) {
        this.firstApiService = firstApiService;
        this.secondApiService = secondApiService;
    }

    @GetMapping("/first")
    public String callFirstApi() {
        return firstApiService.fetchData();
    }

    @GetMapping("/second")
    public String callSecondApi() {
        return secondApiService.fetchData();
    }
}