import java.util.Scanner;

public class Calculator2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Calculator to perform addition and subtraction");

        // Input: Read the first number
        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        // Input: Read the second number
        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        // Prompt user to choose the operation
        System.out.print("Enter the operation (+ for addition, - for subtraction): ");
        char operation = input.next().charAt(0);

        // Perform the operation based on user input
        double result;
        if (operation == '+') {
            result = num1 + num2;
            System.out.println("The sum is: " + result);
        } else if (operation == '-') {
            result = num1 - num2;
            System.out.println("The difference is: " + result);
        } else {
            System.out.println("Invalid operation. Please enter '+' or '-'.");
        }

        input.close();
    }
}
