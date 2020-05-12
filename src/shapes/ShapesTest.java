package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        Measurable myShape = new Square(5, 5);
        System.out.println("Perimeter " + myShape.getPerimeter());
        System.out.println("Area " + myShape.getArea());



    }


}
