package com.qhit.usemanage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.qhit.usemanage.dao")
public class UserManageApplication {
    public static void main(String[] args) {

        SpringApplication.run(UserManageApplication.class,args);
    }
}
