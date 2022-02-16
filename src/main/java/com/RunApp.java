package com;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;


/**
 * @author : zjw
 * @date : 11:17 2022/2/11
 */

@SpringBootApplication
@EnableTransactionManagement//开启事务
public class RunApp {
    public static void main(String[] args) {
        SpringApplication.run(RunApp.class);
    }
}
