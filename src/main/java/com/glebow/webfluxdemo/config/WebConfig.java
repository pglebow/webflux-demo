package com.glebow.webfluxdemo.config;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.glebow.webfluxdemo.service.TimeService;

@Configuration
public class WebConfig {
	@Bean
	RouterFunction<?> routes(TimeService ts) {
		return RouterFunctions

				.route(GET("/time"), serverRequest -> ServerResponse.ok().body(ts.next(), Date.class));
	}
}
