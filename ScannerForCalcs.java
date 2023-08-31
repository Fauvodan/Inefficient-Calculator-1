import java.util.Scanner;

public class ScannerForCalcs {

    public static void Calculate(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        double a = scanner.nextDouble();
        System.out.println("Enter second number");
        double b = scanner.nextDouble();
        System.out.println("What would you like to do? (No capitals)");
        String task = scanner.next();

        switch(task) {
            case "divide":
                System.out.println(Calculations.divide(a, b));
                break;
            case "add":
                System.out.println(Calculations.add(a, b));
                break;
            case "subtract":
                System.out.println(Calculations.subtract(a, b));
                break;
            case "multiply":
                System.out.println(Calculations.multiply(a, b));
        }
    } 
}
