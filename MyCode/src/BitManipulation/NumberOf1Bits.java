package BitManipulation;

/**
 * Created by i318862 on 22/01/18.
 */
public class NumberOf1Bits {
    public static void main(String [] args){
        System.out.println(numSetBits(3));
    }
    public static int numSetBits(long a) {
        return Long.bitCount(a);
    }
}
