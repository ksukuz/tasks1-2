package task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value: ");
        try{
            n = sc.nextInt();
            if(n<0)
                throw new IllegalArgumentException("N<0");
            else System.out.println("un = " + un(n));
        }catch (IllegalArgumentException iae){
            System.out.println("Incorrect value!");
        }catch (InputMismatchException ime){
            System.out.println("Incorrect value!");
        }

    }

    public static int factorial(int num){
        int res = 1;
        for (int i = 1; i <= num; i++) {
            res *= i;
        }
        return res;
    }

    public static double un(int num){
        int sum=0;
        for (int i = 0; i <= num; i++) {
            sum += factorial(i);
        }
        System.out.println(sum);
        System.out.println(factorial(num));
        return (1.0/factorial(num))*sum;
    }
}
