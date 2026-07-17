class Employee1{
    String name;
    int salary;

    public Employee1(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    void display(){
        System.out.println("name :"+ name);
        System.out.println("salary : "+ salary);
    }
}
public class Ram {
  public static void main(String[] args) {
        Employee1  e = new Employee1("tarun",4300);

        e.display();
    }
}
