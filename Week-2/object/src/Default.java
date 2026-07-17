class Laptop{
  String brand;
  int price;

    Laptop(){
        brand ="Dell";
        price = 32000;
    }
    void display(){
        System.out.println("brand : "+ brand);
        System.out.println("Price : "+ price);
    }
}


public class Default {
  public static void main(String[] args) {
        Laptop l1 =new Laptop();
        l1.display();
    }
}
