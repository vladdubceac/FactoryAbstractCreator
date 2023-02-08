package learning.vladdubceac.clients;

import learning.vladdubceac.factory.implementation.CircleFactory;
import learning.vladdubceac.factory.implementation.RectangleFactory;
import learning.vladdubceac.factory.implementation.SquareFactory;
import learning.vladdubceac.product.Shape;

public class Client {
    public static void main(String[] args) {
        Shape shape1 = new CircleFactory().getShape();
        shape1.draw();

        Shape shape2 = new RectangleFactory().getShape();
        shape2.draw();

        Shape shape3 = new SquareFactory().getShape();
        shape3.draw();
    }
}
