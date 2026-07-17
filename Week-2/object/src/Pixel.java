class Car{
    String brand;
    String model;

void display(){
    System.out.println("the car brand is :"+ brand);
    System.out.println("the car Model is : "+ model );

}
}

public class Pixel {
    static void main(String[] args) {
        Car c1 = new Car();
        c1.brand="BMW";
        c1.model="m2";
       c1.display();
    }
}
