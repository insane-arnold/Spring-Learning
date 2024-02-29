XMLConfiguration for Spring Core


Beans can be declared using the @Component annotation and the <bean> tag. But there are other ways to 
define beans. We will look at some of them in this lesson.


Beans can be declared using the @Bean annotation in a configuration class or by using the @Controller, 
@Service, and @Repository annotations. These annotations are used at different layers of an enterprise 
application. A typical application has the following layers:[See: Figure 1]

The web or UI layer interacts with the client program, the service layer provides an abstraction between 
the web and data access layer as well as taking care of the business logic, and the data layer interacts 
with a database or an external interface. @Component is a generic annotation. It can be used in any layer, 
if the developer is unsure about where the bean belongs. The other three annotations, @Controller, @Service, 
and @Repository, are specific to layers.[See Figure 2]

@Controller is used to define a controller in the web layer. Spring scans a class with @Controller to 
find methods that are mapped to different HTTP requests. It makes sure that the right view is rendered 
to the user. @RestController is a specialized form of @Controller.

@Service is used in the business layer for objects that define the business logic. It marks a class as 
a service provider.

@Respository is used in the data layer to encapsulate storage, retrieval, and search in a typical database. 
This annotation can also be used for other external sources of data.


Note: 
@Component: It is used for Entity class
@Controller: It is used for Controller class to
@Service: It is used for service class where Business Logic is written
@Repository: It is used in DOA class to read and write data to DB 