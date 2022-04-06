package Factory.Shape;

import java.security.InvalidParameterException;

public class ShapeFactory {
    private static ShapeFactory shapeFactory = new ShapeFactory();
    public ShapeFactory(){
        System.out.println("Shape factory is created");
    }
    public static ShapeFactory getInstance(){
        return shapeFactory;
    }
    public Shape createShape(ShapeType shapeType){
        switch (shapeType)
        {
            case RECTANGLE -> {
                return new Rectangle();
            }
            case SQUARE -> {
                return new Square();
            }
            case CIRCLE -> {
                return new Circle();
            }
            case TRIANGLE -> {
                return new Triangle();
            }
        }
        throw new InvalidParameterException();
    }
}
