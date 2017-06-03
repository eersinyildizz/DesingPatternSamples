import Shapes.Circle;
import Shapes.IShape;
import Shapes.Rectangle;
import Shapes.Square;

/**
 * Created by Ersin on 6/3/2017.
 */
public class ShapeMaker {

    private IShape circle;
    private IShape rectangle;
    private IShape square;

    public ShapeMaker() {
        this.circle = new Circle();
        this.rectangle = new Rectangle();
        this.square = new Square();
    }

    public void drawCircle(){
        System.out.println("Circle was drawed");
    }

    public void drawRectangle(){
        System.out.println("Rectangle was drawed");
    }

    public void drawSquare(){
        System.out.println("Square was drawed");
    }
}
