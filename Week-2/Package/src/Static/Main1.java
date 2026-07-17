package Static;

class Employee{
    String name;
    static String companyName ="Cogizent";


    public Employee(String name) {
        this.name = name;
    }
    void display(){
        System.out.println("name :"+name);
        System.out.println("company name: "+ companyName);
        System.out.println();
    }

}
public class Main1 {
    static void main(String[] args) {
    Employee e = new Employee("tarun");
    Employee e1 =new Employee("jaivasant");
    Employee e2 = new Employee("shravan");

        e.display();
        e1.display();
        e2.display();
    }
}
