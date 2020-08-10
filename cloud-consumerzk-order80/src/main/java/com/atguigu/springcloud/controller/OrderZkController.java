package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author yanmz
 * @version 1.0
 * @date 2020/8/1 9:44
 */
@RestController
@Slf4j
public class OrderZkController {

    public static  final  String INVOKE_URL="http://cloud-provider-payment";

    @Resource
    RestTemplate restTemplate;

    @GetMapping("/comsumer/payment/zk")
    public String paymentInfo(){
        return restTemplate.getForObject(INVOKE_URL+"/payment/zk",String.class);
    }
}
