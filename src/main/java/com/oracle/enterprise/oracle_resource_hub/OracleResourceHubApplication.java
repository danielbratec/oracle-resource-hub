package com.oracle.enterprise.resourcehub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching // Cache corporativo (Oracle pattern)
public class OracleResourceHubApplication {

    public static void main(String[] args) {
        SpringApplication.run(OracleResourceHubApplication.class, args);
    }
}
