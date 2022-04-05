public class Calculator {
    /* 
    This program is a simple calculator that calculates
    additions, substractions, multiplications, divisions, and modulus.
    */
    
    // calculator constructor
    public Calculator() {
    }

    // addition method
    public int add(int a, int b) {
        return a + b;
    }
    
    // substract method
    public int substract(int a, int b) {
        return a - b;
    }

    // multiply method
    public int multiply(int a, int b) {
        return a * b;
    }

    // divide method
    public int divide(int a, int b) {
        return a / b;
    }

    // modulo method
    public int modulo(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        // Calculate 5 + 7
        System.out.println(myCalculator.add(5, 7));
        // Calculate 45 - 11
        System.out.println(myCalculator.substract(45, 11));
        // Calculate 2 * 4
        System.out.println(myCalculator.multiply(2, 4));
        // Calculate 10 / 5
        System.out.println(myCalculator.divide(10, 5));
        // Calculate 30 % 4
        System.out.println(myCalculator.modulo(30, 4));
    }
}
