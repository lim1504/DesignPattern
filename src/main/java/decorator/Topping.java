package decorator;

abstract class Topping implements Pizza {
    private Pizza pizza;

    public Topping(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String description() {
        return pizza.description();
    }

    @Override
    public int getCost() {
        return pizza.getCost();
    }
}
