import Shapes.IShape;

/**
 * Created by Ersin on 6/3/2017.
 */
public abstract class ShapeDecorator implements IShape {

    protected IShape _shape;

    public ShapeDecorator(IShape shape){
        this._shape = shape;
    }
    @Override
    public void draw() {
        _shape.draw();
    }
}
