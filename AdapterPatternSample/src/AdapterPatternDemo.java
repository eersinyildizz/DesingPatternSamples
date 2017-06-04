import PlugConnector.IUkPlugConnector;
import PlugConnector.TurkeyPlugConnector;
import PlugConnector.UKPlugConnector;

/**
 * Created by Ersin on 6/4/2017.
 */
public class AdapterPatternDemo {
    public static void main(String[] args){

        IUkPlugConnector plufUk = new UKPlugConnector();
        plufUk.provideElectricityUK();
        IUkPlugConnector plug = new TurkeyToUKPlugConnectorAdapter(new TurkeyPlugConnector());
        plug.provideElectricityUK();
    }
}
