
/**
 *  ZestPlug is a type of German plug. Itcan be plugged into German electrical sockets. 
 * 
 * @author Niall Campbell
 * @version 1.0
 */
public final class ZestPlug implements GermanPlug
{
    public void giveElectricity()
    {
        System.out.println("giving electricity to a zest plug.");
    }
}
