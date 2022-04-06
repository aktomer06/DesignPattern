package Factory.Test;

import Factory.Shape.Rectangle;
import Factory.Shape.Shape;
import Factory.Shape.ShapeFactory;
import Factory.Shape.ShapeType;

public class Shape_Client {
    public static void main(String[] args) {
        Shape rectangle = ShapeFactory.getInstance().createShape(ShapeType.RECTANGLE);
        rectangle.draw();

        Shape circle = ShapeFactory.getInstance().createShape(ShapeType.CIRCLE);
        circle.draw();

        Shape square = ShapeFactory.getInstance().createShape(ShapeType.SQUARE);
        square.draw();
    }
}
