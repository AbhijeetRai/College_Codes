import java.io.*;

/**
 * A class to accept a number and find factorial of that number
 * @author Abhijeet Rai
 */
public class Factorial {

    /**
     * Finds the factorial of given number
     * 
     * @param number
     *        The number of which, factorial is to be found
     *   
     * @return  The factorial of number accepted as parameter
     */
    static int factorial(int number) {

        /** This value is used to calculate factorial */
        int mult = 1;

        if(number == 0 || number == 1)
            return mult; 

        else {

            while(number >= 2) {

                mult *= number;
                number--;
            }
            return mult;
        }
    }

    /**
     * Main method is called as client side method
     * Accepts a number from user and passes that number to factorial method as argument
     * 
     * @param args
     *        An array of strings from command line.
     */
    public static void main(String[] args) {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number to find the factorial of it");

        try {

            int number = Integer.parseInt(br.readLine());
            System.out.println(factorial(number));
        }catch(IOException object) {

            System.out.println(object.getMessage());
        }
    }
}