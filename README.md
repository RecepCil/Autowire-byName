# Autowire-byName
Specifiesing autowiring by property name. If you use "Autowiring by Type" and there is several bean from same class, autowire byType can't match with any bean. In this situation, you can use "Autowiring by Name". It will find bean which has same id with setter method of the class for injecting the value
