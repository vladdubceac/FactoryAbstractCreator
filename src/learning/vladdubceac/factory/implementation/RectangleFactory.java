package learning.vladdubceac.factory.implementation;

import learning.vladdubceac.factory.AbstractShapeFactory;
import learning.vladdubceac.product.Shape;
import learning.vladdubceac.product.implementation.Rectangle;

public class RectangleFactory extends AbstractShapeFactory {
    @Override
    protected Shape factoryMethod() {
        return new Rectangle();
    }
}
