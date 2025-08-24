class Circle {
    int radius;
    int x;
    int y;

    Circle() { }

    Circle(int radius, int x, int y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }
}

public class PrintCircleTwo {
    public static void main(String[] args) {
        Circle c1 = new Circle(5, 2, 3);
        Circle c2 = copyCircle(c1);
        System.out.printf("radius = %d, x = %d, y = %d", c2.radius, c2.x, c2.y);
    }

    public static Circle copyCircle(Circle c) {
        return new Circle(c.radius, c.x, c.y);
    }
}
