package part1.ex1_3;

public class TestMain {
    public static void main(String[] args) {
        Rectange rectange1 = new Rectange(1.2f, 3.4f);
        System.out.println(rectange1);

        Rectange rectange2 = new Rectange();
        System.out.println(rectange2);

        rectange1.setLength(5.6f);
        rectange1.setWidth(7.8f);
        System.out.println(rectange1);
        System.out.println("Length is: " + rectange1.getLength());
        System.out.println("Width is: " + rectange1.getWidth());

        System.out.printf("area is: %.2f%n", rectange1.getArea());
        System.out.printf("circumference is: %.2f%n", rectange1.getPerimeter());
    }
}
