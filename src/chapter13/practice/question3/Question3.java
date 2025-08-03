package chapter13.practice.question3;

public class Question3 {
    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableOfQuestion3());
        thread.start();
        for(int i=0;i<50;i++){
            System.out.print("+");
        }
        try {Thread.sleep(5000);} catch (InterruptedException e) {}
        thread.interrupt();
    }
}

class RunnableOfQuestion3 implements Runnable{
    @Override
    public void run() {
        try {Thread.sleep(10000);} catch (InterruptedException e) {}
        for(int i=0;i<50;i++){
            System.out.print("-");
        }
    }
}
