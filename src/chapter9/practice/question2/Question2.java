package chapter9.practice.question2;

public class Question2 {
    public static void main(String[] args) {
        Paper p = new Paper(10, 20);

        System.out.println(p.toString());
    }
}

class Paper{
    int width;
    int height;
    Paper(int width, int height){
        this.width = width;
        this.height = height;
    }

    //여기에 toString() 재정의

    @Override
    public String toString() {
        return "width : " + width + ", height : " + height;
    }
}
