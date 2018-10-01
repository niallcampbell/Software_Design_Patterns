
/**
 *  This is a concrete class that inherits from the Shape interface. 
 *  A concrete class provides implementations for the functionality of the abstract classes defined in the interface. 
 *  Concrete classes are the ones which provide implementation of all its parents' behavior i.e. a class which provides the implementation of all the methods that it has inherited from a superclass or interface. 
 *  A concrete class will not have any abstract methods.
 * 
 * @author Niall Campbell 
 * @version 1.0
 */
public class Rectangle implements Shape
{
    public void draw()
    {
        System.out.println("Draw Rectangle");
    }
}
