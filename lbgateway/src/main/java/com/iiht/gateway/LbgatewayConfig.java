package com.iiht.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class LbgatewayConfig {


	@Bean 
    RouteLocator customRouteLocator(RouteLocatorBuilder builder) { 
		return builder.routes()
				.route("lbservice-route", r -> r.path("/test/**") 
				.uri("lb://LBSERVICE"))
				.build();
		}
	  
	  
}


