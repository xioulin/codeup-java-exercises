public class AwesomeJavaProgram {



    public static void main(String[] args){
        System.out.println(printName("Piotr",35));
        String nazwa = printName("piotr",35);
        System.out.println(nazwa);
//        Cat.czesc(); doesn't allow program to run past calling on method from class.
//
//        Cat garfieldCat = new Cat();
//        Cat newCat = new Cat();
//        garfieldCat.name = "Garfield";
//        garfieldCat.breed = "Calico";
//        newCat.name = "Tinker";
//        newCat.breed = "Persian";

//        System.out.println(garfieldCat.name);

    }

    private static void burp(){
        System.out.println("buurp");
    }// this is a method. You know it's a method when it has () the parentheses.

    private static String printName(String name,int age){
            return "nazywam sie"+name+age;
    }

    private static Integer age(int age){
        return age;
    }
}
