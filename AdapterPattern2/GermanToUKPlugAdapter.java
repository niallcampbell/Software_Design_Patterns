
/**
 *  Allows you to plug a German plug into a UK socket. 
 * 
 *  Takes in a GermanPlug. Then wraps the German giveElectricity() method in a UK provideElectricity() method. 
 * 
 * @author Niall Campbell
 * @version 1.0
 */
public class GermanToUKPlugAdapter implements UKPlug
{
    private GermanPlug plug;
    
    //constructor
    public GermanToUKPlugAdapter(GermanPlug plug)
    {
        this.plug = plug;
    }
    
    //overrides the provideElectricity() method from the UKPlug interface. 
    @Override
    public void provideElectricity()
    {
        //uses the giveElectricity() method from the GermanPlug interface
        plug.giveElectricity();
    }
}

