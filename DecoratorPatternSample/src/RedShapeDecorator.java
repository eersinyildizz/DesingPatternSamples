import Shapes.IShape;

/**
 * Created by Ersin on 6/3/2017.
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(IShape shape) {
        super(shape);
    }

    public void  draw(){
        _shape.draw();
        setBorder(_shape);
    }

    private void setBorder(IShape shape) {
        System.out.println("Border is red");
    }


}
