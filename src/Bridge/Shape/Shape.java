package Bridge.Shape;

public abstract class Shape {
    public DrawAPI drawAPI;
    public abstract void draw();
    public abstract double area();
}
