package factoryMethod2.creator;

import factoryMethod2.product.Ship;
import factoryMethod2.product.Transit;

public class SeaTransportManager implements TransportManager{
    @Override
    public Transit createTransit() {
        return new Ship();
    }
}
