package PlugConnector;

/**
 * Created by Ersin on 6/4/2017.
 */
public class UKPlugConnector implements IUkPlugConnector {
    @Override
    public void provideElectricityUK() {
        System.out.println("UK plug connected");
    }
}
