package decorator;

class DecoratorMain {
    public static void main(String[] args) {

        Pizza pizza = new PeppyPaneer();
        System.out.println("pizza = " + pizza.description() + " cost = " + pizza.getCost());

        Pizza pizza2 = new Margherita();
        pizza2 = new Tomato(pizza2);
        pizza2 = new Bacon(pizza2);

        System.out.println("pizza = " + pizza2.description() + " cost = " + pizza2.getCost());

        Pizza pizza3 = new ChickenFiesta();
        
        pizza3 = new Bacon(pizza3);

        System.out.println("pizza = " + pizza3.description() + " cost = " + pizza3.getCost());

    }
}
