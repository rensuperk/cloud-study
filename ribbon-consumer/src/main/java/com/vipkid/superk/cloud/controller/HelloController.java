package com.vipkid.superk.cloud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description
 * <p>
 * </p>
 * DATE 2018/5/16.
 *
 * @author renkai.
 */
@RestController
public class HelloController {

    private Logger logger = LoggerFactory.getLogger(HelloController.class);
    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("hello")
    public String index(){
        ServiceInstance localServiceInstance = discoveryClient.getLocalServiceInstance();
        logger.info("/hello,host:" + localServiceInstance.getHost() +",service_id:" +localServiceInstance.getServiceId());
        return "hello";
    }
}
