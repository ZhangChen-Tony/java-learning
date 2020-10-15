//input 
import java.util.Scanner;


public class InputAndOutput{
    public static void main(String[] args){

        /**
         * println means put out AND switch the line
         * print is just printing
         */
        System.out.print("A,");
        System.out.print("B,");
        System.out.println("End");
        System.out.println("switch");
        System.out.println("__________________");

        /**
         * formated output
         * can be represented via "printf"
         * "%.nf" placeholder which holds n places
         * "%d" means to output int
         * "%x" means to output hexadecimal numbers
         * "%e" means to output scientific representation
         */
        double d = 31.313131313;
        System.out.printf("%.2f\n",d); // output two decimals
        System.out.printf("%.4f\n",d); // output four decimals
        System.out.printf("%e\n",d);
        System.out.print("________now is time for inputs______\n");


        // now, for input
        Scanner scanner = new Scanner(System.in); // to create a Scanner object
        System.out.print("input your name "); //print out notice
        String name = scanner.nextLine(); //get one inpute and get the string
        System.out.print("input your age"); //print notice
        int age = scanner.nextInt(); //get the int input
        System.out.printf("hi, %s, you are %d years old", name, age);
        scanner.close();
    }
}