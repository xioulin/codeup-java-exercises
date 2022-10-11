package grades;

public class StudentTest {


    public static void main(String[] args) {
        Student student1 = new Student("smoopy","45");
        student1.addGrade(46);
        student1.addGrade(55);
        student1.addGrade(63);

        System.out.println(student1.getGradeAverage());


    }
}

