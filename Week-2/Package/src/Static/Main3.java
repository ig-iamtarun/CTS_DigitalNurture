package Static;

class Calculator{
    static int add(int a,int b){
        return  a+b;
    }
}

public class Main3 {
   public static void main(String[] args) {
        int result = Calculator.add(10,30);
       System.out.println("the sum of the two number is : "+ result);
    }
}
