package factoryMethod2.creator;

import factoryMethod2.product.Transit;
import factoryMethod2.product.Truck;

public class RoadTransportManager implements TransportManager{
    @Override
    public Transit createTransit() {
        return new Truck();
    }

}
