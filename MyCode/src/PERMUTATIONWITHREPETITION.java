/**
 * Created by satyam mishra, Data Structure on 01/08/17.
 */
public class PERMUTATIONWITHREPETITION {

    public static void fn(String str,int l,int r) {

        if(l==r) {
            System.out.println(str);
        }

//        int j = 0;int r1=r;
//        while(j<l) {
//            while(l<=r1) {
//              System.out.println(copy(str,j,r1));
//                r1--;
//            }
//            r1=r;
//            j++;
//        }

        for(int i = l;i<=r;i++) {
            str = swap(str,l,i);
            fn(str,l+1,r);
            str = swap(str,i,l);

        }
    }

    private static String copy(String str, int j, int r1) {

        char [] arr  = str.toCharArray();
        arr[r1]=arr[j];
        return new String(arr);
    }

    private static String swap(String str, int l, int i) {
        char a= str.charAt(l);
        char b = str.charAt(i);
        char [] arr = str.toCharArray();
        arr[l]=b;
        arr[i]=a;
        return new String (arr);
    }

    public static void main(String [] args){
        String x= "ABC";
        fn(x,0,2);
    }
}
