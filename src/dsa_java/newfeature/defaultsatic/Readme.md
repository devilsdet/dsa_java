Every method inside Interface up to 1.7 are public and abstract.

In 1.8 Version default methods are allowed inside a interface.

In all versions, we will have public static final varibales. There  is no change in the variable scope

Default Method ( Virtual Extension Method / Defender Method )
================================================================

Up to java 1.7 we have interfaces and every method inside interfaces are public abstract.
And every class that implements the interface has to override this method and this is the reason why it was never recommended
to add any methods to interfaces.

To overcome this problem, java people came with an approach where they can add methods to interface
but the newly added methods are not needed to be overridden. Without effecting implementation
classes if you want to add new method to the interface then we should use default methods.

Why the word default?
===================================
Here default is not modifiers. Because this method has already implementation.
We can override the method in implemented classes.

The default keyword came in to picture.

Default method will have implmentation in this method.

We cannot use default methods in class.

Object class methods we can not implement as default methods.

Java doesnt provide support for multiple inheritance. If multiple parents have smae method, 
then compiler cant decide which method to use in child class. It is called diamond access problem
or ambiguite problem.

But in default word we can override the default method.
Suppose we have two interfaces with one m1 method and we implement both these
interfaces in our class. Then we need to override the method in our class.
If we want to call m1 method then we need to use interface name with super keyword to access the defaults of interface


Static Method
==============================
Static methods are not related to objects. Hence java people allowed interfaces do contain
static method.


we can not use static and defualt in one method.
