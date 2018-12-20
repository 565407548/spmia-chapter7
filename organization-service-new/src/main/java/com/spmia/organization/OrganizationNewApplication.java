package com.spmia.organization;

import com.spmia.organization.utils.UserContextFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import javax.servlet.Filter;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class OrganizationNewApplication {

    @Bean
    public Filter userContextFilter() {
        return new UserContextFilter();
    }

    public static void main(String[] args) {
        SpringApplication.run(OrganizationNewApplication.class, args);
    }
}