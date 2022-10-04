public class Gowno{

    int x = 42;
    int y = 55;

//    public static void myPublicMethod(){
//        System.out.println("public methods must be called by creating an object");
//    }
//    public static void mojPublicznaMetoda(){
//        System.out.println("kurwa musi miec objekt");
//    }
static void myNameAndAge(String firstName, int age){
    System.out.println(firstName+" ma "+ age+" lat");
}
static int mojaMetoda(int z,int ab){
    return z+200+ab;
    }
    static double mojaMetoda(double z, double ab){
    return z + ab;
    }
    public static void main (String[] args){
        Gowno mojChuj = new Gowno();
        Gowno mojChuj2 = new Gowno();
        mojChuj.y = 66;
        System.out.println(mojChuj.x);
        System.out.println(mojChuj.y);
        System.out.println(mojChuj2.y);

        myNameAndAge("Wojciech",55);
        int mojNumer1 = mojaMetoda(2,5);
        double mojNumer2 = mojaMetoda(1,2);
        System.out.println(mojNumer1);
        System.out.println(mojNumer2);
    }


}
