package decorator;

public class PeppyPaneer implements Pizza {
    @Override
    public String description() {
        return "PeppyPaneer";
    }

    @Override
    public int getCost() {
        return 100;
    }
}
