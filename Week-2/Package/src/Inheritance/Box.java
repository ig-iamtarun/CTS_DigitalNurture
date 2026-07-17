package Inheritance;

public class Box {
    private double l;
    double b;
    double h;

    static void greeting(){
        System.out.println("iam in the box class");
    }

    Box(){
        this.l =-1;
        this.b=-1;
        this.h=-1;

    }
    Box(double side){
        this.l= side;
        this.b=side;
        this.h=side;
    }

    public Box(double l, double b, double h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }
    Box(Box old){
        this.l=old.l;
        this.b=old.b;
        this.h =old.h;
    }
    public void information(){
        System.out.println("ethis contain lots of information : ");
    }
}
