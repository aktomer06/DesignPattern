package HeadFirstDesign.Decorator;

public class Soy extends CondimentDecorator{

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    String getDescription() {
        return beverage.description + " Soy";
    }

    @Override
    double getCost() {
        return beverage.getCost() +.50;
    }
}
