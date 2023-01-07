package part1.ex3;

public class Point3D extends Point2D{
    private float z = 0.0f;

    public Point3D() {
        z = 0.0f;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{super.getX(), super.getY(), z};
    }

    public void setXYZ(float x, float y, float z) {
        setXYZ(x,y,z);
    }

    @Override
    public String toString() {
        return "Point3D[" +
                super.toString() +
                "z=" + z +
                ']';
    }
}
