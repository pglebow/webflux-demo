/**
 * 
 */
package com.glebow.webfluxdemo.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;

/**
 * @author pglebow
 *
 */
@Service
public class TimeService {

	public Flux<Date> next() {
		return Flux.just(new Date());
	}
}
