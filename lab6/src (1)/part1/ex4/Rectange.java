package part1.ex4;

public class Rectange extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Rectange() {
        width = 1.0;
        length = 1.0;
    }

    public Rectange(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectange(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectange[" +
                super.toString() +
                "width=" + width +
                ", length=" + length +
                ']';
    }
}
