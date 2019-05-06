package MultiThreading.ThreadSafety;

public class HashMapProcessor implements Runnable{
  private   String [] arr;

    public HashMapProcessor(String[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        try {
           // Thread.sleep(1000);
            append(Thread.currentThread().getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    result coming without synchronization
//    a t4 t3 t2
//    b t3 t1 t4 t2
//    c t1 t4 t3 t2

//    result with synchronization in method declaration
//    a t1 t4 t3 t2
//    b t1 t4 t3 t2
//    c t1 t4 t3 t2

//    private  synchronized void append(String threadName){
//
//        for(int i=0;i<arr.length;i++){
//            System.out.println(threadName);
//          arr[i] = arr[i] +" "+ threadName;
//        }

    private  synchronized void append(String threadName){

            for (int i = 0; i < arr.length; i++) {
                synchronized (lock) {
                System.out.println(threadName);
                arr[i] = arr[i] + " " + threadName;
            }
        }
    }
//dummy object to be used as synchronized


    public void setLock(Object lock) {
        this.lock = lock;
    }

    public Object getLock() {
        return lock;
    }

    Object lock;
}
