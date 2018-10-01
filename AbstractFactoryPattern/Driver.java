
/**
 * Write a description of class Driver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Driver
{
    public static void main()
    {
      AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE"); //Create shapeFactory for creating Shape objects 
      Shape shape1 = shapeFactory.getShape("CIRCLE");
      shape1.draw();
      Shape shape2 = shapeFactory.getShape("RECTANGLE");
      shape2.draw();
      Shape shape3 = shapeFactory.getShape("SQUARE");
      shape3.draw();

      
      AbstractFactory colourFactory = FactoryProducer.getFactory("COLOUR"); //Create colourFactory for creating Colour objects 
      Colour colour1 = colourFactory.getColour("RED");
      colour1.fill();
      Colour colour2 = colourFactory.getColour("Green");
      colour2.fill();
      Colour colour3 = colourFactory.getColour("BLUE");
      colour3.fill();
   }
}
