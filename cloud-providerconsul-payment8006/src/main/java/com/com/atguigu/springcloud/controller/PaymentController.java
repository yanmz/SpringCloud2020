package com.com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author yanmz
 * @version 1.0
 * @date 2020/8/3 10:58
 */
@RestController
@Slf4j
public class PaymentController {
    @Value("${server.port}")
    private String serverProt;


    @GetMapping("/payment/consul")
    public  String paymentConsul(){
        return "springcloud with  consul: "+serverProt+"\t"+ UUID.randomUUID().toString();
    }
}
