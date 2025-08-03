package chapter13.notion.quesetion5;

public class Question5 {
    public static void main(String[] args) {
        RunnableOfQuestion5 runnableOfQuestion5 = new RunnableOfQuestion5();
        Thread thread = new Thread(runnableOfQuestion5);
        thread.run();
        thread.start();
    }
}

class RunnableOfQuestion5 implements Runnable{
    @Override
    public void run() {
        System.out.println("run() 메서드가 실행되었습니다.");
    }
}
