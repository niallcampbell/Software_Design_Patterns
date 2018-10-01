
/**
 * The ColourFactory class is used to create a ColourFactory object.
 * 
 * The FactoryProducer class will create these objects however and will hide the underlying logic from the user. 
 * 
 * @author Niall Campbell
 * @version 1.0
 */

public class ColourFactory extends AbstractFactory 
{  
   public Shape getShape(String shapeType)
   {
      return null;
   }
   
   Colour getColour(String colour)
   {
      if(colour == null)
      {
         return null;
      }		
      
      if(colour.equalsIgnoreCase("RED"))
      {
         return new Red();
      }
      else if(colour.equalsIgnoreCase("GREEN"))
      {
         return new Green();
      }
      else if(colour.equalsIgnoreCase("BLUE"))
      {
         return new Blue();
      }
      
      return null;
   }
}
