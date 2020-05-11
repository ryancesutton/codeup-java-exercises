package shapes;

public class Circle {

    private double radius;
    private double area;
    private double circumference;

        public Circle (double radius) {
            this.radius = radius;
        }

        public double getArea() {

            return Math.PI * (Math.pow(radius, 2));
        }

        public double getCircumference() {
            return (2 * Math.PI * radius);
        }
}
