import Order.BuyStock;
import Order.Stock;

/**
 * Created by Ersin on 6/4/2017.
 */
public class CommandPatternDemo {
    public static void main(String[] args){
        Stock stck = new Stock();

        BuyStock buy = new BuyStock(stck);

        Broker brkr = new Broker();
        brkr.TakeOrder(buy);

        brkr.placeOrders();
    }
}
