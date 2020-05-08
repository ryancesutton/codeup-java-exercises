package shapes;

import util.Input;
import util.InputTest;

public class CircleApp {

    public static void main(String[] args) {
        Input input = new Input();
        Circle newCircle = new Circle(input.getDouble());
        System.out.println("Area: " + newCircle.getArea());
        System.out.println("Circumference: " + newCircle.getCircumference());

    }

}
