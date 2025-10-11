import java.util.function.Predicate;

/**
 * 1. Custom Functional Interface
 * The @FunctionalInterface annotation is optional but recommended.
 * It forces the compiler to check that the interface has exactly one abstract method.
 */
@FunctionalInterface
interface MathOperation {
    // The single abstract method (SAM)
    int calculate(int a, int b);
    
    // Default methods are allowed (they don't count as abstract methods)
    default void printResult(int result) {
        System.out.println("The result is: " + result);
    }
    
    // Static methods are also allowed
    static void displayInfo() {
        System.out.println("Performs a mathematical operation on two integers.");
    }
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        
        // Call the static method directly on the interface
        MathOperation.displayInfo();
        
        // 2. Implementing the interface using a Lambda Expression
        
        // Lambda for addition (implements the calculate method)
        MathOperation addition = (a, b) -> a + b;
        
        // Lambda for multiplication
        MathOperation multiplication = (a, b) -> a * b;
        
        // Lambda for subtraction
        MathOperation subtraction = (a, b) -> a - b;
        
        // 3. Executing the Operations
        
        int resultAdd = addition.calculate(10, 5);
        System.out.print("10 + 5 = ");
        addition.printResult(resultAdd); // Use the default method
        
        int resultMultiply = multiplication.calculate(10, 5);
        System.out.print("10 * 5 = ");
        multiplication.printResult(resultMultiply);
        
        int resultSubtract = subtraction.calculate(10, 5);
        System.out.print("10 - 5 = ");
        subtraction.printResult(resultSubtract);

        // 4. Using a Built-in Functional Interface (Predicate)
        
        // Predicate (checks if an integer is greater than 10)
        Predicate<Integer> isGreaterThanTen = (num) -> num > 10;
        
        System.out.println("\nIs 15 greater than 10? " + isGreaterThanTen.test(15));
        System.out.println("Is 5 greater than 10? " + isGreaterThanTen.test(5));
    }
}