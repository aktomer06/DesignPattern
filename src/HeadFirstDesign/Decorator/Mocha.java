package HeadFirstDesign.Decorator;

public class Mocha extends CondimentDecorator{

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    String getDescription() {
        return beverage.description + " Mocha";
    }

    @Override
    double getCost() {
        return beverage.getCost() + .20;
    }
}
