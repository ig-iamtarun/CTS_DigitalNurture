package Abstract;

public class Developer extends Employee{
    public Developer(String name) {
        super(name);
    }

    @Override
    void work() {
        System.out.println("they are work as developer  "+ name);
    }
}
