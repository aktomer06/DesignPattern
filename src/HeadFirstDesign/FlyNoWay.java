package HeadFirstDesign;

public class FlyNoWay implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("Can not fly");
    }
}
