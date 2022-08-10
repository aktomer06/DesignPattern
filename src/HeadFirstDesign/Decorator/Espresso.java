package HeadFirstDesign.Decorator;

public class Espresso extends Beverage{

    Espresso() {
        description = "Espresso";
    }
    @Override
    String getDescription() {
        return description;
    }

    @Override
    double getCost() {
        return 1.5;
    }
}
