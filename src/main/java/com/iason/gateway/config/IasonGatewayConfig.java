package com.iason.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: IasonGatewayConfig
 * Inside the package - com.iason.gateway.config
 * Created Date: 5/19/2020
 * Created Time: 2:27 PM
 **/
@Configuration
public class IasonGatewayConfig {

//    @Bean
//    public RouteLocator iasonRoutes(RouteLocatorBuilder builder){
//        return builder.routes()
//                .route(r->r.path("/api/v1/iason/welcome*", "/api/v1/iason/welcome/")
//                            .uri("http://localhost:8080")
//                            .id("enrollment-generation"))
//                .build();
//    }

    @Bean
    public RouteLocator iasonRoutes(RouteLocatorBuilder builder){
        return builder.routes()
                .route(r->r.path("/api/v1/iason/welcome*", "/api/v1/iason/welcome/")
                        .uri("lb://iason-aca-intake")
                        .id("enrollment-generation"))
                .build();
    }
}
