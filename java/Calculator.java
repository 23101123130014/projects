import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Calculator to perform addition");

        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble(); // Read as a double

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble(); // Read as a double

        double sum = num1 + num2;

        System.out.print("The sum is: ");
        System.out.println(sum);

        input.close();
    }
}