package Bridge.Shape;

public class GreenCircle extends DrawAPI{
    private int radius;
    public GreenCircle() {
        System.out.println("Green circle is created");
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public void draw() {
        System.out.println("Draw::Green Circle of radius " + radius);
    }
}
