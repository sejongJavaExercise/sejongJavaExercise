package chapter7.practice.question9;

public class Question9 {
    public static void main(String[] args) {
        Paper paper = new Paper(10,10);
        System.out.println(paper.toString());
    }
}

class Paper{
    int width;
    int height;
    Paper(int width, int height){
        this.width = width;
        this.height = height;
    }
    public String toString(){
        return "width = " + width + ", height = " + height + "인 종이";
    }
}
