package chapter13.practice.question1;

public class Question1 {
    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableOfQuestion1());
        thread.start();
        for(int i=0;i<50;i++){
            System.out.print("+");
        }
    }
}

class RunnableOfQuestion1 implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<50;i++){
            System.out.print("-");
        }
    }
}
