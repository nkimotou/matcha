/*
Methods are specified sections of code that break the program into smaller chunks.
You can call methods to execute a specific part of your program.
 */

public class Methods {
    /*
    Here we can set up a method with the data type 'int' that will subtract two numbers.
    A method will have a return statement that returns the function of that method.
    We've set up two representations of numbers (a and b) to be used by the method.
     */
    public static int subtract(int a, int b){
        return a - b;
    }
    public static void main (String[] args) {
        /*
        This is where we create our variables in our main method.
        We've created two int variabels representing numbers we will use with the subtract method.
        We will pass num1 and num2 as parameters in the call to our subtract method, then set it equal to a new variable.
         */
        int num1 = 10;
        int num2 = 5;
        // Pass num1 and num2 as parameters for subtract method.
        int minus = subtract(num1, num2);
        // Print the output of our method call.
        System.out.println("a - b = " + minus);
    }
}