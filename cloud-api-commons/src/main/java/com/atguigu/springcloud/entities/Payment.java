package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Tom
 */
@Data
@AllArgsConstructor
public class Payment {
    private int id;
    private String serial;
}
