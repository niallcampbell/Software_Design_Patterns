
/**
 * Provides an abstract class that implements the item interface providing default functionalities.
 * 
 * @author Niall Campbell
 * @version 1.0
 */
public abstract class ColdDrink implements Item
{
    @Override
    public Packing packing()
    {
        return new Wrapper();
    }
    
    @Override
    public abstract float price();
}
