
/**
 * The ShapeFactory class is used to create a ShapeFactory object.
 * 
 * The FactoryProducer class will create these objects however and will hide the underlying logic from the user. 
 * 
 * @author Niall Campbell
 * @version 1.0
 */

public class ShapeFactory extends AbstractFactory 
{
   public Shape getShape(String shapeType)
   {
      if(shapeType == null)
      {
         return null;
      }		
      
      if(shapeType.equalsIgnoreCase("CIRCLE"))
      {
         return new Circle();
      }
      else if(shapeType.equalsIgnoreCase("RECTANGLE"))
      {
         return new Rectangle();
      }
      else if(shapeType.equalsIgnoreCase("SQUARE"))
      {
         return new Square();
      }
      
      return null;
   }
   
   Colour getColour(String colour)
   {
      return null;
   }
}