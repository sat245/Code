package MultiThreading.WaitNotify;

public class Waiter implements Runnable {

    public Waiter(SimplePojo pojo) {
        this.pojo = pojo;
    }

    SimplePojo pojo;
    @Override
    public void run() {
        synchronized (pojo){
            System.out.println("waiter started "+ Thread.currentThread().getName());
            try {
                pojo.wait();
                System.out.println("waiter chalpada  "+ Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
