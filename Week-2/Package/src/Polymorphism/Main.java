package Polymorphism;

public class Main {
    static void main(String[] args) {
        Shapes shape = new Shapes();
        Triangle triangle = new Triangle();
        Shapes square = new Square();
        Circle circle = new Circle();

        square.area();
    }
}
