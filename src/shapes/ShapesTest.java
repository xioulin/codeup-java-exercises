package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        Rectangle box1 = new Rectangle();
        box1.length = 5;
        box1.width= 4;
        System.out.println("The area of box1 is: "+box1.getArea());
        System.out.println("The perimeter of box1 is : "+box1.getPerimeter());
        Rectangle box2 = new Square();
        System.out.println(box2.getArea());


    }
}
