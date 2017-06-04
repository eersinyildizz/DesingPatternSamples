package Order;

/**
 * Created by Ersin on 6/4/2017.
 */
public class SellStock implements IOrder {

    private Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.Sell();
    }
}
