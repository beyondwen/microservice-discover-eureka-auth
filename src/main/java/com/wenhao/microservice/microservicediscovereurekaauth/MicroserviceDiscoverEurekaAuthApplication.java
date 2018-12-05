package com.wenhao.microservice.microservicediscovereurekaauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroserviceDiscoverEurekaAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceDiscoverEurekaAuthApplication.class, args);
    }
}
