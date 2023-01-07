package part1.ex1_1;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("The " + circle1.getColor() + " circle has radius of " + circle1.getRadius() +
                " and area of " + circle1.getArea() );

        Circle circle2 = new Circle(2.0, "green");
        System.out.println("The " + circle2.getColor() + " circle has radius of " + circle2.getRadius() +
                " and area of " + circle2.getArea());

        Circle circle3 = new Circle(3.0, "yellow");
        System.out.println("The " + circle3.getColor() + " circle has radius of " + circle3.getRadius() +
                " and area of " + circle3.getArea());

        Circle circle4 = new Circle(4.5,"pink");
        System.out.println(circle4.toString());
    }
}
