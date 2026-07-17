package Abstract;

abstract public class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }
    abstract void work();
}
