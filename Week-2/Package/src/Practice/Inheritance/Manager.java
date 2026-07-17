package Practice.Inheritance;

public class Manager extends Employee{
    String department;

    public Manager(String name, int salary, String department) {
        super(name, salary);
        this.department = department;
    }
    void display(){
        System.out.println("the name is : "+ name);
        System.out.println("the salary is : "+ salary);
        System.out.println("the department is : "+ department);
    }
}
