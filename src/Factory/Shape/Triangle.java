package Factory.Shape;

public class Triangle implements Shape{
    public Triangle(){
        System.out.println("Triangle is created");
    }
    @Override
    public void draw() {
        System.out.println("Draw::Triangle");
    }
}
