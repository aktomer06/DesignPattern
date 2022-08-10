package HeadFirstDesign.Decorator;

public class HouseBlend extends Beverage{

    HouseBlend() {
        description = "House Blend";
    }

    @Override
    String getDescription() {
        return description;
    }

    @Override
    double getCost() {
        return 2.0;
    }
}
