package Abstract_Factory.Shape;

public interface AbstractShapeFactory {
    public Shape getShape(ShapeType shapeType);
}
