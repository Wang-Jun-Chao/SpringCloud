package com.didispace;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 通过@FeignClient定义的接口来统一的声明我们需要依赖的微服务接口
 * Author: 王俊超
 * Date: 2017-08-05 08:39
 * All Rights Reserved !!!
 */
@FeignClient("eureka-client")
public interface DcClient {
    @GetMapping("/dc")
    String consumer();
}
