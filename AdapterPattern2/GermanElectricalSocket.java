
/**
 *  A GermanElectricalSocket can only take plugs that are of type German. 
 * 
 * @author Niall Campbell
 * @version 1.0
 */
public class GermanElectricalSocket
{
    public void plugIn(GermanPlug plug)
    {
        plug.giveElectricity();
    }
}


