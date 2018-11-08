package Flipkart;

/**
 * Created by i318862 on 06/02/18.
 */
public class Minimummovestoreachtarget {
    public static void main(String [] args){
        System.out.println(fn(2));
    }

    public static int fn(int i){
        int n=1;
        while(true){
            int sum=n*(n+1)/2;
            if(sum==i){
                return n;
            }
            if((sum>i)){
                if((sum-i)%2==0){
                    return n;
                }
            }
            n++;
        }
    }
}
