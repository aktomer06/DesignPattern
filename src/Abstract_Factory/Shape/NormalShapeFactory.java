package Abstract_Factory.Shape;

import java.security.InvalidParameterException;

public class NormalShapeFactory implements AbstractShapeFactory{
    private static NormalShapeFactory normalShapeFactory = new NormalShapeFactory();
    NormalShapeFactory(){
        System.out.println("Normal Shape Factory is created");
    }
    public static NormalShapeFactory getInstance(){
        return normalShapeFactory;
    }

    @Override
    public Shape getShape(ShapeType shapeType) {
        switch (shapeType){
            case RECTANGLE -> {
                return new Rectangle();
            }
            case SQUARE -> {
                return new Square();
            }
        }
        throw new InvalidParameterException();
    }
}
