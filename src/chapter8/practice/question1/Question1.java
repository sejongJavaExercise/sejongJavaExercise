public class ArrayIndex {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int index = 10;

        try {
            System.out.println(numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("예외 발생: " + e.getMessage());
        }
    }
}
