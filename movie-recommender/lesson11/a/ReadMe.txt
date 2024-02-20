Lifecycle of prototype beans

Spring manages the entire lifecycle of singleton beans but it does not completely manage the lifecycle
of prototype beans. This is because there might be a large number of prototype instances and the 
container can become overwhelmed keeping track of them.


 Post initialization method is called but the Pre-destruction method is not called for prototype beans.