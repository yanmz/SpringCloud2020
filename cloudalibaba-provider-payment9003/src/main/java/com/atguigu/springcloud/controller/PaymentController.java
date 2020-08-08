package com.atguigu.springcloud.controller;

import cn.hutool.core.util.IdUtil;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zzyy
 * @version 1.0
 * @date 2020/03/07
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    public static Map<Integer, Payment> hashMap = new HashMap<>();

    static {
        hashMap.put(1, new Payment(1, IdUtil.simpleUUID()));
        hashMap.put(2, new Payment(2, IdUtil.simpleUUID()));
        hashMap.put(3, new Payment(3, IdUtil.simpleUUID()));
    }

    @GetMapping("/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id) {
        Payment payment = hashMap.get(id);
        return new CommonResult<>(200, "from mysql,serverPort:" + serverPort, payment);
    }
}
