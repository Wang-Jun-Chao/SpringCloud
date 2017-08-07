package com.didispace;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Author: 王俊超
 * Date: 2017-08-05 07:09
 * All Rights Reserved !!!
 */
@RestController
public class DcController {

    @Autowired
    DcClient dcClient;

    @GetMapping("/consumer")
    public String dc() {
       return dcClient.consumer();
    }
}
