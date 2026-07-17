class Employee{
    String name;
    int salary;

    Employee(String name,int salary){
        this.name=name;
        this.salary=salary;
    }
    void display(){
        System.out.println("name :"+ name);
        System.out.println("salary : "+ salary);
    }
}


public class Lord {
    static void main(String[] args) {

        Employee e1 = new Employee("tarun",320000);
        e1.display();

    }
}
