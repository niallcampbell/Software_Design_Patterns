import java.util.Scanner;
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main
{
    public static void main()
    {
        Scanner scan = new Scanner(System.in);
        
        Fridge fridge = Fridge.openFridge();
        
        int optionSelectedByUser = -1;
        
        while(true)
        {
            System.out.println("Enter a number for what you wish to do: ");
            System.out.println("0: Close fridge door");
            System.out.println("1: Put an item in the fridge");
            System.out.println("2: Remove an item from the fridge");
            
            optionSelectedByUser = scan.nextInt();
            scan.nextLine();
            
            if(optionSelectedByUser == 1)
            {
                System.out.println("Enter Name: ");
                String name = scan.nextLine();
                Person person = new Person(name);
                
                System.out.println("Enter Food: ");
                String inputFood = scan.nextLine();
                Food food = new Food(inputFood, person);
                fridge.putItemInFridge(food);
            }
            else if(optionSelectedByUser == 2)
            {
                Food food = fridge.removeLastItemFromFridge();
                
                if(food != null)
                {
                    System.out.println("You have removed: ");
                    food.printDetailsOfFoodItem();
                }
                
            }
            else if(optionSelectedByUser == 0)
            {
                break;
            }
            
        }
        
        fridge.lookInFridge();
    }
    
}
