package Abstract_Factory.Shape;

import java.security.InvalidParameterException;

public class ShapeProducerFactory {
    private static ShapeProducerFactory shapeProducerFactory = new ShapeProducerFactory();
    ShapeProducerFactory(){
        System.out.println("Shape Producer Factory is created");
    }
    public static ShapeProducerFactory getInstance()
    {
        return shapeProducerFactory;
    }
    public AbstractShapeFactory getShapeFactory(ShapeStructure shapeStructure) {
        switch (shapeStructure)
        {
            case ROUNDED -> {
                return RoundedShapeFactory.getInstance();
            }
            case NORMAL -> {
                return NormalShapeFactory.getInstance();
            }
        }
        throw new InvalidParameterException();
    }
}
