package learning.vladdubceac.factory_method.abstract_creator.product.implementation;

import learning.vladdubceac.factory_method.abstract_creator.product.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
