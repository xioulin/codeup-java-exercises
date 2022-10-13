import java.util.Arrays;
import java.util.Objects;

public class ArraysExercise {

    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        String numbers1 = Arrays.toString(numbers);
//        System.out.println(numbers1);


        Person[] people;//creates people array
        people = new Person[3]; // initializes it
        Person person1 = new Person("John");
        Person person2 = new Person("David");
//        Person person3 = new Person("Morty");
//        person1.setName("John");
//        person2.setName("David");
//        person3.setName("Morty");
//        people[0]= person1;
//        people[1]= person2;
//        people[2]= person3;
        for(int i =0;i<people.length;i++){
            System.out.println(people[i].getName());

        }

//        public static void  addPerson(){
//
//        }






    }

}
