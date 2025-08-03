package chapter13.practice.question4;

public class Question4 {
    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableOfQuestion4());
        thread.start();
        try { thread.join(); }
        catch (InterruptedException e) {}
        for(int i=0;i<50;i++){
            System.out.print("+");
        }
    }
}

class RunnableOfQuestion4 implements Runnable{
    @Override
    public void run() {
        try {Thread.sleep(10000);} catch (InterruptedException e) {}
        for(int i=0;i<50;i++){
            System.out.print("-");
        }
    }
}
