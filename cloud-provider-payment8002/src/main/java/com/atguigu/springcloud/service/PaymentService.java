package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;

/**
 * @author Tom
 */
public interface PaymentService {
    /**
     * 新增
     *
     * @param payment
     * @return
     */
    int create(Payment payment);

    /**
     * 根据Id查询
     *
     * @param id
     * @return
     */
    Payment getPaymentById(Long id);
}
