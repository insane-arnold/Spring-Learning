Constructor injection: Autowiring the dependency using a constructor is called constructor injection. 

@Autowired
public RecommenderImplementation(@Qualifier("collaborativeFilter") Filter filter) {
    this.filter = filter;
    System.out.println("Constructor invoked...");
}


Setter injection:

@Autowired
@Qualifier("contentBasedFilter")
public void setFilter(Filter filter) {
    //...
}


Field injection:

public class RecommenderImplementation {
    @Autowired
    private Filter filter;
    
    //...    
}

