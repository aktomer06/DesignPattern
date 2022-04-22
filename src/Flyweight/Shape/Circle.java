package Flyweight.Shape;

public class Circle implements Shape{
    String color;
    int x;
    int y;
    int radius;
    public Circle(){
        System.out.println("Circle is created");
    }

    @Override
    public void draw() {
        System.out.println("Draw:: Circle:: Color: " + color + "x:y:Radius :: " + x +" " + y + " " + radius);
    }
}
