package Competitions;
//
//City Tour
//        There are  cities numbered from  to  in BitLand, each of which has its own value .
//
//        You are travelling in BitLand. At first you choose a city assumed to be  and a number assumed to be . Then you can start your trip at the city numbered . After that you go to the one numbered , and then  and so on until you reach  again.
//
//        When you finish your journey, you add up the values of all the different cities where you have ever been to and regard the result as your degree of satisfaction. Your task is to select  and  wisely so that you can maximize your degree of satisfaction.
//
//        Input Format
//
//        The first line of the input contains an integer , denoting the number of cities in BitLand.
//        The next line contains  space-separated integers , denoting value of each city.
//
//        Output Format
//
//        In the single line of the output print the required maximum value.
//
//        Constraints
//
//
//
//        Sample Input
//        7
//        5 -7 1 4 -2 3 8
//        Sample Output
//        12
//        Explanation
//        Select the first city  and set  to be , this way you can travel all the cities. Note that there is no other way to get the value better than .

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CityTour {
    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<Integer> list = new ArrayList<>();
        int count = 0;
        while (n>count){
            count++;
            list.add(s.nextInt());
        }

        int k =0;
        int m=1;
        int max=Integer.MIN_VALUE;

            for(k=0;k<n;k++) {
                count=1;
                m=1;
                for(int j=k;j<n-m;j++) {
                    int sum = 0;
                    for (int i = j; i < n; i += m) {
                        sum = sum + list.get(i);
                    }
                    if (sum > max) {
                        max = sum;
                    }
                    count++;
                    m = count * m;
                }
            }

        System.out.println(max);

    }
}
