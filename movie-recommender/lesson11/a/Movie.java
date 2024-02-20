package io.datajek.spring.basics.movierecommendersystem.lesson11.a;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Scope("prototype")
public class Movie {
	
	private static final Logger logger = LoggerFactory.getLogger(Movie.class);
	
	public Movie() {
	    super();
	    logger.info("In Movie constructor method");     
	}
	
	@PostConstruct
	public void init() {
		logger.info("Inside Movie Post Constructor ....");
	}
	
	@PreDestroy
	public void destroy() {
		logger.info("Inside Movie Pre Destroy ....");
	}
}
