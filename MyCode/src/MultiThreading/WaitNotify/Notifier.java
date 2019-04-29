package MultiThreading.WaitNotify;

public class Notifier implements Runnable{

    SimplePojo pojo;

    public Notifier(SimplePojo pojo) {
        this.pojo = pojo;
    }

    public SimplePojo getPojo() {
        return pojo;
    }

    public void setPojo(SimplePojo pojo) {
        this.pojo = pojo;
    }


    @Override
    public void run() {
        synchronized (pojo){
            System.out.println("Notifier thread started" + Thread.currentThread().getName());
            pojo.notify();
            System.out.println("Notifier thread ended" + Thread.currentThread().getName());
        }
    }
}
