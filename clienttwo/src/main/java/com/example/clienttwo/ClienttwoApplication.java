package com.example.clienttwo;
/**
 * @EnableDiscoveryClient注解，说明这是一个Eureka客户端，
 * 同时也可以获取到Eureka服务器中所注册的服务列表;
 * 在RestTemplate中我们增加了一个@LoadBalanced注解，该注解就是能
 * 够让RestTemplate启用客户端负载均衡。
 */

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class ClienttwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClienttwoApplication.class, args);
    }


    /**
     * 实例化ribbon使用的RestTemplate
     */
    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

    /**
     * 配置随机负载策略，需要配置属性service-B.ribbon.NFLoadBalancerRuleClassName=com.netflix.loadbalancer.RandomRule
     */
    @Bean
    public IRule ribbonRule() {
        return new RandomRule();
    }
}
