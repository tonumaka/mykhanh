package part2.ex2;

public class TestMain {
    public static void main(String[] args) {
        Circle circle = new Circle(2.5, "red");

        Cylinder cylinder = new Cylinder(circle, 3.0);
        System.out.println(cylinder.getArea());
        System.out.println(cylinder);


        Circle circle2 = new Circle(3.2, "green");
        cylinder.setBase(circle);
        System.out.println(cylinder.toString());
        System.out.println(cylinder.getVolume());
    }
}