Learn how to use an external property file in your Java application.


@Value("${recommender.implementation.favoriteMovie: Finding Dory}")
String favoriteMovie;

Finding Dory is default value

@SpringBootApplication
  
@PropertySource("classpath:app.properties")