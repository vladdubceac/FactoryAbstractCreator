package learning.vladdubceac.factory_method.abstract_creator.factory.implementation;

import learning.vladdubceac.factory_method.abstract_creator.factory.AbstractShapeFactory;
import learning.vladdubceac.factory_method.abstract_creator.product.Shape;
import learning.vladdubceac.factory_method.abstract_creator.product.implementation.Rectangle;

public class RectangleFactory extends AbstractShapeFactory {
    @Override
    protected Shape factoryMethod() {
        return new Rectangle();
    }
}
