package Decorator.Test;

import Decorator.Pizza.CheeseToppingPizza;
import Decorator.Pizza.PineapplePizza;
import Decorator.Pizza.Pizza;

public class Client {
    public static void main(String[] args) {
        Pizza pizza = new PineapplePizza();

        String ingredients = pizza.getComposition();
        System.out.println(ingredients);

        Pizza pizza1 = new PineapplePizza(new CheeseToppingPizza());
        System.out.println(pizza1.getComposition());
        System.out.println(pizza1.getCost());
    }
}
