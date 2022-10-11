package grades;

import java.util.ArrayList;

public  class Student {
    private String studentName;

    private ArrayList<Integer> studentGrade;



    public Student(String newStudentName,String studentGrade){
        this(newStudentName, new ArrayList<Integer>());
    }

    public Student(String newStudentName,ArrayList<Integer> newStudentGrade) {
        this.studentName = newStudentName;
        this.studentGrade = newStudentGrade;
    }

    // returns the student's name
    public  String getName(){
        return studentName;
    }

    public ArrayList<Integer> getStudentGrade() {
        return studentGrade;
    }

    // adds the given grade to the grades property
    public  void addGrade(int grade){
        studentGrade.add(grade);
    }

    // returns the average of the students grades
    public  double getGradeAverage(){
        double sum = 0;
        for(int i = 0; i <studentGrade.size(); i++){
            sum += studentGrade.get(i);
        }

        return sum/studentGrade.size();
    }


}
