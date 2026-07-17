package Inheritance;

public class BoxWeight extends Box{
    double weight;

    BoxWeight(){
        this.weight=weight;
    }

//    @Override
    static void greeting(){
        System.out.println("iam in the box class");
    }

    BoxWeight(double weight) {
        this.weight = weight;
    }

    BoxWeight(double side,double weight){
        super(side);
        this.weight =weight;

    }
    BoxWeight(double l, double b, double h, double weight) {
        super(l, b, h);
        this.weight = weight;
    }
    BoxWeight(BoxWeight other){
        super(other);
        this.weight = other.weight;
    }
}

