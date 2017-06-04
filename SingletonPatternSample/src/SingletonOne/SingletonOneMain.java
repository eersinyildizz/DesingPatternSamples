package SingletonOne;

/**
 * Created by Ersin on 6/4/2017.
 */
public class SingletonOneMain {
    public static void main(String[] args){
        SingleObject object = SingleObject.getInstance();
        object.message();

        SingleObject object2 = SingleObject.getInstance();
        object2.message();
    }
}
