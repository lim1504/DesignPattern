package decorator;

public class ChickenFiesta implements  Pizza {
    @Override
    public String description() {
        return "ChickenFiesta";
    }

    @Override
    public int getCost() {
        return 500;
    }
}
