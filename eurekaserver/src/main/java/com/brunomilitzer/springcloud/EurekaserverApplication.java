package com.brunomilitzer.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaserverApplication {

    public static void main( final String[] args ) {

        SpringApplication.run( EurekaserverApplication.class, args );
    }

}
