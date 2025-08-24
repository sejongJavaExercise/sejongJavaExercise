public class StringNull {
    public static void main(String[] args) {
        String str = null;

        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("예외 발생: " + e.getMessage());
        }
    }
}
