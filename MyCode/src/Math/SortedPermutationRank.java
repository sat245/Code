package Math;

/**
 * Created by satyam mishra, Data Structure on 14/11/17.
 */
public class SortedPermutationRank {
    public static void main(String [] args) {
//        System.out.println(factorial("ZCSFLVHXRYJQKWABGT".length()));
       System.out.println(findRank("ZCSFLVHXRYJQKWABGT"));


    }

    public static int findRank(String a) {
      char [] ch=a.toCharArray();
        int sum=0;
        for(int i=0;i<a.length();i++) {
            sum=(sum%1000003+rearrange(ch,a.length()-1-i,a.length()-1)%1000003)%1000003;
        }

        return sum%1000003;


    }

    public static int rearrange(char [] arr,int start,int end) {
        if(start==end){
            return 1;
        }
        long step=((factorial(end-start+1)%1000003)/((end-start+1)%1000003))%1000003;
        int i=start;int j=end;
        int sum=0;
        while(i<j){
        if(arr[i]>arr[j]){
            char ch=arr[i];
            arr[i] = arr[j];
            arr[j]=ch;

            j--;
            sum++;
        }else
            j--;
        }
        return (int) ((sum%1000003)*(step%1000003))%1000003;


    }
    public static long factorial(int n){
        if(n==1)
            return 1;

        return ((n%1000003)*(factorial(n-1))%1000003)%1000003;
    }
}
