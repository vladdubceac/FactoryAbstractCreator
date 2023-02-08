package learning.vladdubceac.product.implementation;

import learning.vladdubceac.product.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
