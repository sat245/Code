package THREADING;

/**
 * Created by i318862 on 20/04/18.
 */
public class Trial extends Thread{
        public void run(){
            System.out.println("running thread name is:"+Thread.currentThread().getName());
            System.out.println("running thread priority is:"+Thread.currentThread().getPriority());

        }
        public static void main(String args[]){
            Trial m1=new Trial();
            Trial m2=new Trial();
            m1.setPriority(Thread.MIN_PRIORITY);
            m2.setPriority(Thread.MAX_PRIORITY);
            m1.start();
            m2.start();

        }



}


