package Static;

public class StaticInt {
    static int a=10;
    static int b;

    static {
        System.out.println("i am in static block");
        b=a*5 ;
    }

    public static void main(String[] args) {
        StaticInt obj =new StaticInt();
        System.out.println(StaticInt.a +" "+ StaticInt.b);
    }
}
