package chapter13.practice.question2;

public class Question2 {
    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableOfQuestion2());
        thread.start();
        for(int i=0;i<50;i++){
            System.out.print("+");
        }
    }
}

class RunnableOfQuestion2 implements Runnable{
    @Override
    public void run() {
        try {Thread.sleep(10000);} catch (InterruptedException e) {}
        for(int i=0;i<50;i++){
            System.out.print("-");
        }
    }
}