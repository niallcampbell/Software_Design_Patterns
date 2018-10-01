
/**
 * Provides an abstract class that implements the item interface providing default functionalities.
 * 
 * Abstract classes are similar to interfaces. You cannot instantiate them, and they may contain a mix of methods declared with or without an implementation. 
 * 
 * @author Niall Campbell
 * @version 1.0
 */
public abstract class Burger implements Item
{
    @Override
    public Packing packing()
    {
        return new Wrapper();
    }
    
    @Override
    public abstract float price();
}
