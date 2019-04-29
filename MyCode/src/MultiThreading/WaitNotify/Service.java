package MultiThreading.WaitNotify;

public class Service {

    public static void main(String[]  args){
    SimplePojo pojo = new SimplePojo("Satyam","234");
    Thread thread = new Thread(new Waiter(pojo),"waiter thread");
    thread.start();
    System.out.println("Waiter thread is being called");
    Thread thread1 = new Thread(new Notifier(pojo),"Notifier Thread");
        System.out.println("notifier" +
                " thread is being called");
        thread1.start();

        System.out.println("program ends");
    }
}
