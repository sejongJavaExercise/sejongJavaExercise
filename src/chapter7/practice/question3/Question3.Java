class Paper {
    int width;
    int height;

    void printSize() {
        System.out.printf("width = %d, height = %d%n", width, height);
    }
}

class ColorPaper extends Paper {
    String color;

    ColorPaper(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    void printSize() {
        System.out.printf("가로 = %d, 세로 = %d, 색깔 = %s%n", width, height, color);
    }
}

public class Main {
    public static void main(String[] args) {
        ColorPaper cp = new ColorPaper(100, 100, "Red");
        cp.printSize();
    }
}
