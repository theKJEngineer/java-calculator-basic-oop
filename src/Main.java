import java.util.Scanner;

class Calculator {
    private double firstNumber;
    private double secondNumber;
    private double result;

    public Calculator() {
        this.firstNumber = 0;
        this.secondNumber = 0;
    }

    public void setFirstNumber(double a) {                                  // number setting methods
        firstNumber = a;
    }

    public void setSecondNumber(double b) {
        secondNumber = b;
    }

    public void menu() {
        System.out.println("=========================");
        System.out.println("| Calculator version 1.0 |");
        System.out.println("| Beginning of Java OOP  |");
        System.out.println("=========================");
    }

    public void showOperationMenu() {
        System.out.println("Select the mathematical operation you want to perform.");
        System.out.println("1) Addition");
        System.out.println("2) Substraction");
        System.out.println("3) Multiplication");
        System.out.println("4) Division");
        System.out.println("0) Exit");

    }

    public double add() {
         result = firstNumber + secondNumber;
         return result;
    }

    public double subtract() {
        result = firstNumber - secondNumber;
        return result;
    }

    public double multiply() {
        result = firstNumber * secondNumber;
        return result;

    }

    public double divide() {
        if (secondNumber == 0) {
            System.out.println("Division by 0 is not allowed.");
            result = 0;
        } else {
            result = firstNumber / secondNumber;
        }
        return result;
    }

    public double getResult() {
        return result;
    }
}


public class Main {
    public static void main(String[] args) {

        Calculator c1 = new Calculator();
        c1.menu();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while(running) {
            c1.showOperationMenu();
            int choice = scanner.nextInt();
            System.out.println("Enter first number: ");
            double a = scanner.nextDouble();
            System.out.println("Enter second number: ");
            double b = scanner.nextDouble();
            c1.setFirstNumber(a);
            c1.setSecondNumber(b);

            switch(choice) {
                case 1:
                    c1.add();
                    System.out.println("Result: " + c1.getResult());
                    System.out.println(" ");
                    break;
                case 2:
                    c1.subtract();
                    System.out.println("Result: " + c1.getResult());
                    System.out.println(" ");
                    break;
                case 3:
                    c1.multiply();
                    System.out.println("Result: " + c1.getResult());
                    System.out.println(" ");
                    break;
                case 4:
                    c1.divide();
                    System.out.println("Result: " + c1.getResult());
                    System.out.println(" ");
                    break;
                case 0:
                    System.out.println("Calculator closed.");
                    System.out.println(" ");
                    running = false;
                    break;
                default:
                    System.out.println("unknown operation.");
                    System.out.println(" ");
                }
            }

        }
    }