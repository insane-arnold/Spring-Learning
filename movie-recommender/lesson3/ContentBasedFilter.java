package io.datajek.spring.basics.movierecommendersystem.lesson3;

import org.springframework.stereotype.Component;

@Component
public class ContentBasedFilter implements Filter{
	
	@Override
	public String[] getRecommendations(String movie) {
		// TODO Auto-generated method stub
		return new String[] {"Happy Feet", "Ice Age", "Penguins of Madagascar"};
		
	}

}
