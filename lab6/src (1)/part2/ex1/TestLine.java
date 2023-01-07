package part2.ex1;

public class TestLine {
    public static void main(String[] args) {
        Line l1 = new Line(0, 0, 3, 4);
        System.out.println(l1);

        Point p1 = new Point(5,6);
        Point p2 = new Point(7,8);
        Line l2 = new Line(p1, p2);
        System.out.println(l2);

    }
}