package Bridge.Shape;

public class Circle extends Shape{
    private int radius;
    public Circle (int radius, DrawAPI drawAPI)
    {
        this.drawAPI = drawAPI;
        this.drawAPI.setRadius(radius);
        this.radius = radius;
       // System.out.println("Circle is created");
    }

    @Override
    public void draw() {
        drawAPI.draw();
    }

    @Override
    public double area() {
        return 3.14*radius*radius;
    }
}
