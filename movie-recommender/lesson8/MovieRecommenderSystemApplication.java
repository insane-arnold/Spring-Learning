package io.datajek.spring.basics.movierecommendersystem.lesson8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		
		//ApplicationContext manages the beans and dependencies
		ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

		System.out.println("\n");
		System.out.println("################## SINGLETON SCOPE ##############");
		Filter cbf1 = appContext.getBean(ContentBasedFilter.class);
		Filter cbf2 = appContext.getBean(ContentBasedFilter.class);
		Filter cbf3 = appContext.getBean(ContentBasedFilter.class);
		
		System.out.println(cbf1);
		System.out.println(cbf2);
		System.out.println(cbf3);
		System.out.println("\n");
		
		System.out.println("################## PROTOTYPE SCOPE ##############");
		Filter cb1 = appContext.getBean(CollaborativeFilter.class);
		Filter cb2 = appContext.getBean(CollaborativeFilter.class);
		Filter cb3 = appContext.getBean(CollaborativeFilter.class);
		
		System.out.println(cb1);
		System.out.println(cb2);
		System.out.println(cb3);
		System.out.println("\n");
		
	}

}
