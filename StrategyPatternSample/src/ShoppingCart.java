import Strategy.IStrategy;

/**
 * Created by Ersin on 6/3/2017.
 */
public class ShoppingCart {

    private IStrategy _strategy;

    public ShoppingCart(IStrategy strategy) {
        this._strategy = strategy;
    }

    public void ExecutePayment(int amount){
    _strategy.pay(amount);
    }
}
