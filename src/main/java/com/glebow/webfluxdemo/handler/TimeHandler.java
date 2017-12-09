/**
 * 
 */
package com.glebow.webfluxdemo.handler;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Mono;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

import org.springframework.http.MediaType;

/**
 * @author pglebow
 *
 */
@Component
public class TimeHandler {

	public Mono<ServerResponse> time(ServerRequest request) {
		return ok().contentType(MediaType.TEXT_PLAIN).body(publisher, elementClass)
	}
	
}
