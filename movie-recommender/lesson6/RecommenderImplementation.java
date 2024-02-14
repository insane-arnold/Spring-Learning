package io.datajek.spring.basics.movierecommendersystem.lesson6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
	
	@Autowired
	@Qualifier("CBF")
	private Filter filter;

	/*
	 * Creating a Constructor causes issue in Injecting using Qualifier
	 * */
//	public RecommenderImplementation(Filter filter) {
//		super();
//		this.filter = filter;
//	}
	
	public String[] recommendMovies (String movie) {
        //use content based filter to find similar movies
		System.out.println("Name of the filter in use: " + filter + "\n");
		String[] movieList = filter.getRecommendations(movie);
		
        //return the results
        return movieList;
    }

}
