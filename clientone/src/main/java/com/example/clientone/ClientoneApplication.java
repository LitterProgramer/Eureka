package com.example.clientone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ClientoneApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientoneApplication.class, args);
    }

}
