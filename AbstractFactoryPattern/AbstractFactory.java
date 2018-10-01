
/**
 * The following is an abstract class to get factories for Color and Shape Objects. 
 * 
 * An AbstractFactory essentially defines the blueprint for factory objects. 
 * 
 * The factory classes that are used to create objects must follow this template. 
 * 
 * @author Niall Campbell 
 * @version 1.0
 */

public abstract class AbstractFactory
{
   abstract Colour getColour(String colour);
   abstract Shape getShape(String shape) ;
}

