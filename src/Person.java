public class Person {

    private String name;

    //so this string called name is an object?

    public Person(String name) {
//        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
//TODO: print a message to the console using the person's name
        System.out.println("hello" + this.name);
    }


    public String firstName;
    public String lastName;

//    public String sayHello() {
//        return String.format("Hello from %s %s!", firstName, lastName);
//    }

    public static void main(String[] args) {

        Person person1 = new Person("John");
//        Person person2 = person1;
        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
        person1.setName("John");
        System.out.println(person1.getName());
//        System.out.println(person2.getName());
    }

//    public String getName(){
//return firstName
//    }

//    public void setName(String name){
//        this.name = name;
////TODO: change the name field to the passed value
//    }
//    public void sayHello(){
////TODO: print a message to the console using the person's name
//    }
}