public class AverageAB {
    public static void main(String[] args) {
        int a = 2, b = 3;
        double result = getAverage(a, b);
        System.out.println(result);
    }

    public static double getAverage(int a, int b) {
        return (a + b) / 2.0;
    }
}
