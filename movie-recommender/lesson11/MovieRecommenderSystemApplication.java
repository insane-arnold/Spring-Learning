package io.datajek.spring.basics.movierecommendersystem.lesson11;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MovieRecommenderSystemApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(MovieRecommenderSystemApplication.class);
	
	public static void main(String[] args) {
	
		logger.info("Starting MovieRecommenderSystemApplication...");
		ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);
		RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);
		String[] recommendedMovieList = recommender.recommendMovies("Haha");
		logger.info("Movie Recommended: "+Arrays.toString(recommendedMovieList));
	}

}
