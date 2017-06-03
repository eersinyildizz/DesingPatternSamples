package Strategy;

/**
 * Created by Ersin on 6/3/2017.
 */
public class PaypalStrategy implements IStrategy {

    private String Email;
    private String Password;

    public PaypalStrategy(String email, String password) {
        Email = email;
        Password = password;
    }


    @Override
    public void pay(int amount) {
        System.out.println(amount+"payed from PayPal account");
    }
}
