package grades;

public class StudentTest {


    public static void main(String[] args) {
        Student1 student1 = new Student1("smoopy","123");
        student1.addGrade(46);
        student1.addGrade(55);
        student1.addGrade(63);

        System.out.println(student1.getGradeAverage());


    }
}

