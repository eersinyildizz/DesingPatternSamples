import PlugConnector.IUkPlugConnector;
import PlugConnector.TurkeyPlugConnector;

/**
 * Created by Ersin on 6/4/2017.
 */
public class TurkeyToUKPlugConnectorAdapter implements IUkPlugConnector {

    private TurkeyPlugConnector trPlug;

    public TurkeyToUKPlugConnectorAdapter(TurkeyPlugConnector trPlug) {
        this.trPlug = trPlug;
    }


    @Override
    public void provideElectricityUK() {
        trPlug.provideElectricityTR();
    }
}
