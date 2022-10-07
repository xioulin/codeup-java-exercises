package shapes;

public class ShapesTest {




    public static void main(String[] args) {

        Measurable myShape = new Rectangle(3,4);
        System.out.println("The area of myShape rectangle is :"+ myShape.getArea());
        System.out.println("The perimeter of myShape rectangle is :"+ myShape.getPerimeter());
        myShape = new Square(5,5);
        System.out.println(myShape.getArea());

//        Measurable myShape = new Square();




//        Rectangle box1 = new Rectangle(5,4);
//        System.out.println("The area of box1 is: "+box1.getArea());
//        System.out.println("The perimeter of box1 is : "+box1.getPerimeter());
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());


    }


}
