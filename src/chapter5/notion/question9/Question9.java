package chapter5.notion.question9;

public class Question9 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}
        };

        System.out.println(arr.length);
        System.out.println(arr[2].length);
        System.out.println(arr[2][3]);
        System.out.println(arr[3][1]);
    }
}
