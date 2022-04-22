package Bridge.Shape;

public class RedCircle extends DrawAPI {
    public RedCircle() {
        System.out.println("Red circle is created");
    }
    @Override
    public void draw() {
        System.out.println("Draw:: Red circle of radius " + radius);
    }
}
