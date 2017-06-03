import Color.IColor;
import Shapes.Circle;
import Shapes.IShape;
import Shapes.Rectangle;
import Shapes.Square;

/**
 * Created by Ersin on 6/3/2017.
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public IShape getShape(String shape) {
        if (shape == null)
            return null;
        if (shape.equalsIgnoreCase("rectangle"))
            return new Rectangle();
        else if (shape.equalsIgnoreCase("circle"))
            return new Circle();
        else if (shape.equalsIgnoreCase("square"))
            return new Square();
        else
            return null;
    }

    @Override
    public IColor getColor(String color) {
            return null;
    }
}
