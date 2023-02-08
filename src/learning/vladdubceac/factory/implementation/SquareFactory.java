package learning.vladdubceac.factory.implementation;

import learning.vladdubceac.factory.AbstractShapeFactory;
import learning.vladdubceac.product.Shape;
import learning.vladdubceac.product.implementation.Square;

public class SquareFactory extends AbstractShapeFactory {
    @Override
    protected Shape factoryMethod() {
        return new Square();
    }
}
