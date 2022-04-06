package Factory.Shape;

public class Square implements Shape{
    Square(){
        System.out.println("Square is created");
    }

    @Override
    public void draw() {
        System.out.println("Draw::Square");
    }
}
