# Loose coupling

Instead of directly creating an instance of a class into another class, a an in better way would be to implement an inerface. This will remove the direct instantiation of the ContentBasedFilter, and instead, ask for the type of filter as an argument to the constructor.

This way MovieRecommender is not dependent on a specific type of filter and can be used with both a content-based filter and a collaborative filter. In this lesson we have same thing as in lesson1 but here we have created an interface Filter which is implemented by CollaborativeFilter and ContentBasedFilter as an example of loosely coupled code. Loose coupling has a number of advantages.

We create an object of Filter and assign an object of ContentBasedFilter and CollaboratorFilter based on our requirement.
