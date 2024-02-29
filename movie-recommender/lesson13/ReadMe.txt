spring-core provides the fundamental features of Spring framework like dependency injection and 
Inversion of Control.

@SpringBootApplication cannot be used in the Java application file anymore as we have replaced the 
spring-boot-starter dependency with spring-core in step 1. This annotation defined the application 
configuration in Spring Boot. In the Java realm, we use @Configuration and import the 
org.springframework.context.annotation.Configuration jar.


The SpringApplication class creates the application context. It belongs to the org.springframework-boot
package. When using the spring-core, the application context is created using 
AnnotationConfigApplicationContext class.

If we try to run the application now, it throws the NoSuchBeanDefinition exception, which means that the 
application context is unable to locate beans declared using @Component. We need to help it in component 
scanning by providing the @ComponentScan annotation on the MovieRecommenderSystemApplication class.