package Questions;

class Student{
    String name;
    static int count;

    public Student(String name) {
        this.name = name;
        count++;
    }
}
public class Main {
   public static void main(String[] args) {
        Student s1 = new Student("tarun");
        Student s2 = new Student("roopan");
        Student s3 = new Student("nanesh");

       System.out.println("total student : "+ Student.count);
    }
}
