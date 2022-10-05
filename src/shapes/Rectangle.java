package shapes;

public class Rectangle<width, length> {


    protected static double length;
    protected static double width;

//    public Rectangle(int length, int width){
//    }

    public  Double getArea(){
        double area;
        area = length*width;
        return area;
    }
    public Double getPerimeter(){
        double perimeter;
        perimeter = 2*(length+width);
        return perimeter;
    }

}
