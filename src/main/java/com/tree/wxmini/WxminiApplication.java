package com.tree.wxmini;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.tree.wxmini.dao")
public class WxminiApplication {

    public static void main(String[] args) {
        SpringApplication.run(WxminiApplication.class, args);
    }

}
