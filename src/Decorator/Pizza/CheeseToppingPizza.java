package Decorator.Pizza;

public class CheeseToppingPizza implements Pizza{
    Pizza pizza;
    public CheeseToppingPizza(Pizza pizza)
    {
        this.pizza = pizza;
    }
    public CheeseToppingPizza() {

    }
    @Override
    public double getCost() {
        int cost = ToppingsCost.CHEESE_TOPPING;
        if(this.pizza != null)
        {
            cost += this.pizza.getCost();
        }
        return cost;
    }

    @Override
    public String getComposition() {
        String desc = "Cheese Toppings";
        if(this.pizza != null)
        {
            desc = this.pizza.getComposition() + " " + desc;
        }
        return desc;
    }
}
