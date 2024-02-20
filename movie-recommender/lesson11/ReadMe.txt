Spring manages the entire lifecycle of beans from the time they are created till the time they are 
destroyed. It provides post-initialization and pre-destruction callback methods on the beans. The 
developer can tap into these callbacks and write custom initialization and cleanup code.


When Spring creates a bean, it autowires the dependencies. If the developer wants to perform a task after 
the dependencies have been populated, it can be done by calling a method annotated with the @PostConstruct 
annotation. A method with this annotation works like the init method. The @PostConstruct annotation tells 
Spring to call the method for us once the object has been created. The method can have any name and its 
return type is always void. After the bean is created, we can initialize the contents of the bean, load 
data, establish a database connection, or connect to a web server. The post construct method is only called 
after all the dependencies have been populated.


The callback method that is executed just before the bean is destroyed is annotated using @PreDestroy.
The method having this annotation is called when the bean is in the process of being removed from the 
container. All cleanup stuff can be performed in this method. A method with the @PreDestroy annotation 
can be used to release resources or close a database connection.

