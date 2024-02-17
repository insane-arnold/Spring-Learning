package io.datajek.spring.basics.movierecommendersystem.lesson9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class ContentBasedFilter implements Filter{
	
	private static int instances= 0;
	 
//    @Autowired
    private Movie movie;

    public ContentBasedFilter() {
        instances++;      
        System.out.println("ContentBasedFilter constructor called");
    }

    @Lookup
    public Movie getMovie() {
        return movie;
    }

    public static int getInstances(){
        return ContentBasedFilter.instances;
    }

	@Override
	public String[] getRecommendations(String movie) {
		// TODO Auto-generated method stub
		return null;
	}

}
