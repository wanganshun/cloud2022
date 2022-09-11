package com.was;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: cloud2022
 * @author: WangAnShun
 * @create: 2022-09-12 00:09
 **/
@SpringBootApplication
@EnableEurekaServer
public class CloudEurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaServerApplication.class,args);

    }
}
