package Flipkart;

/**
 * Created by satyam mishra, Data Structure on 07/02/18.
 */
public class sumtoNarrayelementswithrepetitionallowed {

    static int arr[] = {2,1,3};

    // method to count the total number
    // of ways to sum up to 'N'
    static int countWays(int N) {
        int count[] = new int[N + 1];

        // base case
        count[0] = 1;

        // count ways for all values up to 'N'
        // and store the result
        for (int i = N; i <= N; i++)
            for (int j = 0; j < arr.length; j++)

                // if i >= arr[j] then
                // accumulate count for value 'i' as
                // ways to form value 'i-arr[j]'
                if (i >= arr[j])
                    count[i] += count[i - arr[j]];

        // required number of ways
        return count[N];
    }
    public static void main(String[] args)
    {
        int N = 5;
        System.out.println("Total number of ways = "
                + countWays(N));
    }
    }
