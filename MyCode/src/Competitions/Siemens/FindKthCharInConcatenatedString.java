
import java.util.Arrays;

public class FindKthCharInConcatenatedString {

    public static char[] solve(int [][] Q,String [] arr){

//        if(arr.length<=0 || Q.length<=0){
//            return null;
//        }
        int len = Q.length;

        char [] result = new char[len];

        for(int i=0;i<len;i++){
            int left = Q[i][0];
            int right = Q[i][1];
            int k = Q[i][2];
            String str = "";

            for(int j=left;j<=right;j++){
                str = str+arr[j];
            }

            char [] chars = str.toCharArray();
            Arrays.sort(chars);

            result[i] = chars[k-1];
        }

        return result;
    }


    public static void main(String [] args){
        String [] arr = new String[5];
        arr[0]="aaaaa";arr[1]="bbbbb";arr[2]="ccccc";arr[3]="ddddd";arr[4]="eeeee";

        int [][] Q = new int[1][3];
        Q[0][0]=3;
        Q[0][1]=3;
        Q[0][2]=3;

        char [] chars = solve(Q,arr);

        for(int i =0;i<chars.length;i++){
            System.out.println(chars[i]);
        }
    }
}
