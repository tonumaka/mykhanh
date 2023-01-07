package part1.ex5;

public class TestMain {
    public static void main(String[] args) {
        Cat cat = new Cat("my cat");
        cat.greets();
        System.out.println(cat);

        System.out.println();

        Dog dog = new Dog("my Dog");
        dog.greets();
        Dog anotherDog = new Dog("another dog");
        anotherDog.greets();
        dog.greets(anotherDog);
        anotherDog.greets();
        System.out.println(dog);
    }
}
