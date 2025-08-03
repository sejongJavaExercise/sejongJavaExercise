package chapter8.notion.question7;

public class Question7 {
    public static void main(String[] args) {
        System.out.println(1);
        try{
            System.out.println(2);
        }
        catch(Exception e){
            System.out.println(3);
        }
        System.out.println(4);

        try {
            System.out.println(5);
            System.out.println(0/0); // 예외발생
            System.out.println(6);
        }catch(Exception e){
            System.out.println(7);
        }
        System.out.println(8);
    }
}
