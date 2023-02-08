package learning.vladdubceac.factory_method.abstract_creator.factory.implementation;

import learning.vladdubceac.factory_method.abstract_creator.factory.AbstractShapeFactory;
import learning.vladdubceac.factory_method.abstract_creator.product.Shape;
import learning.vladdubceac.factory_method.abstract_creator.product.implementation.Square;

public class SquareFactory extends AbstractShapeFactory {
    @Override
    protected Shape factoryMethod() {
        return new Square();
    }
}
