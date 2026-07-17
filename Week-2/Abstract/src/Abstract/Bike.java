package Abstract;

public class Bike extends Vehicle{
    public Bike() {
    }

    @Override
    void move() {
        System.out.println("after the engine start the bike will move");
    }

}
