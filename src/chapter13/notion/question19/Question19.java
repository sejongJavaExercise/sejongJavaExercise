package chapter13.notion.question19;

public class Question19 {
    public static void main(String[] args) {
        RunnableOfQuestion19 runnableOfQuestion19 = new RunnableOfQuestion19();
        Thread thread1 = new Thread(runnableOfQuestion19);
        Thread thread2 = new Thread(runnableOfQuestion19);
        thread1.start();
        thread2.start();
    }
}

class Account{
    private int balance = 1000;
    public synchronized int getBalance(){ return balance; }
    public synchronized void withdraw(int money){
        if (balance >= money) {
            try{ Thread.sleep(1000); }
            catch (InterruptedException e) {}
            balance -= money;
}

        }
                }
class RunnableOfQuestion19 implements Runnable{
    Account account = new Account();
    @Override
    public void run() {
        while (account.getBalance() > 0) {
            int money = (int) (Math.random() * 5 + 1) * 100;
            System.out.println("출금액 : " + money);
            account.withdraw(money);
            System.out.println("잔액 : " + account.getBalance());
        }
    }
}