class Mobile{
    String brand;
    int price;

   Mobile(){
       brand ="samsung";
       price =70000;
   }
    void display(){
        System.out.println("brand : "+ brand);
        System.out.println("price : "+ price);

    }

}
public class Tommy {
    static void main(String[] args) {
        Mobile m =new Mobile();
        m.display();

    }
}
