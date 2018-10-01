
/**
 *  The Singleton Pattern ensures that a class has only one instance, and provide a global point of access to it.
 * 
 * @author Niall Campbell
 * @version 1.0
 */
public class SingleObject
{
    //create an object of SingleObject
    //static means that only a single copy of the object's variables are created and shared
    private static SingleObject instance = new SingleObject();
    
    //Private Constructor
    //means that this class cannot be instantiated outside it
    private SingleObject()
    {
    }
    
    //method returns the only instance of the object
    //provides global access to the object
    public static SingleObject getInstance()
    {
        return instance;
    }
    
    public void showMessage()
    {
        System.out.println("Single Object");
    }
}
