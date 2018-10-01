
/**
 * This class demos the factory pattern.
 * 
 * @author Niall Campbell
 * @version 1.0
 */
public class Main
{
    public static void main()
    {
        ShapeFactory shapeFactory = new ShapeFactory();
        
        Shape shape1 = shapeFactory.getShape("Circle");
        shape1.draw();
        
        Shape shape2 = shapeFactory.getShape("Rectangle");
        shape2.draw();
        
        Shape shape3 = shapeFactory.getShape("Square");
        shape3.draw();
    }
}
