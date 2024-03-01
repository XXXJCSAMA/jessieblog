package com.jessie;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

@MapperScan("com.jessie.mapper");
public class JessieApplication{
    public static void main(String[] args){

        SpringApplication.run(JessieApplication.class,args);
    }
}
