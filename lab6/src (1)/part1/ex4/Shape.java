package part1.ex4;

public class Shape {
    private String color = "red";
    private boolean filled = true;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        if(isFilled()) {
            return true;
        }
        return false;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape[" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ']';
    }
}
