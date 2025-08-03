package chapter9.notion.question17;

public class Question17 {
    public static void main(String[] args) {
        OnlyOne x = OnlyOne.getInstance();
        OnlyOne y = OnlyOne.getInstance();
        System.out.println(x == y);
    }
}

class OnlyOne {

    private static OnlyOne object;

    private OnlyOne(){}

    public static OnlyOne getInstance(){
        if(object == null){
            object = new OnlyOne();
        }

        return object;
    }
}