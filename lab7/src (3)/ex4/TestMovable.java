package ex4;

public class TestMovable {
    public static void main(String[] args) {
        Movable m1 = new MovablePoint(4, 3, 2, 1);
        System.out.println(m1.toString());
        m1.moveUp();
        System.out.println(m1.toString());
        System.out.println();

        Movable m2 = new MovableCircle(8, 9, 10, 11, 12);
        System.out.println(m2.toString());
        m2.moveDown();
        System.out.println(m2.toString());
        System.out.println();

    }


}
