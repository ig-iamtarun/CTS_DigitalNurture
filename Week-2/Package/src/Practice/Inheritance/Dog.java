package Practice.Inheritance;

public class Dog extends Animal{
    String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }
    void display(){
        System.out.println("the dog name is : "+ name);
        System.out.println("the breed of the dog is : "+ breed);
    }
}
