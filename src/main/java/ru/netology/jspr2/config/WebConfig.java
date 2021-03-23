package ru.netology.jspr2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ConcurrentHashMap;

@Configuration
public class WebConfig {

    @Bean
    public ConcurrentHashMap<String, String> concurrentHashMapStrStr() {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        map.put("alex", "pass123");
        map.put("julia", "1234567");
        return map;
    }
}
