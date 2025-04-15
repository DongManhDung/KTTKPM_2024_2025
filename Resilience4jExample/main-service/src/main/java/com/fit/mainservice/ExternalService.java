package com.fit.mainservice;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ExternalService {
    private final RestTemplate restTemplate;

    public ExternalService(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }

    @CircuitBreaker(name = "externalService", fallbackMethod = "fallback")
    @Retry(name = "myRetry")
    public String callExternalApi() {
        return restTemplate.getForObject("http://localhost:8081/api/fail", String.class);
    }

    public String fallback(Throwable t) {
        return "Fallback: external-service unavailable.";
    }

}
