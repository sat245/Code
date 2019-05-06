package MultiThreading.Inconsistency;

public class Service {

    public static void main(String [] args) throws InterruptedException {

        IncrementCount obj = new IncrementCount();
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);

        t1.start();
        System.out.println("1 "+t1.getName() + obj.getCount());
//        t1.join();
        //main thread waits till t0 i dead
        t2.start();
//        t2.join();
        //main thread waits till t1 i dead
        System.out.println("2 "+t2.getName() + obj.getCount());
//


    }
}
