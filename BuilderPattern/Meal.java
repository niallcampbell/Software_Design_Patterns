import java.util.ArrayList;
import java.util.List;

/**
 *  A Meal consists of a number of items which are stored in an ArrayList.
 *  
 *  This class provides the methods and variables of a meal object. 
 * 
 * @author Niall Campbell
 * @version 1.0
 */
public class Meal
{
   //instance variable
   //array list to store the items in a meal
   private List<Item> items = new ArrayList<Item>();    
   
   //default constructor
   public Meal()
   {
       
   }

   //add items to the meal
   public void addItem(Item item)
   {
      items.add(item);
   }

   //return the total cost of the meal
   public float getCost()
   {
      float cost = 0.0f;
      
      for (Item item : items)
      {
         cost += item.price();
      } 
      
      return cost;
   }

   //Print the items in a meal
   public void showItems()
   {
      for (Item item : items)
      {
         System.out.print("Item : " + item.name());
         System.out.print(", Packing : " + item.packing().pack());
         System.out.println(", Price : " + item.price());
      }     
   }    
}
