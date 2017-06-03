/**
 * Created by Ersin on 6/3/2017.
 */
public class FacadePatternDemo {

    public static void main(String[] Args){

        ShapeMaker maker = new ShapeMaker();

        maker.drawSquare();
        maker.drawRectangle();
        maker.drawCircle();
    }
}
