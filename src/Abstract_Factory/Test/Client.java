package Abstract_Factory.Test;

import Abstract_Factory.Shape.*;

public class Client {
    public static void main(String[] args) {
        AbstractShapeFactory normalShape = ShapeProducerFactory.getInstance().getShapeFactory(ShapeStructure.NORMAL);

        Shape shape = normalShape.getShape(ShapeType.RECTANGLE);
        shape.draw();

        Shape shape1 = normalShape.getShape(ShapeType.SQUARE);
        shape1.draw();

        AbstractShapeFactory roundedShape = ShapeProducerFactory.getInstance().getShapeFactory(ShapeStructure.ROUNDED);

        Shape shape2 = roundedShape.getShape(ShapeType.RECTANGLE);
        shape2.draw();

        Shape shape3 = roundedShape.getShape(ShapeType.SQUARE);
        shape3.draw();
    }
}
