package io.datajek.spring.basics.movierecommendersystem.lesson3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
	
	@Autowired
	private Filter filter;

	public RecommenderImplementation(Filter filter) {
		super();
		this.filter = filter;
	}
	
	public String[] recommendMovies (String movie) {
        //use content based filter to find similar movies
		System.out.println("Name of the filter in use: " + filter + "\n");
		String[] movieList = filter.getRecommendations(movie);
		
        //return the results
        return movieList;
    }

}
