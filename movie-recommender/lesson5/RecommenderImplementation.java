package io.datajek.spring.basics.movierecommendersystem.lesson5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
	
	@Autowired
	private Filter collaborativeFilter;

	public RecommenderImplementation(Filter collaborativeFilter) {
		super();
		this.collaborativeFilter = collaborativeFilter;
	}
	
	public String[] recommendMovies (String movie) {
        //use content based filter to find similar movies
		System.out.println("Name of the filter in use: " + collaborativeFilter + "\n");
		String[] movieList = collaborativeFilter.getRecommendations(movie);
		
        //return the results
        return movieList;
    }

}
