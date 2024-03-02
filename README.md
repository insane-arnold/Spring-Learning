# Spring Learning    - Cheatsheet for Spring 

## What is Spring?

The Spring framework is an open-source Java application framework, which is based on two key principles: dependency injection and Inversion of Control. Spring has the ability to autowire the dependency at run time, which allows the developer to write loosely coupled code.

<ol>
  <li><a href="https://github.com/insane-arnold/Spring-Learning/tree/main/movie-recommender/lesson1#tight-coupling">Tight Coupling</a></li>
  <li><a href="https://github.com/insane-arnold/Spring-Learning/tree/main/movie-recommender/lesson2#loose-coupling">Loose Coupling</a></li>
</ol>

## Terminology
### Bean

Beans are the objects of classes that are created and managed by Spring. The @Component annotation is the most common method of defining beans.

<code>@Component
public class Vehicle {
  //@Component annotation is used to declare that we need a bean of this class
}</code>


