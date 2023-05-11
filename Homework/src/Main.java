import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static ICalculator calculator = new CalculatorMock();
    public static void main(String[] args) {
        System.out.println("Welcome to the Calculator app!");

        while(true) {
            System.out.println("");
            System.out.println("Please choose an operation:");
            System.out.println("1. ADD");
            System.out.println("2. SUBTRACT");
            System.out.println("3. MULTIPLY");
            System.out.println("4. DIVIDE");
            System.out.println("5. PERCENTAGE");
            System.out.println("6. FACTORIAL");
            System.out.println("");
            System.out.println("Enter Q to quit the program");

            System.out.println("----------------------------");

            String input = scanner.next().toUpperCase();

            if (input.equals("Q")) {
                System.out.println("Goodbye!");
                break;
            }

            int calculation = Integer.parseInt(input);
            double result;

            if (calculation == 6) {
                System.out.println("Enter the number of which you want factorial from:");
                int n = scanner.nextInt();
                result = calculator.factorial(n);
                System.out.println("Result: " + result);
            } else {
                System.out.println("Enter the first number:");
                int a = scanner.nextInt();
                System.out.println("Enter the second number:");
                int b = scanner.nextInt();

                switch (calculation) {
                    case 1:
                        result = calculator.add(a, b);
                        System.out.println("Result: " + result);
                        break;
                    case 2:
                        result = calculator.subtract(a, b);
                        System.out.println("Result: " + result);
                        break;
                    case 3:
                        result = calculator.multiply(a, b);
                        System.out.println("Result: " + result);
                        break;
                    case 4:
                        result = calculator.divide(a, b);
                        System.out.println("Result: " + result);
                        break;
                    case 5:
                        result = calculator.percentage(a, b);
                        System.out.println("Result: " + result);
                        break;
                    default:
                        System.out.println("Invalid operation!");
                }
            }
        }

        scanner.close();
    }
}
