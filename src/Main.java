import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static int Fibonacci(int fib){

        if (fib == 1 ){
            return 1;
        }

        if (fib == 2){
            return 1;

        }

        else {

            return Fibonacci(fib -1) + Fibonacci(fib-2);
        }

    }


    public static void main(String[] args) {

        int num1 = 1;
        int num2 = 1;

        System.out.println("Enter the Nth Fibonacci Number : ");
        Scanner inputNum = new  Scanner(System.in);
        int inputNumber =  inputNum.nextInt();


        int out = 0;

        out = Fibonacci(inputNumber);


        System.out.println("Fibonacci Number is  : " + out );






    }
}