package chapter4.notion.question14;

public class Question14 {
    public static void main(String[] args) {
        Loop1 : for (int i = 1; i <= 9; i++) {
            Loop2 : for (int j = 1; j <= 9; j++) {
                Loop3 : for (int k = 1; k <= 9; k++) {
                    System.out.println(i + j + k);
                    if (i == 1 && j == 1 && k == 1) {
                        break Loop1;
                    }
                }
            }
        }
    }
}
