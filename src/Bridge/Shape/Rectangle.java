package Bridge.Shape;

public class Rectangle extends Shape{
    private DrawAPI drawAPI;
    private int length;
    private int width;
    public Rectangle(int length, int width, DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
        drawAPI.setLength(length);
        drawAPI.setWidth(width);
        this.length = length;
        this.width = width;
        //System.out.println("Rectangle is created");
    }

    @Override
    public void draw() {
        drawAPI.draw();
    }

    @Override
    public double area() {
        return length*width;
    }
}
