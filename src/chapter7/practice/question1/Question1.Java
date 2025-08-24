class Paper {
    int width; 
    int height;

    Paper(int width, int height) {
        this.width = width;
        this.height = height;
    }
}

class ColorPaper {
    Paper paper;
    String color; 

    ColorPaper(int width, int height, String color) {
        this.paper = new Paper(width, height);
        this.color = color;
    }

    void printInfo() {
        System.out.println("가로: " + paper.width);
        System.out.println("세로: " + paper.height);
        System.out.println("색깔: " + color);
    }
}

public class Main {
    public static void main(String[] args) {
        ColorPaper cp = new ColorPaper(100, 100, "Red");

        cp.printInfo();
    }
}
