package Bridge.Shape;

public class GreenRectangle extends DrawAPI{
    public GreenRectangle() {
        System.out.println("Green rectangle is created");
    }

    @Override
    public void draw() {
        System.out.println("Draw:: Green rectangle of dimension :: " + length + " " + width);
    }
}
