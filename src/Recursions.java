public class Recursions {




    public static void main(String[] args) {
        int result= sums(5);
        System.out.println(result);
    }

    public static int sums(int i){
        if (i>0){
            return i+sums(i-1);
        }else{
            return 0;
        }
    }
}
