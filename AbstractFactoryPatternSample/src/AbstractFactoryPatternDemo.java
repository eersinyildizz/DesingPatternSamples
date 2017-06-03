import Color.IColor;

/**
 * Created by Ersin on 6/3/2017.
 */
public class AbstractFactoryPatternDemo {

    public static void main(String[] args){

        FactoryProducer producer = new FactoryProducer();

        // Create color
        AbstractFactory factoryColor = producer.getFactory("color");
        // get red color
        IColor colorRed = factoryColor.getColor("red");

        colorRed.fill();

        // Create Shapes
        AbstractFactory factoryShape = producer.getFactory("shape");
        // get circle
        factoryShape.getShape("circle").draw();
    }
}
