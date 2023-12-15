package decorator;

public class Tomato extends Topping {

    public Tomato(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int getCost() {
        int pizzaCost = super.getCost();
        return 40 + pizzaCost;
    }

    @Override
    public String description() {
        return super.description();
    }
}
