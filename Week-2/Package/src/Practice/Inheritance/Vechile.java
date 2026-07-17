package Practice.Inheritance;

public class Vechile extends Car{
    String model;

    public Vechile(String brand, String model) {
        super(brand);
        this.model = model;
    }
    void display(){
        System.out.println("the model is: "+ brand);
        System.out.println("the car model is : "+ model);
        System.out.println();
    }
}
