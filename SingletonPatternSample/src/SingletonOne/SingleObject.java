package SingletonOne;

import java.util.Random;

/**
 * Created by Ersin on 6/4/2017.
 */
public class SingleObject {


    private static SingleObject _instance ;
    private int r;
    
    private SingleObject(){
        r = new Random().nextInt(100000);
    }

    public static SingleObject getInstance(){
        if (_instance == null)
            _instance = new SingleObject();
        return _instance;
    }

    public void message(){
        System.out.println("singleton created. value  : "+r);
    }

}
