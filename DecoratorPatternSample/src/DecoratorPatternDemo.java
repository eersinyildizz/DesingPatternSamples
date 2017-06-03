import Shapes.Circle;

/**
 * Created by Ersin on 6/3/2017.
 */
public class DecoratorPatternDemo {

    public static void main(String[] args){


        RedShapeDecorator red = new RedShapeDecorator(new Circle());

        red.draw();
    }
}
