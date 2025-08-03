package chapter12.practice.question7;

public class Question7new {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 2, 3, 4, 5};
        reverseArray(arr);
        for(Integer i : arr){
            System.out.print(i + " ");
        }
    }

    static <T extends Number> void reverseArray(T[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            T temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}