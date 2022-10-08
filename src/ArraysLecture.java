import java.util.Scanner;
import java.util.Arrays;
public class ArraysLecture {




    public static void main(String[] args) {

//        int numOfBugs = (int) Math.floor(Math.random()*100);
//        Bug myCode = new Bug[numOfBugs];

        double[] prices;
        prices = new double[4];

        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        System.out.println(numbers[0]); // 1
        System.out.println(numbers[1]); // 2
        System.out.println(numbers[2]); // 0 -- default value
//        System.out.println(numbers[3]); // ArrayIndexOutOfBoundsException !!!

        String[] beatles = {"John","Paul","Ringo","George"};
        System.out.println("how many beatles? "+beatles.length);
        System.out.println(beatles[3]);
        for(int i=0;i<beatles.length;i++){
            System.out.println(beatles[i]);
        }
        for(String beatle : beatles){
            System.out.println(beatle);
        }

        int[] lectureNumbers = new int[4];
        for(int lecturenum: lectureNumbers){
            System.out.println(lecturenum);
        }

        Arrays.fill(lectureNumbers,21);


        System.out.println(lectureNumbers[0]);
    }

}
