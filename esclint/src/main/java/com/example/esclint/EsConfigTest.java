package com.example.esclint;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class EsConfigTest {
    @Value("${hello}")
    private String text;

    @GetMapping("/say")
    public String sayHello(){
        return text;
    }
}
