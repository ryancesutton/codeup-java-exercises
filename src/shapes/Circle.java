package shapes;

public class Circle {

    private double radius;
    private double area;
    private double circumference;

        public Circle (double radius) {
            this.radius = radius;
            this.area = Math.PI * (Math.pow(radius, 2));
            this.circumference = (2 * Math.PI * radius);
        }

        public double getArea() {
            return area;
        }

        public double getCircumference() {
            return circumference;
        }
}
