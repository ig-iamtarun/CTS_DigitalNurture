class Bike{
    String brand;
    String cc;

    public Bike(String brand, String cc) {
        this.brand = brand;
        this.cc = cc;
    }
    void display(){
        System.out.println("brand : "+ brand);
        System.out.println("cc : "+ cc);
        System.out.println();
    }
}

public class Macbook {
    static void main(String[] args) {
    Bike b =new Bike("yahame","r15");
    Bike b1 =new Bike("royalenfeild","bullet");

    b.display();
    b1.display();
    }
}
