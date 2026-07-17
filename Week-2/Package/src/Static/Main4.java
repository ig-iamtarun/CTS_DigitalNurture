package Static;

class Car{
    static int totalCar=0;

    public Car() {
        totalCar++;
    }
}

public class Main4 {
    public static void main(String[] args) {
    Car c1= new Car();
    Car c2 = new Car();
    Car c3 = new Car();

        System.out.println("total car : " +Car.totalCar );

    }
}
