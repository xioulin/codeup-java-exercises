package shapes;

public class Rectangle extends Quadrilateral implements Measurable{
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override

    public double getPerimeter() {
        return 2*(this.length+this.width);
    }

    @Override
    public double getArea() {
        return this.length*this.width;
    }

    @Override
    public void setLength(double length) {

    }

    @Override
    public void setWidth(double width) {

    }




//    protected static double length;
//    protected static double width;
//
//    public  Rectangle(double length, double width){
//        this.length = length;
//        this.width = width;
//    }
//
//    public double getArea(){
//        return length*width;
//    }
//
//    public double getPerimeter(){
//        return 2*(length+width);
//    }


}
