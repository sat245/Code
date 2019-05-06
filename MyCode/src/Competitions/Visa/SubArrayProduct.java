package Competitions.Visa;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SubArrayProduct {

    public static long countSubarrays(List<Integer> numbers, int k) {
        // Write your code here
        if (numbers == null || numbers.size() == 0) {
            return (long) 0;
        }

        int start = 0;
        int end = 0;
        long p1 = 1;
        long count = 0;

            while (end < numbers.size()) {
                p1 *= numbers.get(end);

                while (start < end && p1 > k) {
                    p1 /= numbers.get(start);
                    start++;
                }

                if (p1 <= k) {
                    int len = end - start + 1;
                    count += len;
                }

                end++;
            }
        return count;
    }



    public static void main(String[] args) throws IOException {


        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println(countSubarrays(numbers, 5));
    }
}