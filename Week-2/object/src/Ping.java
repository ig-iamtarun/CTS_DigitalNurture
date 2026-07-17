class Book{
    String title;
    String author;

    Book(String title,String author){
        this.title=title;
        this.author=author;
    }
    void display(){
        System.out.println("Title :"+ title);
        System.out.println("Author : "+author);
        System.out.println();
    }

}

public class Ping {
    static void main(String[] args) {
        Book b =new Book("javaprogramming","tarun");
        Book b1 =new Book("legend","prebhu");
        Book b2 =new Book("rama","vishnu");

        b.display();
        b1.display();
        b2.display();
    }
}
