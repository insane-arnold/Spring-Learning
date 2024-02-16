package io.datajek.spring.basics.movierecommendersystem.lesson8;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class CollaborativeFilter implements Filter {

	public String[] getRecommendations(String movie) {
		
		return new String[] {"Collaborative Based Movie"};
	}	
}
