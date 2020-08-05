
/**
 * Write a description of class Food here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Food
{
    String itemName;
    Person owner;
    
    public Food(String itemName, Person owner)
    {
        this.itemName = itemName;
        this.owner = owner;
    }
    
    public String getItemName()
    {
        return itemName;
    }
    
    public String getOwnerName()
    {
        return owner.getPersonsName();
    }
    
    public void printDetailsOfFoodItem()
    {
        System.out.println("Item: " + itemName + ", " + "Owner: " + owner.getPersonsName());
    }
}
