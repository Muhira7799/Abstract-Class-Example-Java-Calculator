
abstract class Calculator {

    // Abstract method
    abstract int add(int a, int b);

    // Non-abstract method
    int multiply(int a, int b) {
        return a * b;
    }
}

class MyCalculator extends Calculator {

    // Implementing the abstract method
    @Override
    int add(int a, int b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {

        MyCalculator calc = new MyCalculator();

        System.out.println("Addition: " + calc.add(10, 5));
        System.out.println("Multiplication: " + calc.multiply(10, 5));
    }
}

















