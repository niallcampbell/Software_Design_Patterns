
/**
 *  Tests the other classes. 
 * 
 *  @author Niall Campbell
 *  @version 1/10/18
 */
public class Driver
{
    public static void main()
    {
        //Using facade:
        ShapeMaker sm = new ShapeMaker(); //object of the facade class. 
        sm.drawCircle();
        sm.drawRectangle();
        sm.drawSquare();
        
        System.out.println();
        
        //not using facade:
        Circle c = new Circle();
        c.draw();
        Rectangle r = new Rectangle();
        r.draw();
        Square s = new Square();
        s.draw();
        
        //facade is quicker. 
    }
}
