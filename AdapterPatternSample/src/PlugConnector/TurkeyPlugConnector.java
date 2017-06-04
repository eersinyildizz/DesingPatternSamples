package PlugConnector;

/**
 * Created by Ersin on 6/4/2017.
 */
public class TurkeyPlugConnector implements ITurkeyPlugConnector {
    @Override
    public void provideElectricityTR() {
        System.out.println("Turkey plug connected");
    }

}
