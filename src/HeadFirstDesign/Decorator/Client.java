package HeadFirstDesign.Decorator;

public class Client {
    public static void main(String[] args) {
        HouseBlend houseBlend = new HouseBlend();

        System.out.println("Coffee 1:");
        System.out.println(houseBlend.getDescription());
        System.out.println(houseBlend.getCost());

        Beverage darkBlend = new Mocha(new DarkBlend());
        darkBlend = new Mocha(darkBlend);

        System.out.println("Coffee 2");
        System.out.println(darkBlend.getDescription());
        System.out.println(darkBlend.getCost());
    }
}
