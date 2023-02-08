package learning.vladdubceac.factory;

import learning.vladdubceac.product.Shape;

public abstract class AbstractShapeFactory {

    protected abstract Shape factoryMethod();

    public Shape getShape(){
        return factoryMethod();
    }

    // other helper methods
}
