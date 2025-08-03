package chapter7.notion.question33;

public class Question33 {
    public static void main(String[] args) {
        Paper paper = new ColorPaper(100, 100, "Red");
        //System.out.printf("width = %d, height = %d, color = %s",
        //        paper.width, paper.height, paper.color);
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

class ColorPaper extends Paper {
    String color;

    ColorPaper(int width, int height, String color){
        super(width, height);
        this.color = color;
    }
}
