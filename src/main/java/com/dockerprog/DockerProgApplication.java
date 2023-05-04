package com.dockerprog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.dockerprog.dao")
@SpringBootApplication
public class DockerProgApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerProgApplication.class, args);
    }

}
