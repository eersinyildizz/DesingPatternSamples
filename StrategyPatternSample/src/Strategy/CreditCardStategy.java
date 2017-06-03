package Strategy;

/**
 * Created by Ersin on 6/3/2017.
 */
public class CreditCardStategy implements IStrategy {

    private String Name;
    private int CardNumber;
    private int cvv;

    public CreditCardStategy(String name, int cvv) {
        Name = name;
        this.cvv = cvv;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + "payed from CreditCard");
    }
}
