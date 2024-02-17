package io.datajek.spring.basics.movierecommendersystem.lesson9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"io.datajek.spring.basics.movierecommendersystem.lesson9",
"io.datajek.spring.basics.movierecommendersystem.lesson10"})
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		
		//ApplicationContext manages the beans and dependencies
		ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

		System.out.println("\n");
		System.out.println("################## SINGLETON SCOPE ##############");
		ContentBasedFilter f1 = appContext.getBean(ContentBasedFilter.class);
		ContentBasedFilter f2 = appContext.getBean(ContentBasedFilter.class);
		ContentBasedFilter f3 = appContext.getBean(ContentBasedFilter.class);
		
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println("\n");
		
		System.out.println("################## PROTOTYPE SCOPE ##############");
		Movie m1 = f1.getMovie();
		Movie m2 = f1.getMovie();
		Movie m3 = f1.getMovie();
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println("\n");
		
		//Print number of instances of each bean
	    System.out.println("ContentBasedFilter instances created: "+ ContentBasedFilter.getInstances());
	    System.out.println("Movie instances created: "+ Movie.getInstances());
	    System.out.println("\n");
	    
	    //Proof that @SpringBootApplication only scans the current packages and it sub packages
	    System.out.println("ContentBasedFilter bean found = " +  
	    		appContext.containsBean("contentBasedFilter"));
	    System.out.println("CollaborativeFilter bean found = " + 
                appContext.containsBean("collaborativeFilter"));
		
	}

}
