package shapes;

public class Square extends Quadrilateral{


    public Square(double side) {
        super(side, side);
    }

    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    public void setWidth(double width) {
//        this.length = width;
//        this.width = width;
        this.setLength(width);
    }

    public double getPerimeter() {

        return 2 * (this.length + this.width);
    }

    public double getArea() {

        return this.length * this.width;
    }
}
