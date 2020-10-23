package A00278612;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");

        try {
            int nth = scanner.nextInt();
            if (nth < 1) {
                System.out.println("invalid input");
            } else {
                FibonacciGenerator fibonacciGenerator = new FibonacciGenerator();
                int value = fibonacciGenerator.CalculateFibonacciSequence(nth);
                System.out.println(value);
            }
        } catch (Exception e){
            System.out.println("invalid input");
        }


    }
}
