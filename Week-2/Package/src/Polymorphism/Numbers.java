package Polymorphism;

public class Numbers {
    double sum(int a,int b){
        return a+b;
    }
    double sum(int a, int b, int c){
        return a+b+c;
    }

  public static void main(String[] args) {
        Numbers obj = new Numbers();

        obj.sum(2,5);
        obj.sum(4,3,2);
      System.out.println(obj);
    }
}
