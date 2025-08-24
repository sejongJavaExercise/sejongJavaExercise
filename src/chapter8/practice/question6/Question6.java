public class ThrowsExceptionEx {
    public static void main(String[] args) {
        method1();
    }

    static void method1() {
        try {
            method2();
        } catch (Exception e) {
            System.out.println("예외가 발생했습니다: " + e.getMessage());
        }
    }

    static void method2() throws Exception {
        throw new Exception("method2에서 발생한 예외");
    }
}
