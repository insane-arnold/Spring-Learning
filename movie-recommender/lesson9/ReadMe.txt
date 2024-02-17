In this lesson, we will discuss an interesting problem of mixing bean scopes. Sometimes, a bean has
singleton scope but its dependency has prototype scope. An example is the content-based filter which
recommends movies based on item-to-item similarity. Our basic implementation of the content-based
filter compares different movies and assigns a similarity score. Hence, Movie is a dependency of the
ContentBasedFilter class.

The ContentBasedFilter bean has singleton scope because we need only one instance of the filter. However, 
the Movie bean has prototype scope because we need more than one objects of this class.

In this lesson we only need one Filter but each and every time we pass a name of a movie 
a list of new movie should come that is why Movie class is prototype.

Use @Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
in the prototype bean to solve the problem. Other wise only one instance of prototype will be 
created too.

Another method is by using the @Lookup annotation on the getMovie() method. 
This annotation tells Spring to return an instance of Movie type. It is essentially the same as 
beanFactory.getBean(Movie.class). Remove @Autowired from the member variable