package Abstract;

public class Tester extends Employee{
    public Tester(String name) {
        super(name);
    }

    @Override
    void work() {
        System.out.println("they are working as tester :"+ name);

    }
}
