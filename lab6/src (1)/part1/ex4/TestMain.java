package part1.ex4;

public class TestMain {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        System.out.println(shape1.toString());

        Shape shape2 = new Shape("yellow", false) ;
        System.out.println(shape2);

        shape2.setFilled(true);
        shape2.setColor("blue");
        System.out.println(shape2);

        Circle circle = new Circle("green", true , 3.0);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        circle.setRadius(5.0);
        System.out.println(circle.getArea());

        Rectange rectangle = new Rectange(1 , 3);
        System.out.println(rectangle);


        rectangle.setLength(6);
        rectangle.setWidth(7);
        System.out.println(rectangle.getArea());

        Rectange rectangle1 =  new Rectange("green", true , 6.0, 7.0);
        rectangle1.setColor("blue");
        System.out.println(rectangle1);
        System.out.println(rectangle1.getPerimeter());


        Square square1 = new Square(2.0);
        System.out.println(square1.getArea());


        square1.setSide(5);
        System.out.println(square1.getPerimeter());
        
        square1.setLength(6);
        System.out.println(square1.getPerimeter());
    }
}
