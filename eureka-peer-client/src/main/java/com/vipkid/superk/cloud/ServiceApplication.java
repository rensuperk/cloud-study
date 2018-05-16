package com.vipkid.superk.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;



/**
 * 启动一个服务注册中心提供给其他应用进行对话
 */
/**
 * Description
 * <p>
 * </p>
 * DATE 2018/5/15.
 *
 * @author renkai.
 */
@EnableEurekaClient
@SpringBootApplication(scanBasePackages = "com.vipkid.superk.cloud")
public class ServiceApplication {
    public static void main(String[] args) {
        //下面两行代码都可以用来启动
        SpringApplication.run(com.vipkid.superk.cloud.ServiceApplication.class, args);
        //new SpringApplicationBuilder(ServiceApplication.class).web(true).run(args);
    }
}
