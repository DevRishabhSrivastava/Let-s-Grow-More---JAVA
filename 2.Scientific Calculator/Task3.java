import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Power");
        System.out.println("6. Square Root");
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("The result is " + (num1 + num2));
                break;
            case 2:
                System.out.println("The result is " + (num1 - num2));
                break;
            case 3:
                System.out.println("The result is " + (num1 * num2));
                break;
            case 4:
                System.out.println("The result is " + (num1 / num2));
                break;
            case 5:
                System.out.println("The result is " + Math.pow(num1, num2));
                break;
            case 6:
                System.out.println("The square root of " + num1 + " is " + Math.sqrt(num1));
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
