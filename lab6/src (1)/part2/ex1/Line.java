package part2.ex1;

public class Line {
    // A line composes of two points (as instance variables)
    private Point begin;    // beginning point
    private Point end;      // ending point

    // Constructors
    public Line (Point begin, Point end) {  // caller to construct the Points
        this.begin = begin;
        this.end = end;
    }
    public Line (int beginX, int beginY, int endX, int endY) {
        begin = new Point(beginX, beginY);
        end = new Point(endX, endY);
    }



    @Override
    public String toString() {
        return "Line[" +
                "begin=" + begin +
                ", end=" + end +
                ']';
    }

    public Point getBegin() {
        return begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return getBeginX();
    }
    public int getBeginY() {
        return getBeginY();
    }
    public int getEndX() {
        return getEndX();
    }
    public int getEndY() {
        return getEndY();
    }

    public void setBeginX(Point beginX) {
        setBegin(beginX);
    }
    public void setBeginY(Point beginY) {
        setBeginY(beginY);
    }
    public void setBeginXY(Point beginX, Point beginY) {
        setBeginXY(beginX, beginY);
    }
    public void setEndX(Point endX) {
        setEnd(endX);
    }
    public void setEndY(Point endY) {
        setEnd(endY);
    }
    public void setEndXY(Point endX, Point endY) {
        setEndXY(endX, endY);
    }

    public int getLength() {  // Length of the line
        int xDiff = getBeginX() - getEndX();
        int yDiff = getBeginY() - getEndY();
        return (int) Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
    public double getGradient() {
        int xDiff = getBeginX() - getEndX();
        int yDiff = getBeginY() - getEndY();
        return Math.atan2(yDiff, xDiff);
    } // Gradient in radians
    // Math.atan2(yDiff, xDiff)
}