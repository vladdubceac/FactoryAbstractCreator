package learning.vladdubceac.product.implementation;

import learning.vladdubceac.product.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
