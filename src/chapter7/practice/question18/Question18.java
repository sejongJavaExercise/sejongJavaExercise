public class HelloWorld {
    public static void main(String[] args) {
        Greet greet = new Greet() {
            public void sayHello() {
                System.out.println("Hello World!");
            }
        };

        greet.sayHello();
    }
}

interface Greet {
    void sayHello();
}
