package io.datajek.spring.basics.movierecommendersystem.lesson4;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import io.datajek.spring.basics.movierecommendersystem.lesson4.RecommenderImplementation;

@SpringBootApplication
public class MovieRecommenderSystemApplication {
	
	// Here we have made it loosely coupled but still we need to create an object of Filter
	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(MovieRecommenderSystemApplication.class, args);
		RecommenderImplementation recommender = context.getBean(RecommenderImplementation.class);
		String[] result = recommender.recommendMovies("Finding Dory");
		System.out.println(Arrays.toString(result));
	}

}
