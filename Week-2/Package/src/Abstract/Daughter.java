package Abstract;

public class Daughter extends Parent{
    public Daughter(int age) {
        super(age);
    }

    @Override
    void carrier() {
        System.out.println("iam a girl");
    }
    @Override
    void partner() {
        System.out.println("i like barbiee");
    }
}
