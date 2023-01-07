package ex3;

public class TestMovable {
    public static void main(String[] args) {
        MovablePoint p1 = new MovablePoint(10, 5,5,6);
        System.out.println(p1);
        //(1,2)
        p1.moveDown();
        System.out.println(p1);
        //(1,3)
        p1.moveRight();
        System.out.println(p1);
        //(2,3)

        // Test Polymorphism
        Movable p2 = new MovablePoint(3, 4,6,7);  // upcast
        p2.moveUp();
        System.out.println(p2);
        //(3,3)

        MovablePoint p3 = (MovablePoint)p2;   // downcast
        System.out.println(p3);
        //(3,3)
    }
}
