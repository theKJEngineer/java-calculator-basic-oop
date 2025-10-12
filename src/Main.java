import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Create calculator object and initialize program
        Calculator calculator = new Calculator();
        calculator.menu();
        // Scanner used for user input
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            calculator.showOperationMenu();
            int choice = scanner.nextInt();
            if (choice == 0) {
                System.out.println("Calculator closed.");
                running = false;
                break;
            } else if (choice < 1 || choice > 4) {
                System.out.println("Unknown option. Try again.");
                System.out.println("------------------------");
                continue;
            }
            System.out.println("Enter first number: ");
            double a = scanner.nextDouble();
            System.out.println("Enter second number: ");
            double b = scanner.nextDouble();
            calculator.setFirstNumber(a);
            calculator.setSecondNumber(b);

            switch (choice) {
                case 1:
                    calculator.add();
                    System.out.println("Result: " + calculator.getResult());
                    System.out.println("------------------------");
                    break;
                case 2:
                    calculator.subtract();
                    System.out.println("Result: " + calculator.getResult());
                    System.out.println("------------------------");
                    break;
                case 3:
                    calculator.multiply();
                    System.out.println("Result: " + calculator.getResult());
                    System.out.println("------------------------");
                    break;
                case 4:
                    if (b == 0) {
                        System.out.println("Division by 0 is not allowed. Try again.");
                        System.out.println("------------------------");
                        continue;
                    }
                    calculator.divide();
                    System.out.println("Result: " + calculator.getResult());
                    System.out.println("------------------------");
                    break;
            }
        }
        // Close scanner after program ends
        scanner.close();
    }
}
