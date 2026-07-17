package Abstract;

public class Car extends Vehicle{
    public Car() {
    }

    @Override
    void move() {
        System.out.println("after the car start it will move ");
    }
}
