This lesson demonstrates how Spring dynamically autowires a dependency in case it finds more than one
component of the same type.

Here we are learning about @Qualifier and @Primary annotation. This annotation is used to solve ambiguity
problem.When two bean of same type is declared or is implementing same interface, in that case which 
bean should be taken for processing can be identified by the above two annotation.


1. We just need to change the variable name into the class name to match the bean name 
in the bean dependent class.

	@Autowired
	private Filter collaborativeFilter;

	public RecommenderImplementation(Filter collaborativeFilter) {
		super();
		this.collaborativeFilter = collaborativeFilter;
	}
	