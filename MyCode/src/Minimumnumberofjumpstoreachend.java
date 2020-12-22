/**
 * Created by satyam mishra, Data Structure on 03/07/17.
 */
public class Minimumnumberofjumpstoreachend {
    static int minJumps(int arr[], int l, int h)
    {
        // Base case: when source and destination are same
        if (h == l)
            return 0;

        // When nothing is reachable from the given source
        if (arr[l] == 0)
            return INT_MAX;

        // Traverse through all the points reachable from arr[l]. Recursively
        // get the minimum number of jumps needed to reach arr[h] from these
        // reachable points.
        int min = INT_MAX;
        for (int i = l+1; i <= h && i <= l + arr[l]; i++)
        {
            int jumps = minJumps(arr, i, h);
            if(jumps != INT_MAX && jumps + 1 < min)
                min = jumps + 1;
        }

        return min;
    }

    public static void main(String [] args)
    {
        int arr[] = {1, 3, 6, 3, 2, 3, 6, 8, 9, 5};
        int n = arr.length;
        System.out.print("Minimum number of jumps to reach end is %d " + minJumps(arr, 0, n-1));
    }

    static int INT_MAX = 9999;
}
