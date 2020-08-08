package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author yanmz
 * @version 1.0
 * @date 2020/8/3 15:58
 */
@Service
public class MyLB implements LoadBalancer {

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public final  int getAndIncrement(){
        int current;
        int next;
        do{
            current = atomicInteger.get();
            next = current>=Integer.MAX_VALUE?0:current+1;
        }while (!atomicInteger.compareAndSet(current,next));
        System.out.println("**************第几次访问，次数next"+next);
        return next;
    }

    //负载均衡算法：rest接口第几次 请求数%服务器集群总数=实际调用服务器位置下标，每次服务器重启后rest接口计数从1开始
    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
        int  index = getAndIncrement()%serviceInstances.size();
        return serviceInstances.get(index);
    }
}
