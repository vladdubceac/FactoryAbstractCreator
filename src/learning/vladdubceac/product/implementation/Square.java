package learning.vladdubceac.product.implementation;

import learning.vladdubceac.product.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
