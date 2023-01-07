package part1.ex4;

public class Square extends Rectange {
    public Square() {
    }

    public Square(double side) {
        super(side,side);
    }

    public double getSide() {
        return getLength();
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }
    public Square(double side, String color, boolean filled) {
        //super(side, side, color, filled);

    }

    public Square(double width, double length) {
        super(width, length);
    }
}

//Trong zalo anh gui file
