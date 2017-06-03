import Strategy.PaypalStrategy;

/**
 * Created by Ersin on 6/3/2017.
 */
public class StrateggyPatterDemo {

    public static void main(String[] args){
        ShoppingCart shop = new ShoppingCart(new PaypalStrategy("eersinyildizz@gmail.com","123"));
        shop.ExecutePayment(100);
    }
}
