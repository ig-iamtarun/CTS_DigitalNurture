
public class InnerClasses {

static  class Test{
        static String name;
        Test(String name){
            Test.name = name;
        }
    }
   public static void main(String[] args) {
        Test a = new Test("tarun");
        Test b = new Test("roopan");

       System.out.println(a.name);
       System.out.println(b.name);
    }
}
