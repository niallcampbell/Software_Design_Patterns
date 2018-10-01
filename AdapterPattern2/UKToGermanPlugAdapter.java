
/**
 *  Enables a UK plug to be plugged into a German socket. 
 * 
 * @author Niall Campbell
 * @version 1.0
 */
public class UKToGermanPlugAdapter implements GermanPlug
{
    private UKPlug plug;
    
    //constructor
    public UKToGermanPlugAdapter(UKPlug plug)
    {
        this.plug = plug;
    }
    
    //overrides the GermanPlug method giveElectricity()
    //in the method it calls the UK provideElectricity() method on the UKPlug object. 
    @Override
    public void giveElectricity()
    {
        plug.provideElectricity();
    }
}
