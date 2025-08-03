package chapter13.notion.question15;

public class Question15 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableOfQuestion15(10000, "<thread1 종료>"));
        Thread thread2 = new Thread(new RunnableOfQuestion15(20000, "<thread2 종료>"));
        thread1.start();
        thread2.start();
        try { thread2.sleep(30000); }
        catch (InterruptedException e) {}
        System.out.println("<main 종료>");
    }
}

class RunnableOfQuestion15 implements Runnable{
    long sleepingTime;
    String content;

    RunnableOfQuestion15(long sleepingTime, String content){
        this.sleepingTime=sleepingTime;
        this.content=content;
    }

    @Override
    public void run() {
        try { Thread.sleep(sleepingTime); }
        catch (InterruptedException e) {}
        System.out.println(content);
    }
}
