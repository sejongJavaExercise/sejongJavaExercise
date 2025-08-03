package chapter7.practice.question13;

public class Question13new {
    public static void main(String[] args) {
        FourBasicCalculator calculator = new FourBasicCalculator();
        int x = 5, y = 2;
        System.out.println(calculator.add(x,y));
        System.out.println(calculator.subtract(x,y));
        System.out.println(calculator.multiply(x,y));
        System.out.println(calculator.divide(x,y));
    }
}

interface Calculator {
    int add(int a, int b);
    int subtract(int a, int b);
    int multiply(int a, int b);
    int divide(int a, int b);
}

class FourBasicCalculator implements Calculator {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
}
