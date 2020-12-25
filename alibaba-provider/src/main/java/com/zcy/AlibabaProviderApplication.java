package com.zcy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
    @MapperScan("com.zcy.dao")
public class AlibabaProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlibabaProviderApplication.class, args);
    }

}
