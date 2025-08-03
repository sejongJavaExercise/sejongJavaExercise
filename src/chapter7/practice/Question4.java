package chapter7.practice;

public class Question4 {
    public static void main(String[] args) {

    }
}

class Paper{
    int width;
    int height;

    Paper(int width,int height){
        this.width = width;
        this.height = height;
    }
}

class ColorPaper extends Paper{
    String color;

    ColorPaper(int width, int height, String color){
        super(width, height);
        this.color = color;
    }
}
