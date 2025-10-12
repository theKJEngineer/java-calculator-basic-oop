public class Calculator {     // Simple calculator class demonstrating basic OOP structure
    private double firstNumber;
    private double secondNumber;
    private double result;

    public Calculator() {
        this.firstNumber = 0;
        this.secondNumber = 0;
    }

    // Setters for input numbers
    public void setFirstNumber(double a) {
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
        System.out.println("2) Subtraction");
        System.out.println("3) Multiplication");
        System.out.println("4) Division");
        System.out.println("0) Exit");
        System.out.println("Choose option: ");
    }

    // Basic arithmetic operations
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
        result = firstNumber / secondNumber;
        return result;
    }

    public double getResult() {
        return result;
    }
}
