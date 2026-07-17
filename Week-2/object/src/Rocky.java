class Movie{
    String movieName;
    int rating;

    public Movie(String movieName, int rating) {
        this.movieName = movieName;
        this.rating = rating;
    }
    void display(){
        System.out.println("movie name: "+ movieName);
        System.out.println("movie rating: "+ rating);
        System.out.println();
    }
}


public class Rocky {
    static void main(String[] args) {
        Movie m1 =new Movie("gujilumasth",4);
        Movie m2 =new Movie("seeman",20);
        Movie m3 = new Movie("vijay",100);

        m1.display();
        m2.display();
        m3.display();
    }
}
