Reflection in Java
Reflection is a runtime API for inspecting and changing the behavior of methods, classes, and interfaces. The java.lang.reflect package contains the required reflection classes. Reflection tells about the class to which an object belongs and the methods of that class that can be used for the object. One can call the methods at runtime using reflection regardless of the access specifier used.
Reflection helps when thinking about:
Class: The getClass() function is used to figure out what class an object belongs to.
Constructors: Reflection helps to get the public constructors of the class to which an object belongs using the getConstructors() function.
Methods: The public methods of the class to which an object belongs are obtained using the getMethods() method.





Uses:
The Reflection API is mostly used in the following applications:
Eclipse, MyEclipse, NetBeans, and other IDEs (Integrated Development Environments) are examples.
Debugging
Tools for testing, etc.



The Benefits of Reflection:
Extensibility Features: By generating instances of extensibility objects with their fully-qualified names, an implementation may use external, user-defined classes.
Debugging and debugging tools: Debuggers inspect private members on classes using the reflection property.

