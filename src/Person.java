public class Person {
    public String firstName;
    public String lastName;

    public String sayHello() {
        return String.format("Hello from %s %s!", firstName, lastName);
    }

    public static void main(String[] args) {
        Person rick = new Person();
        rick.firstName = "Rick";
        rick.lastName = "Sanchez";
        System.out.println(rick.sayHello());
        // prints "Hello from Rick Sanchez!"
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