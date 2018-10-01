
/**
 *  Used to test the other classes. 
 * 
 * @author Niall Campbell
 * @version 1.0
 */
public class Driver
{
    public static void main()
    {
        //Plug German plug into UK socket
        GermanPlug gerPlug = new ZestPlug(); //create a German plug
        UKElectricalSocket ukSocket = new UKElectricalSocket(); //create a UK socket
        UKPlug ukAdapter = new GermanToUKPlugAdapter(gerPlug); //create a german to UK plug adapter. 
        ukSocket.plugIn(ukAdapter); //plug in the German plug to the UK socket
        
        //Plug the UK plug into the German socket
        UKPlug ukPlug = new Furutech(); //create UK plug
        GermanElectricalSocket gerSocket = new GermanElectricalSocket();//create German socket
        GermanPlug gerAdapter = new UKToGermanPlugAdapter(ukPlug); //create UK to German adapter. 
            //creates a German plug out of a UK one and passes this to the German socket. 
        gerSocket.plugIn(gerAdapter);
    }
}
