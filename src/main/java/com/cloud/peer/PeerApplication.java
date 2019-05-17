package com.cloud.peer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class PeerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PeerApplication.class, args);
    }

}
