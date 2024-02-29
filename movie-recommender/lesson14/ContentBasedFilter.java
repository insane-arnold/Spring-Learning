package io.datajek.spring.basics.movierecommendersystem.lesson14;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Service
public class ContentBasedFilter implements Filter{
	
	private static final Logger logger = LoggerFactory.getLogger(ContentBasedFilter.class);
	private Movie movie;
	
	@PostConstruct
	public void init() {
		logger.info("Inside ContentBasedFilter Post Constructor ....");
	}
	
	@PreDestroy
	public void destroy() {
		logger.info("Inside ContentBasedFilter Pre Destroy ....");
	}
	@Override
	public String[] getRecommendations(String movie) {
		// TODO Auto-generated method stub
		return new String[] {"Happy Feet", "Ice Age", "Penguins of Madagascar"};
		
	}

	@Lookup
	public 	Movie getMovie() {
		return movie;
	}

}
