package learning.vladdubceac.factory.implementation;

import learning.vladdubceac.factory.AbstractShapeFactory;
import learning.vladdubceac.product.Shape;
import learning.vladdubceac.product.implementation.Circle;

public class CircleFactory extends AbstractShapeFactory {
    @Override
    protected Shape factoryMethod() {
        return new Circle();
    }
}
