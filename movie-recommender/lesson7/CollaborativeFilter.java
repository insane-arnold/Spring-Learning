package io.datajek.spring.basics.movierecommendersystem.lesson7;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CollaborativeFilter implements Filter {

	public String[] getRecommendations(String movie) {
		
		return new String[] {"Collaborative Based Movie"};
	}	
}