package cn.zephyr;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

/**
 * @ClassName: ZuulGatewayApplication
 * @Author: laizonghao
 * @Description:
 * @Date: 2019/9/24 18:14
 */
@EnableZuulServer
@SpringCloudApplication
public class ZuulGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulGatewayApplication.class,args);
    }
}
