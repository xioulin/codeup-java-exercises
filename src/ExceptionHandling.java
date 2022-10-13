public class ExceptionHandling {

    public static void main(String[] args) {


            int [] numbers = {1,2,3};


        int x;

        try {
            x = numbers[100];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an array index exception!");
        } catch (Exception e) {
            System.out.println("Caught a generic exception!");
        } finally {
            System.out.println("This will always run.");
        }

        try{
            System.out.println(numbers[55]);

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("fudge you");
        }


        try {int myInt = Integer.parseInt("pants");
        } catch (NumberFormatException nfe) {
            System.out.println("error");
        }
    }
}
