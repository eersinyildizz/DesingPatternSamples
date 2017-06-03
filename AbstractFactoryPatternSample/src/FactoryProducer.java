/**
 * Created by Ersin on 6/3/2017.
 */
public class FactoryProducer {

    public AbstractFactory getFactory(String factory){

        if (factory.equalsIgnoreCase("shape"))
            return new ShapeFactory();
        else if (factory.equalsIgnoreCase("color"))
            return new ColorFactory();

        return null;
    }
}
