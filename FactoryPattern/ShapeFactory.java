
/**
 * This class is a factory that will create an object from the concrete classes based on the information that is given to it. 
 * 
 * @author Niall Campbell
 * @version 1.0
 */
public class ShapeFactory
{
    //this method returns an object that implements the Shape interface
    public Shape getShape(String shapeType)
    {
      if(shapeType == null)
      {
         return null;
      }	
      
      if(shapeType.equals("Circle"))
      {
          return new Circle();
      }
      else if(shapeType.equals("Rectangle"))
      {
          return new Rectangle();
      }
      else if(shapeType.equals("Square"))
      {
          return new Square();
      }
      
      return null;
    }
}
