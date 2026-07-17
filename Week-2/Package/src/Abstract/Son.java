package Abstract;

public class Son extends Parent{
    public Son(int age) {
        super(age);
    }

    @Override
    void carrier() {
        System.out.println("iam tarun");
    }
    @Override
    void partner() {
        System.out.println("i like gopald");
    }
}
