package io.datajek.spring.basics.movierecommendersystem.lesson1;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class MovieRecommenderSystemApplication {
	
	// This is an example of tight coupling where we are creating only one type of movie filter
	public static void main(String[] args) {
		RecommenderImplementation recommender = new RecommenderImplementation();
		String[] movieList = recommender.recommendMovies("Rio");
		System.out.println(Arrays.toString(movieList));
	}

}
