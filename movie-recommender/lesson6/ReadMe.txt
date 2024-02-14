Like @Primary, the @Qualifier annotation gives priority to one bean over the other if two beans of the 
same type are found. The bean whose name is specified in the @Qualifier annotation qualifies to be 
injected as a dependency. The @Qualifier annotation can be used in a scenario when we have multiple 
objects of the same type and autowiring by name cannot be used because the variable name doesn’t match 
any bean name.

Note: Don't create constructor 

@Qualifier has higher priority than @Primary