/**
 * 
 */
package com.glebow.webfluxdemo.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.glebow.webfluxdemo.service.TimeService;

import reactor.core.publisher.Flux;

/**
 * @author pglebow
 *
 */
@RestController
@RequestMapping("/time")
public class TimeController {

	@Autowired
	private TimeService timeService;
	
	@GetMapping
    Flux<Date> all() {
        return timeService.next();
    }

}
