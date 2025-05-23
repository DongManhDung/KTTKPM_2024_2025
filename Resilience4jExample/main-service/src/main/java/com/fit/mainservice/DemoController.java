package com.fit.mainservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {
    private final ExternalService service;

    public DemoController(ExternalService service) {
        this.service = service;
    }

    @GetMapping("/test")
    public String test() {
        return service.callExternalApi();
    }
}
