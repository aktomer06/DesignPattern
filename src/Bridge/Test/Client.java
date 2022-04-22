package Bridge.Test;

import Bridge.Shape.*;

public class Client {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100, new RedCircle());
        redCircle.draw();
        System.out.println("Area of circle is : " + redCircle.area());
        Shape greenCircle = new Circle(200, new GreenCircle());
        greenCircle.draw();
        System.out.println("Area of circle is : " + greenCircle.area());
        
        Shape redRectangle = new Rectangle(100, 200, new RedRectangle());

        redRectangle.draw();
        System.out.println("Area of rectangle is : " + redRectangle.area());
    }
}
