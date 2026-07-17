class Person{
    String name;

    Person(String name){
        this.name=name;
    }
    void display(){
        System.out.println("name :"+ name);
    }


}
public class Pong {
    public static void main(String[] args) {
        Person p =new Person("tarunvijaay");
        p.display();
    }
}
