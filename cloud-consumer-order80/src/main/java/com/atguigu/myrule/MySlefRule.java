package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yanmz
 * @version 1.0
 * @date 2020/8/3 14:39
 */
@Configuration
public class MySlefRule {

    @Bean
    public IRule iRule(){
        return  new RandomRule();
    }
}
