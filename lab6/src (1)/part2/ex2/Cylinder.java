package part2.ex2;

public class Cylinder {
    private Circle base;
    private double height;

    public Cylinder(Circle base, double height) {
        this.base = base;
        this.height = 1.0;
    }

    public Circle getBase() {
        return base;
    }

    public void setBase(Circle base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return 2 * base.getArea() + 2 * Math.PI * base.getRadius() * height;
    }


    public double getVolume() {
        return base.getArea() * height;
    }
    @Override
    public String toString() {
        return "Cylinder[" +
                "base=" + base +
                ", height=" + height +
                ']';
    }
}