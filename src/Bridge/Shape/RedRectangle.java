package Bridge.Shape;

public class RedRectangle extends DrawAPI{
    public RedRectangle() {
        System.out.println("Red Rectangle is created");
    }

    @Override
    public void draw() {
        System.out.println("Draw:: Red rectangle of dimension :: " + length + " " + width);
    }
}
