public class EqualsOverride {
    public static void main(String[] args) {
        Paper p = new Paper(10, 20);
        Paper q = new Paper(10, 20);

        System.out.println(p.equals(q));
    }
}

class Paper {
    int width;
    int height;

    Paper(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Paper paper = (Paper) obj;
        return this.width == paper.width && this.height == paper.height;
    }
}
