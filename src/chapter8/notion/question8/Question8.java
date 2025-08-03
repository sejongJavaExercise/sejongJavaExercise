package chapter8.notion.question8;

public class Question8 {
    public static void main(String[] args) {
        System.out.println(1);
        try{
            System.out.println(2);
            // ArithmeticException 발생
            throw new ArithmeticException();
            // ClassCastException 발생
            //throw new ClassCastException();
            // NullPointerException 발생
            //throw new NullPointerException();
        }
        catch(ArithmeticException e){
            System.out.println(4);
        }
        catch(ClassCastException e){
            System.out.println(5);
        }
        catch (Exception e){
            System.out.println(6);
        }
        System.out.println(7);
    }
}
