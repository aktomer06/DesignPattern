package Abstract_Factory.Shape;

import java.security.InvalidParameterException;

public class RoundedShapeFactory implements AbstractShapeFactory{
    private static RoundedShapeFactory roundedShapeFactory = new RoundedShapeFactory();

    public static RoundedShapeFactory getInstance(){
        return roundedShapeFactory;
    }
    RoundedShapeFactory(){
        System.out.println("Rounded Shape factory is created");
    }

    @Override
    public Shape getShape(ShapeType shapeType) {
        switch (shapeType)
        {
            case RECTANGLE -> {
                return new RoundedRectangle();
            }
            case SQUARE -> {
                        return new RoundedSquare();
                    }
        }
        throw new InvalidParameterException();
    }
}
