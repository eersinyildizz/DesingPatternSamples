import Order.IOrder;

import java.util.ArrayList;

/**
 * Created by Ersin on 6/4/2017.
 */
public class Broker {

    private ArrayList<IOrder> orderList = new ArrayList<IOrder>();

    public void TakeOrder(IOrder order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (IOrder order: orderList
             ) {
            order.execute();
        }
    }
}
