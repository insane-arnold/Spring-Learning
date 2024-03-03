package io.datajek.spring.basics.movierecommendersystem.lesson15;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Service
public class RecommenderImplementation {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Value("${com.movie.name}")
	private String movie;
	
	public String getMovie() {
		return movie;
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}

	@PostConstruct
	public void init() {
		logger.info("Inside RecommenderImplementation Post Constructor ....");
	}
	
	@PreDestroy
	public void destroy() {
		logger.info("Inside RecommenderImplementation Pre Destroy ....");
	}
	

}
