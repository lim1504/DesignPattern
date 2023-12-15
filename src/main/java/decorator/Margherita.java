package decorator;

public class Margherita implements Pizza {
    @Override
    public String description() {
        return "Margherita";
    }

    @Override
    public int getCost() {
        return 200;
    }
}
