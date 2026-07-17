package Static;
class Test{
   static int a =10;
    static int b;
    static {
        b=a*5;
    }
}
public class Main5 {
    static void main(String[] args) {
        System.out.println("a ="+ Test.a);
        System.out.println("b ="+ Test.b);
    }
}
