interface Calculator {
    int add(int x, int y);
    int subtract(int x, int y);
    int multiply(int x, int y);
    int divide(int x, int y);
}

class FourBasicCalculator implements Calculator {
    public int add(int x, int y) {
        return x + y;
    }

    public int subtract(int x, int y) {
        return x - y;
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public int divide(int x, int y) {
        if (y == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
            return 0;
        }
        return x / y;
    }
}

public class CalculatorTest {
    public static void main(String[] args) {
        FourBasicCalculator calculator = new FourBasicCalculator();
        int x = 5, y = 2;

        System.out.println(calculator.add(x, y));
        System.out.println(calculator.subtract(x, y));
        System.out.println(calculator.multiply(x, y));
        System.out.println(calculator.divide(x, y));
    }
}
