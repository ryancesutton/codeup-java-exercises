package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {

        Circle newCircle = new Circle(Input.getDouble());
        System.out.println("Area: " + newCircle.getArea());
        System.out.println("Circumference: " + newCircle.getCircumference());

    }

}
