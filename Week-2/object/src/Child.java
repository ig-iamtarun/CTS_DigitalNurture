class Students{
    Students(){
        System.out.println("Student Created");
    }
    Students(String name){
        this();
        System.out.println("name : "+ name);
    }
    Students(String name,int age){
        this(name);
        System.out.println("age is "+ age);
    }
}
public class Child {
   public static void main(String[] args) {
        Students s1 =new Students("tarun",20);
    }
}
