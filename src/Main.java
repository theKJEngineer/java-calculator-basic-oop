import java.util.Scanner;

class Calculator {
    private double firstNumber;
    private double secondNumber;
    private double result;
    private String operator;

    public Calculator() {
        this.firstNumber = 0;
        this.secondNumber = 0;
        this.operator = "";
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
        }
        result = firstNumber / secondNumber;
        return result;
    }

    public double getResult() {
        return result;
    }
}


public class Main {
    public static void main(String[] args) {

        Calculator c1 = new Calculator();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.println("Enter second number: ");
        double b = scanner.nextDouble();







    }
}