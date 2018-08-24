package com.sundy.nettypush;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication(scanBasePackages = "com.sundy")
public class NettyPushClientApplication {

    public static void main(String[] args) {

        SpringApplication.run(NettyPushClientApplication.class, args);
    }
}
