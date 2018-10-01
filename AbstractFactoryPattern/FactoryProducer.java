
/**
 * The FactoryProducer class will create a factory object based on the info that is passed to it.
 * 
 * It will hide the underlying logic from the user. 
 * 
 * @author Niall Campbell 
 * @version 1.0
 */

public class FactoryProducer
{
   public static AbstractFactory getFactory(String choice)
   {
      if(choice.equalsIgnoreCase("SHAPE"))
      {
         return new ShapeFactory();
      }
      else if(choice.equalsIgnoreCase("COLOUR"))
      {
         return new ColourFactory();
      }
      
      return null;
   }
}
