class Student{
    String name;
    int age;
}


public class Tarun {
    public static void main(String[] args) {
        Student s1= new Student();
            s1.name= "tarun";
            s1.age =43;

            Student s2 =new Student();
            s2.name="roopan";
            s2.age=43;

        System.out.println("name : "+s1.name);
        System.out.println("age"+ s1.age);

        System.out.println("name : "+s2.name);
        System.out.println("age"+ s2.age);


    }
}
