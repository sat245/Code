package BitManipulation;

/**
 * Created by i318862 on 23/01/18.
 */
public class ReverseBits {
    public static void main(String [] args){
        System.out.print(reverse(3));
    }
    public static long reverse(long a) {
        String str="";
        for(int i=0;i<32;i++){
            long j = a&1;
            a=a>>1;
            str = str+(j);
        }
        return Long.parseLong(str,2);
    }
}
