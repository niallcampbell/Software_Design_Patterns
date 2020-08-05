
/**
 * Singleton Fridge: different people can put different food items into only one fridge
 * 
 */
public class Fridge
{
    private static Fridge ourFridge = null; //single instance of fridge
    Food[] contentsOfFridge; //acts as a stack
    int index = -1;
    
    private Fridge()
    {
        contentsOfFridge = new Food[3];
    }
    
    /**
     * Return fridge singleton object
     */
    public static Fridge openFridge()
    {
        if(ourFridge == null)
        {
            ourFridge = new Fridge();
        }
        
        return ourFridge;
    }
    
    public void putItemInFridge(Food item)
    {
        if(index >= 2)
        {
            System.out.println("Fridge is full!");
        }
        else
        {
            index++;
            contentsOfFridge[index] = item;
        }
    }
    
    public Food removeLastItemFromFridge()
    {
        if(index == -1)
        {
            System.out.println("The fridge is empty!");
            return null;
        }
        else
        {
            Food foodItem = contentsOfFridge[index--];
            return foodItem;
        }
        
    }
    
    public void lookInFridge()
    {
        if(index == -1)
        {
            System.out.println("The fridge is empty!");
        }
        
        System.out.println("Items in fridge: ");
        
        for(int i = 0; i < index + 1; i++)
        {
            contentsOfFridge[i].printDetailsOfFoodItem();
        }
    }
    
}
