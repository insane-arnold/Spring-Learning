This lesson demonstrates how Spring dynamically auto wire a dependency in case it finds more than one
component of the same type.

Here we are learning about @Qualifier and @Primary annotation. This annotation is used to solve ambiguity
problem.When two bean of same type is declared or is implementing same interface, in that case which 
bean should be taken for processing can be identified by the above two annotation.


1. @Primary annotation is used for making a component the default choice when multiple beans
   of the same type are found.(byType injection)
   
    @Component
	@Primary
	public class CollaborativeFilter implements Filter {
	
		public String[] getRecommendations(String movie) {
			
			return new String[] {"Collaborative Based Movie"};
		}	
	}
   
 