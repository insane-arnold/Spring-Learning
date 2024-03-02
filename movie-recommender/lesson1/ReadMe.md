# Tight coupling


Tightly coupled code involves creating an instance of the dependency inside the class. As an example, suppose we have an application that recommends movies to watch. The application uses content-based filtering that employs item-to-item similarity as well as user preferences. The class MovieRecommender is directly instantiating an object of ContentBasedFilter, which makes ContentBasedFilter a dependency of MovieRecommender.

Problems can arise when we want to use a different option for the dependency. Suppose we did not get good movie recommendations from the content-based filter and want to switch to a collaborative filter which takes into account the choices of users who have watched similar movies. This entails changing the code of MovieRecommender, which would be a disadvantage of using tightly coupled code.

In this lesson we are showing the example of TightCoupling where we create instance of each and every 
class in another.

<ul>
  <li>MovieRecommenderSystemApplication creates an object of RecommenderImplementation</li>
  <li>RecommenderImplementation creates an object of ContentBasedFilter</li>
</ul>


