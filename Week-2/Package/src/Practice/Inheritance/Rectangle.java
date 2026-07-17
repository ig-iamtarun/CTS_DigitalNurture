package Practice.Inheritance;

public class Rectangle extends Shape{
    int length;
    int width;

    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }
    void area(){
        double area = length*width;

        System.out.println("color : "+ color);
        System.out.println("Length : "+length);
        System.out.println("width :"+ width);
        System.out.println("the total area : " + area);
    }

}
