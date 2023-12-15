package decorator;

public class Panner extends Topping {

    public Panner(Pizza pizza) {
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
