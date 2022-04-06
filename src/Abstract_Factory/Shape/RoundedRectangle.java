package Abstract_Factory.Shape;

public class RoundedRectangle implements Shape{
    RoundedRectangle(){
        System.out.println("Rounded Rectangle is created");
    }

    @Override
    public void draw() {
        System.out.println("Draw::Rounded Rectangle");
    }
}
