import Shapes.IShape;

/**
 * Created by Ersin on 6/3/2017.
 */
public class FactoryPatternDemo {

    public static void main(String[] Args){

        ShapeFactory shape = new ShapeFactory();
        IShape result;
        //To get circle shape
        IShape resultCircle = shape.getShape("circle");
        resultCircle.draw();
        // To get rectangle
        IShape resultRectangle = shape.getShape("rectangle");
        resultRectangle.draw();
        // To get ssquare
        IShape resultSquare = shape.getShape("square");
        resultSquare.draw();
    }
}
