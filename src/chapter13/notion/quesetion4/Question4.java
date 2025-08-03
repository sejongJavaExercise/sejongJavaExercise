package chapter13.notion.quesetion4;

public class Question4 {
    public static void main(String[] args) {
        RunnableOfQuestion4 runnableOfQuestion4 = new RunnableOfQuestion4();
        Thread thread = new Thread(runnableOfQuestion4);
        thread.start();
        //thread.start();
    }
}

class RunnableOfQuestion4 implements Runnable{
    @Override
    public void run() {}
}
