The Spring container manages beans. The term bean scope refers to the lifecycle and the visibility of beans.
It tells how long the bean lives, how many instances of the bean are created, and how the bean is shared.

Types of bean scopes
There are six types of scopes: singleton, prototype, request, session, application, and websocket.

The singleton and prototype scopes can be used in any application while the last four scopes are only 
available for a web application. In this lesson, we will focus on singleton and prototype bean scopes only.

The default scope of a bean is singleton, in which only one instance of the bean is created and cached in 
memory. Multiple requests for the bean return a shared reference to the same bean. In contrast, prototype
scope results in the creation of new beans whenever a request for the bean is made to the application context.

We use @Scope("prototype") to make a bean of type protoType
We can also use @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)


NOTE: Spring creates a singleton bean even before we ask for it while a prototype bean is not created 
till we request Spring for the bean.

It is important to note that there is a difference between the Spring singleton and the Gang of Four (GoF) 
singleton design patterns. The singleton design pattern as specified by the GoF means one bean per JVM. 
However, in Spring it means one bean per application context. By the GoF definition, even if there were more 
than one application contexts running on the same JVM, there would still be only one instance of the 
singleton class.