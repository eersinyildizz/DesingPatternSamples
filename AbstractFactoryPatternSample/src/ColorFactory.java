import Color.Blue;
import Color.Green;
import Color.IColor;
import Color.Red;
import Shapes.IShape;

/**
 * Created by Ersin on 6/3/2017.
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public IShape getShape(String shape) {
        return null;
    }

    @Override
    public IColor getColor(String color) {
        if (color == null)
            return null;
        if (color.equalsIgnoreCase("red"))
            return new Red();
        else if (color.equalsIgnoreCase("green"))
            return new Green();
        else if (color.equalsIgnoreCase("blue"))
            return new Blue();
        else
            return null;
    }
}
