package Factory.Shape;

public class Rectangle implements Shape{
    Rectangle(){
        System.out.println("Rectangle is created");
    }
    @Override
    public void draw() {
        System.out.println("Draw::Rectangle");
    }
}
