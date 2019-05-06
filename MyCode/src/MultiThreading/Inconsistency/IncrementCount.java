package MultiThreading.Inconsistency;

public class IncrementCount implements Runnable {
    public int getCount() {
        return count;
    }

    int count;


    @Override
    public void run() {
        for(int i=0;i<5;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() +" "+ count);
            count++;
        }
    }
}
