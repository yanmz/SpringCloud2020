package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author Tom
 */
@RestController
@Slf4j
public class PaymentController {

     @Value("${server.port}")
    private String serverProt;


     @GetMapping("/payment/zk")
    public  String paymentzk(){
        return "springcloud with  zookeeper: "+serverProt+"\t"+ UUID.randomUUID().toString();
    }
}
