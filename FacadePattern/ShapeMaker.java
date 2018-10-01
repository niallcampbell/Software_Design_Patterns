
/**
 *  This is the facade class. This enables you to create Shape objects while hiding their underlying logic. 
 *  
 *  It hides the complexities of the system and provides an interface to the client using which the client can access the system. 
 * 
 *  @author Niall Campbell
 *  @version 1/10/18
 */
public class ShapeMaker
{
   private Shape circle;
   private Shape rectangle;
   private Shape square;
   
   /**
    * Constructor
    */
   public ShapeMaker()
   {
       circle = new Circle();
       rectangle = new Rectangle();
       square = new Square();
   }
   
   public void drawCircle()
   {
       circle.draw();
   }
   
   public void drawRectangle()
   {
       rectangle.draw();
   }
   
   public void drawSquare()
   {
       square.draw();
   }
}
