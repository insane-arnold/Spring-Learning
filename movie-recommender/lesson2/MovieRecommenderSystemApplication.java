package io.datajek.spring.basics.movierecommendersystem.lesson2;

import java.util.Arrays;


import io.datajek.spring.basics.movierecommendersystem.lesson2.RecommenderImplementation;

public class MovieRecommenderSystemApplication {
	
	// Here we have made it loosely coupled but still we need to create an object of Filter
	public static void main(String[] args) {
		
		RecommenderImplementation recommender = new RecommenderImplementation(new ContentBasedFilter());
		String[] movieList = recommender.recommendMovies("Rio");
		System.out.println(Arrays.toString(movieList));
	}

}
