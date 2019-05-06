package MultiThreading.ThreadSafety;

public class Service {


    public static void main(String [] args) throws InterruptedException {
        String [] arr = {"a","b","c"};
        HashMapProcessor obj = new HashMapProcessor(arr);
        obj.setLock(new Object());
        Thread t1 = new Thread(obj,"t1");
        Thread t2 = new Thread(obj,"t2");
        Thread t3 = new Thread(obj,"t3");
        Thread t4 = new Thread(obj,"t4");


synchronized (obj.getLock()) {
    t1.start();
    t2.start();
    t3.start();
    t4.start();

}
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        for(int i =0;i<arr.length;i++)
        System.out.println(arr[i]);

    }
}
