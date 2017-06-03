import Color.IColor;
import Shapes.IShape;

/**
 * Created by Ersin on 6/3/2017.
 */
public abstract class AbstractFactory {

    public abstract IShape getShape(String shape);

    public abstract IColor getColor(String color);

}
