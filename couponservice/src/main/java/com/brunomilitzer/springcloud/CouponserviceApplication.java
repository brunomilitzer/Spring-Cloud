package com.brunomilitzer.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CouponserviceApplication {

    public static void main( final String[] args ) {

        SpringApplication.run( CouponserviceApplication.class, args );
    }

}
