package chapter9.notion.question2;

public class Question2 {
    public static void main(String[] args) {
        Paper p = new Paper(10, 20);
        Paper q = new Paper(10, 20);

        System.out.println(p.equals(q));
    }
}

class Paper{
    int width;
    int height;
    Paper(int width, int height){
        this.width = width;
        this.height = height;
    }

    public boolean equals(Object obj) {
        if(obj instanceof Paper){
            Paper q = (Paper) obj;
            return (this.width == q.width) && (this.height == q.height);
        }
        else{
            return false;
        }
    }
}