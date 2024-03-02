## Terminology
### Bean
Beans are the objects of classes that are created and managed by Spring. The @Component annotation is the most common method of defining beans.

```
@Component
public class Vehicle {
      //@Component annotation is used to declare that we need a bean of this class
}
```

### Autowiring
The process of identifying a dependency, looking for a match, and then populating the dependency is called autowiring. The @Autowired annotation tells Spring to find and inject a collaborating bean into another. If more than one bean of the same type is available, Spring throws an error.Spring will not know which bean to inject in the Arithmetic bean unless the developer explicitly specifies it.

```
@Component
class Arithmetic(){
    @Autowired
    private Operator operator;
    //...
}

@Component
class Addition implements Operator {

}

@Component
class Subtraction implements Operator {

}
```

### Dependency injection
Dependency injection is the process by which Spring looks up the beans that are needed for a particular bean to function and injects them as a dependency. Spring can perform dependency injection by using constructor or by using a setter method.

### Inversion of Control
Traditionally, the class which needed the dependency created an instance of the dependency. The class decided when to create the dependency and how to create it. For example, Engine class is a dependency of Vehicle class, which *"creates"* its object.

```
class Vehicle{
    private Engine engine = new Engine();
    //...
}
```
Spring takes this responsibility from the class and creates the object itself. The developer simply mentions the dependency and the framework takes care of the rest by _"injecting"_ the bean.
```
class Vehicle{
 
    private Engine engine;
    //...
}
```

Thus, control moves from the component that needs the dependency to the framework. The framework takes the responsibility for finding out the dependencies of a component, ensuring their availability and injecting them in the component. This process is called Inversion of Control.

## IoC container
An IoC container is a framework that provides the Inversion of Control functionality.


## Bean factory
The basic version of the Spring IoC container is bean factory. It is the legacy IoC container and provides basic management for beans and wiring of dependencies. In Spring, bean factory still exists to provide backward compatibility.

## Application context
Application context adds more features to the bean factory that are typically needed by an enterprise application. It is the most important part of the Spring framework. All the core logic of Spring happens here. It includes basic management of beans and wiring of dependencies as provided by the bean factory. Additional features in application context include Spring AOP features, internationalization, web application context, etc.


