package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Tom
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced//默认轮询负载均衡
    public RestTemplate restTemplate(){
        return  new RestTemplate();
    }
}
