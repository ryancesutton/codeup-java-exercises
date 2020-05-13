package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        Measurable myShape = new Square(5);
        System.out.println("Perimeter " + myShape.getPerimeter());
        System.out.println("Area " + myShape.getArea());

        myShape = new Rectangle(7, 6);
        System.out.println("Rectangle Perimeter " + myShape.getPerimeter());
        System.out.println("Rectangle Area " + myShape.getArea());



    }


}
