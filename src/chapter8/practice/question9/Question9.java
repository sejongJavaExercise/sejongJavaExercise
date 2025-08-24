public class MethodAndMain {
    public static void main(String[] args) {
        try {
            method();
        } catch (Exception e) {
            System.out.println("main에서 Exception이 처리되었습니다.");
        }
    }

    static void method() throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("method에서 Exception이 처리되었습니다.");
            throw e;
        }
    }
}
