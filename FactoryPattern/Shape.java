
/**
 *  The following interface is for a Factory design pattern example.
 *  
 *  An interface contains behaviors that a class implements.
 *  Interfaces specify what a class must do and not how. It is the blueprint of the class.
 *  It specifies a set of methods and variables that the class has to define and implement.
 *  All the methods of the interface need to be defined in the class.
 *  All of the methods in an interface are abstract, i.e. there is no default implementation for it and an implementing class will provide the details.
 *  
 * 
 * @author Niall Campbell
 * @version 1.0
 */
public interface Shape
{
    void draw(); //any class that inherits from the Shape interface will have to define this method
}
