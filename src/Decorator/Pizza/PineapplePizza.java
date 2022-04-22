package Decorator.Pizza;

public class PineapplePizza implements Pizza{
    Pizza pizza;
    public PineapplePizza(Pizza pizza) {
        this.pizza = pizza;
    }
    public PineapplePizza() {
        System.out.println("Pine Apple pizza is created");
    }
    @Override
    public String getComposition() {
        String desc = "Pineapple Toppings";
        if(this.pizza != null) {
            desc = this.pizza.getComposition() + " " + desc;
        }
        return desc;
    }

    @Override
    public double getCost() {
        int cost = ToppingsCost.PINEAPPLE;
        if(this.pizza != null) {
            cost += this.pizza.getCost();
        }
        return cost;
    }
}
