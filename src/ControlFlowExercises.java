public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15){
//            i++;
//            System.out.println(i-1);
//        }]
//        i=0;
//        do{
//            i+=2;
//            System.out.println(i);
//        }while(i <100);

//        i=100;
//        do{
//            i -=5;
//            System.out.println(i);
//        }while(i>-9);

//        long j=2;
//        do{
//            j = j*j;
//            System.out.println(j);
//        }while(j<=1000000);


//        for (long y = 2; y < 1000000; y = y * y) {
//            if (y == 1000000) {
//                continue;
//            }
//            System.out.println(y);
//        }

        for (int i = 1; i <= 100; i += 1) {
            if (i % 3 == 0 && i%5 ==0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            }else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }


        }

    }
}