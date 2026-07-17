package Abstract;

abstract public class Parent {

    int age;

    public Parent(int age) {
        this.age = age;
    }
    static void hello(){
        System.out.println("hello hey see my name :");
    }
    abstract void carrier();
    abstract void partner();

}
