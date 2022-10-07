package shapes;

public class Square extends Quadrilateral {
    public Square(double length, double width) {
        super(length, width);
    }

    @Override
    public void setLength(double length) {

    }

    @Override
    public void setWidth(double width) {

    }

    @Override
    public double getPerimeter() {
        return  this.width*4;
    }

    @Override
    public double getArea() {
        return this.length*this.length;
    }




//    private double side;
//
//    public Square(double side) {
//        super(side, side);
//        this.side=side;
//    }
//
//
//    public double getArea(){
//        return Math.pow(length,2);
//    }
// public double getPerimeter(){
//        return 4*side;
//    }




}
