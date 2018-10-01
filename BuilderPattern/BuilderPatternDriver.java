
/**
 *  The Driver class doesn't create and assemble the Meal objects directly. Instead, the Driver refers to the Builder class for building (creating and assembling) the parts of the meal (complex object). 
 * 
 * @author Niall Campbell
 * @version 1.0
 */
public class BuilderPatternDriver
{
    public static void main()
    {
        MealBuilder mealBuilder = new MealBuilder();
        
        Meal vegMeal = mealBuilder.prepareVegMeal(); //Creates a vegMeal using the Builder class. 
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());
        
        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();  //Creates a nonVegMeal using the Builder class. 
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
    }
}
