package tOPTEL;

/**
 * Data Structures & Algorithms
 * https://github.com/SatyamMishra245/Code/tree/master/MyCode
 *
 * @ author : satyam mishra
 * @ created : 02-06-2021
 */
public class PhoneBook {
    public static void main(String [] args) {

        String [] A = {"pim", "pom"};
        String [] B = {"999999999","777888999"};
        String P = "88999";
        // write your code in Java SE 8
        if(A==null || B==null || P==null) {
          //  return null;
        }
        String ans = "";
        for(int i = 0;i<B.length;i++) {
            if(B[i].contains(P)) {
                if( ans.compareTo(A[i]) > 0) {
                    ans = A[i];
                }
            }
        }
        if(ans.equals("")) {
            ans = "NO CONTACT";
        }
        System.out.println(ans);
      //  return ans;
    }
}
