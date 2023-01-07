package ex4;

public class MovableCircle implements Movable {
    int radius;
    MovablePoint center;

//    public MovableCircle(int radius, MovablePoint center) {
//        this.radius = radius;
//        this.center = center;
//    }

    public MovableCircle(int radius, int x, int y, int xSpeed, int ySpeed) {
        this.radius = radius;
        center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return String.format("(%d, %d), speed=(%d, %d),radius=%d",
                center.x, center.y, center.x, center.y, radius);
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
         center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

}
