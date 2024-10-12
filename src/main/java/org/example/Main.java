package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Calculator Tool!!");
        int option;
        Scanner input = new Scanner(System.in);

//        MathOperations mathOperations = new MathOperations();

        while (true) {
//            System.out.println("--------------------------------------------------");
            System.out.println("Please select an operation:");
            System.out.println("1. Compute the Square Root of a Number");
            System.out.println("2. Calculate the Factorial of an Integer");
            System.out.println("3. Find the Natural Logarithm of a Positive Number");
            System.out.println("4. Raise a Number to a Power");
            System.out.println("5. Exit the Program");
            System.out.print("Your selection: ");
            option = input.nextInt();
//            System.out.println("--------------------------------------------------");

            switch (option) {
                case 1:
                    System.out.print("Enter a positive number to find its square root: ");
                    Double number = input.nextDouble();
                    Double sqrtResult = findSquareRoot(number);
                    System.out.println("Square Root: " + sqrtResult);
                    break;
                case 2:
                    System.out.print("Enter a positive integer to calculate its factorial: ");
                    Integer integerInput = input.nextInt();
                    Integer factorialResult = computeFactorial(integerInput);
                    System.out.println("Factorial: " + factorialResult);
                    break;
                case 3:
                    System.out.print("Enter a positive number to calculate its natural logarithm: ");
                    Double logInput = input.nextDouble();
                    Double logResult = calculateLog(logInput);
                    System.out.println("Natural Logarithm: " + logResult);
                    break;
                case 4:
                    System.out.print("Enter the base and the exponent separated by a space: ");
                    Double base = input.nextDouble();
                    Double exponent = input.nextDouble();
                    Double powerResult = raiseToPower(base, exponent);
                    System.out.println("Result: " + powerResult);
                    break;
                case 5:
                    System.out.println("Exiting the Calculator. Goodbye!");
                    input.close();
                    return;
                default:
                    System.out.println("Invalid selection. Please try again.");
                    break;
            }
        }
    }

    public static Integer computeFactorial(Integer num) {
        if (num == 1 || num == 0) return 1;
        else if (num < 1) return -1;
        return num * computeFactorial(num - 1);
    }

    public static Double raiseToPower(Double base, Double exponent) {
        return Math.pow(base, exponent);
    }

    public static Double calculateLog(Double number) {
        if (number <= 0) return Double.NaN;
        return Math.log(number);
    }

    public static Double findSquareRoot(Double number) {
        if (number < 0) return Double.NaN;
        return Math.sqrt(number);
    }
}
