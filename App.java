import java.util.Scanner;

public class App {
    private static final Scanner inputScanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;

        while (run) {

            double num1 = getDouble("Please enter a double: ");
            double num2 = getDouble("Please enter a second double: ");
            String type = getString("Would you like to add, subtract, multiply, or divide?");

            Calculator c = new Calculator();

            if (type.equals("add")) {
                Double added = c.add(num1, num2);
                System.out.println(added);
            }

            if (type.equals("subtract")) {
                Double subtracted = c.subtract(num1, num2);
                System.out.println(subtracted);
            }

            if (type.equals("multiply")) {
                Double multiplied = c.multiply(num1, num2);
                System.out.println(multiplied);
            }

            if (type.equals("divide")) {
                if (num2 == 0) {
                    System.out.println("You can't divide by zero.");
                } else {
                    Double divided = c.divide(num1, num2);
                    System.out.println(divided);
                }
            }

            String s = getString("Would you like to continue? (Y/N): ");

            if (s.equalsIgnoreCase("N")) {
                System.out.println("Goodbye.");
                run = false;
            }

        }

    }


    private static String getString(String prompt) {
        // fill in the code
        System.out.println(prompt);
        String userInput = inputScanner.nextLine();
        return userInput;

    }

    private static double getDouble(String prompt) {
        // fill in the code
        System.out.println(prompt);
        double userInput = inputScanner.nextDouble();
        inputScanner.nextLine();
        return userInput;
    }

}

