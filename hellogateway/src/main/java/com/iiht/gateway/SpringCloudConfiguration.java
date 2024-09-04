package com.iiht.gateway;

import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudConfiguration {
	
	
	/*@Bean
	RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
		
		return
				builder.routes()
				.route("helloserver",
						r->r.path("/rest/service/**").
						filters(f-> f.addRequestHeader("Hello", "World")).
						uri("http://localhost:8071")
						) // loadbalancer - lb
				.build();*/
	
	/* } */

}
