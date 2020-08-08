package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author yanmz
 * @version 1.0
 * @date 2020/8/4 21:59
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardMain9001 {//http://localhost:8001/hystrix.stream
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardMain9001.class,args);
    }
}
