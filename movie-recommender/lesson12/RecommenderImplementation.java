package io.datajek.spring.basics.movierecommendersystem.lesson12;

import javax.inject.Inject;
import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Named
public class RecommenderImplementation {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	
	private Filter filter;
	
	public Filter getFilter() {
		return filter;
	}
	
	@Inject
	public void setFilter(Filter filter) {
		logger.info("In RecommenderImplementation setter method..dependency injection");
		this.filter = filter;
	}
	public String[] recommendMovies (String movie) {
        //use content based filter to find similar movies
		
		logger.info("Inside recommendMovies");
		String[] movieList = filter.getRecommendations(movie);
		
        //return the results
        return movieList;
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
