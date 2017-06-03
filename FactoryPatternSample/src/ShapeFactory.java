import Shapes.Circle;
import Shapes.IShape;
import Shapes.Rectangle;
import Shapes.Square;

/**
 * Created by Ersin on 6/3/2017.
 */
public class ShapeFactory {

    public IShape getShape(String type){
        if (type == null)
            return null;
        if (type.equalsIgnoreCase("circle"))
            return new Circle();
        else if (type.equalsIgnoreCase("rectangle"))
            return new Rectangle();
        else if (type.equalsIgnoreCase("square"))
            return new Square();
        else
            return null;
    }
}
