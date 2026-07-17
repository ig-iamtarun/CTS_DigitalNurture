package Interface.Nested;

public class A {
    // iam going to create the nested interface
    public interface NestedInterface{
        boolean isOdd(int num);
    }
}

class B implements A.NestedInterface{
    @Override
    public boolean isOdd(int num) {
        return (num & 1 ) == 1;
    }
}
