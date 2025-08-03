package chapter13.notion.question8;

public class Question8 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableOfQuestion8());
        Thread thread2 = new Thread(new RunnableOfQuestion8());
        thread2.setPriority(7);
//        System.out.println(thread1.getPriority());
//        thread1.start();
//        thread2.start();
//        thread1.setPriority(8);
//        System.out.println(thread1.getPriority());
    }
}

class RunnableOfQuestion8 implements Runnable{
    @Override
    public void run() {}
}