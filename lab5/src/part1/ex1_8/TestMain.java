package part1.ex1_8;

public class TestMain {
    public static void main(String[] args) {
        //declare poly1
        MyPolynomial polynomial1 = new MyPolynomial(1.1, 2.2, 3.3);
        //declare poly2
        double coeffs[] = {1.2, 3.4, 5.6, 7.8};
        MyPolynomial polynomial2 = new MyPolynomial(coeffs);
        //test
        System.out.println("Degree of Polynomial 1: " + polynomial1.getDegree());
        System.out.println();
        System.out.println("Polynomial 1 : " + polynomial1.toString());
        System.out.println("Polynomial 2 : " + polynomial2.toString());
        System.out.println();
        System.out.println("If x = 5 so " + polynomial1.toString() + " = " + polynomial1.evaluate(5));
        System.out.println();
        System.out.println("add poly1 vs poly2: " + polynomial2.add(polynomial1));
        System.out.println();
        System.out.println("multiply poly1 vs poly2: " + polynomial2.mutiply(polynomial1));
    }
}