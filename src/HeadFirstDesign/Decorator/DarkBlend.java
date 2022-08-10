package HeadFirstDesign.Decorator;

public class DarkBlend extends Beverage{

    DarkBlend() {
        description = "Dark Blend";
    }

    @Override
    String getDescription() {
        return description;
    }

    @Override
    double getCost() {
        return 2.5;
    }
}
