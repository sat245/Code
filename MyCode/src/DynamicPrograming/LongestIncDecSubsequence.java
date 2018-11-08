package DynamicPrograming;

public class LongestIncDecSubsequence {

    public static int longestSubsequenceLength(final int[] A) {
        int len=A.length;
        int []  inc=new int[len];
        int [] dec=new int[len];
        if(len<=0)
            return 0;
        for(int i=0;i<len;i++){
            int count=0;
            while (count<i){
                if(A[count]<A[i]){
                    int max=inc[i];
                    if((inc[count]+1)<max){

                    }else {
                        inc[i]=(inc[count]+1);
                    }
                }
                count++;
            }
        }

        int maxValue=0;
        for(int i=len-1;i>=0;i--){
            int count=len-1;
            while (count>i){
                if(A[count]<A[i]){
                    int max=dec[i];
                    if((dec[count]+1)>max){
                        dec[i]=(dec[count]+1);
                    }
                }
                count--;
            }
            if(maxValue<(inc[i]+dec[i])){
                maxValue=(inc[i]+dec[i]);
            }
        }
        return maxValue+1;
    }



    public static void main(String [] args){
        int [] a = new int[]{1, 11, 2, 10, 4, 5, 2, 1};
        System.out.println(longestSubsequenceLength(a));
    }
}
