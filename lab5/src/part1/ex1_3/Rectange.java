package part1.ex1_3;

public class Rectange {
    private float length = 1.0f;
    private float width = 1.0f;

    public Rectange(float length, float width) {
        this.length = length;
        this.width = width;
    }
    public Rectange() {
        length = 1.0f;
        width = 1.0f;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectange[" +
                "length=" + length +
                ", width=" + width +
                ']';
    }
}
