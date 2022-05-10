package com.cloud.springcloudgatewayservicejava.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {gateway-service-java}
 * @Date: {2022/05/10 && 4:51 PM}
 */
@Configuration
public class APIGatewayApplication {
    //
    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/employee/**")
                        .uri("http://localhost:8081/")
                       // .id("employeeModule")
                )

                .route(r -> r.path("/consumer/**")
                        .uri("http://localhost:8082/")
                       // .id("consumerModule")
                )
                .build();
    }

}
