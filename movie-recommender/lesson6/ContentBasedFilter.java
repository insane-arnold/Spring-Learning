package io.datajek.spring.basics.movierecommendersystem.lesson6;

import org.springframework.stereotype.Component;

@Component("CBF")
public class ContentBasedFilter implements Filter{
	
	@Override
	public String[] getRecommendations(String movie) {
		// TODO Auto-generated method stub
		return new String[] {"Content Based Movie"};
		
	}

}
