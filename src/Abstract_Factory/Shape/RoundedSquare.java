package Abstract_Factory.Shape;

public class RoundedSquare implements Shape{
    RoundedSquare(){
        System.out.println("Rounded Square is created");
    }

    @Override
    public void draw() {
        System.out.println("Draw:: Rounded Square");
    }
}
