import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by satyam mishra, Data Structure on 02/11/17.
 */
public class NobleInteger {
//

    public static int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        int size = A.size();
        for(int i= A.size()-1;i>=0;i--) {

            if(A.get(i)==size-i-1 && (i+1)<size) {
                if(A.get(i+1)!=A.get(i)) {
                    return 1;
                }
            }
            if(A.get(i)==size-i-1 && (i+1)==size) {
                    return 1;
            }
        }
        return -1;
    }
}
