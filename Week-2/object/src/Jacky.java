class Car1{
    Car1(){
        System.out.println("default car");
    }
    Car1(String brand){
        System.out.println("car Brand :"+ brand);
    }
}


public class Jacky {
   public static void main(String[] args) {
    Car1  c = new Car1();
    Car1 c2 = new Car1("bmw");
    }
}
