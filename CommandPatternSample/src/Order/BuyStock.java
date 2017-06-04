package Order;

/**
 * Created by Ersin on 6/4/2017.
 */
public class BuyStock implements IOrder {

    private Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }


    @Override
    public void execute() {
        stock.Buy();
    }
}
