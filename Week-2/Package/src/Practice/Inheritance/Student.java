package Practice.Inheritance;

public class Student extends Person{
    int roll;

    public Student(String name, int age, int roll) {
        super(name, age);
        this.roll = roll;
    }
    void display(){
        System.out.println("the name is : "+ name);
        System.out.println("the age is : "+ age);
        System.out.println("the roll no is : "+ roll);
    }
}
