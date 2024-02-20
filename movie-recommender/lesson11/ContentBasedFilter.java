package io.datajek.spring.basics.movierecommendersystem.lesson11;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class ContentBasedFilter implements Filter{
	
	private static final Logger logger = LoggerFactory.getLogger(ContentBasedFilter.class);
	
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

}
