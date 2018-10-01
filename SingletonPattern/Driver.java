
/**
 *  Driver class for creating the SingleObject
 * 
 * @author Niall Campbell
 * @version 1.0
 */
public class Driver
{
    public static void main()
    {
        //n.b. this isn't allowed as the constructor is private
        //SingleObject obj = new SingleObject();
        
        //returns the only object available
        SingleObject obj = SingleObject.getInstance();
        
        //prints the message
        obj.showMessage();
    }
}
