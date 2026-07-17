class Laptop1{
    String brand;
    int price;

    Laptop1(){
        brand ="Dell";
        price = 50000;
    }

    public Laptop1(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }
    void display(){
        System.out.println("brand :"+ brand);
        System.out.println("price :"+ price);
        System.out.println();
    }
}

public class God {
  public static void main(String[] args) {
        Laptop1 def=new Laptop1();

        Laptop1 n =new Laptop1("Hp",60444);


        def.display();
        n.display();
    }
}
