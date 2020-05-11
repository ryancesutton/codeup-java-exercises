package shapes;

public class Square extends Rectangle{

    protected double side;

    public Square(double side) {
        super(side, side);
        this.side = length;
        this.side = width;
    }

    public double getPerimeter(){
        return 4 * side;
    }

    public double getArea(){
        return Math.pow(side, 2);
    }

}
