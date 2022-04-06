package Factory.Shape;

public class Circle implements Shape{
    Circle(){
        System.out.println("Circle is created");
    }

    @Override
    public void draw() {
        System.out.println("Draw::Circle");
    }
}
