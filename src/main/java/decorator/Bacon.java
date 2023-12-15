package decorator;

public class Bacon extends Topping {

    public Bacon(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int getCost() {
        int pizzaCost = super.getCost();
        return 20 + pizzaCost;
    }

    @Override
    public String description() {
        return super.description();
    }
}
