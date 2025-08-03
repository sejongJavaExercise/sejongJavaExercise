package chapter2.practice.question9;

public class Question9 {
    public static void main(String[] args) {
        int x = 3, y = 2;
        System.out.println("x = " + x + ", y = " + y);

        //여기에 x와 y에 저장된 값을 바꾸는 코드 작성
        int tmp;
        tmp=x;
        x=y;
        y=tmp;

        System.out.println("x = " + x + ", y = " + y);
    }
}
