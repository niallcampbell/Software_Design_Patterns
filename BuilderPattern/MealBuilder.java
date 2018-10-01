
/**
 * This is the builder class responsible for creating Meal objects.
 * 
 * A Meal object is a complex object because it requires a lot to create the object. 
 * 
 * So in the Driver class instead of going to the trouble of creating meals line by line, just use this class. 
 * 
 * @author Niall Campbell
 * @version 1.0
 */
public class MealBuilder
{
   //Creates a vegetarian meal
   public Meal prepareVegMeal()
   {
      Meal meal = new Meal();
      meal.addItem(new VegBurger());
      meal.addItem(new Coke());
      return meal;
   }   

   //creates a normal meal
   public Meal prepareNonVegMeal()
   {
      Meal meal = new Meal();
      meal.addItem(new ChickenBurger());
      meal.addItem(new Pepsi());
      return meal;
   }
}
