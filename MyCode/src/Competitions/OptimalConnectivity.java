package Competitions;
//
//Optimal Connectivity
//        A company X has a network of  computers. There are  links in the network, each link connecting a pair of computers. Each link has a particular time lag in between the two computers. It is assured that all the computers are connected.
//        The engineers at X assume that the current status of the network is a bit slow and they want to improve it. So they experiment with computer pairs.
//        For each of these  pairs, you are given new direct link's time lag between the pair of computers. If these two computers are directly connected using the new link and some old link is removed from the network, you need to check if the network become better.
//
//        A new network is better than older if the sum of all the time lags is strictly lesser in the new network than the old one and the network is still connected.
//        Note:  All queries are independent. That is, for each of the  pairs, old network is the initial given network.
//
//        Input Format
//        The first line contains an integer  denoting the total number of computers.
//        Each of the next  lines contains a triplet of integers  which states that the computer with the number  is connected to the computer with the number  and the time lag is of  units.
//        The next line contains an integer .
//        Each of the next  lines contains three integers  and  which states that the new direct link between computer with the number and computer with the number  has the time lag of  units.
//
//        Output Format
//        For each query, you need to print YES  if you can improve the network by adding this link else print NO.
//
//        Input Constraints
//
//        Sample Input
//        5
//        1 2 2
//        1 3 3
//        3 4 5
//        3 5 4
//        2
//        1 4 4
//        4 5 6
//        Sample Output
//        YES
//        NO
//        Explanation
//        For the first query, we can see that if we remove the link 3 -> 4 and add the new link 1 -> 4, the lag is reduced by 1.
//        For the second query, we can't add the new link because it will increase the lag.
//
//        Note: Your code should be able to convert the sample input into the sample output. However, this is not enough to pass the challenge, because the code will be run on multiple test cases. Therefore, your code must solve this problem statement.

import java.util.*;

public class OptimalConnectivity {
    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List <Integer>a= new ArrayList(n);
        List <Integer>b = new ArrayList(n);
        List <Integer>lag = new ArrayList(n);
        Map<Integer,Integer> map = new HashMap();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        n--;

        while (n>0){
            n--;
            int x = s.nextInt();
            int y= s.nextInt();
            int z = s.nextInt();
if(z>max){
    max=z;
}
if(z<min){
    min=z;
}


            a.add(x);
            b.add(y);
            lag.add(z);


            map.compute(x, (k, v) -> v==null?1:v + 1);
            map.compute(y, (k, v) -> v==null?1:v + 1);

        }

        int q= s.nextInt();

        while (q>0){
            q--;
            int a1= s.nextInt();
            int b1 = s.nextInt();
            int c1 = s.nextInt();

            if(c1>=max){
                System.out.println("NO");
                continue;
            }
            if(c1<min){
                System.out.println("YES");
                continue;
            }
            int count =0;

            for(int i=0;i<lag.size();i++){
                int value = lag.get(i);
                if(value<c1){
                    continue;
                }
                    int a2=a.get(i);
                    int b2 =b.get(i);
                    if(a2==a1 && b2==b1){
                        if(value>c1){
                            count++;
                            break;
                        }else {
                            count=0;
                            break;

                        }
                    }

                    int a3 = map.get(a2); int  b3  = map.get(b2);
                    if(a3>1 && b3>1){
                      count++;
                      break;
                    }else if((a3>1 && b1==b2) ||  (a1==a2 && b3>1)){
                        count++;
                        break;
                    }


            }

            if(count>0){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }




        }

    }
}

//
//    Optimal Grouping
//    There are  students standing in a line. Each student has his own intelligence level which is denoted by the array  where  denotes the intelligence level of the   student in the line. Now the teacher wants to distribute students in  groups. Each group should be formed from adjacent standing students only.
//
//        The beauty of a group is defined by the fact that if there is a person with intelligence level  then if there are students of less intelligence level that are in the same group standing after the student , the beauty increases by count of such pairs of students. In simple words, the beauty of the group is the total number of pairs of students in that group such that  and .
//
//        Now the teacher is worried about the sum of the beauty of all the groups that she forms. You being the most intelligent student has to suggest a plan such that if students are divided in that way, the sum of the beauty of all groups is maximized. You need to print this maximum value which can be obtained.
//
//        Input
//        The first line of input contains two space-separated integers  and . The next line of input contains  space separated integers that denote intelligence level of the  student.
//
//        Output
//        In the output print the maximum beauty sum that can be obtained over all possible ways to distribute the students into  groups.
//
//        Constraints
//
//
//        Sample Input
//        5 2
//        9 1 7 2 3
//        Sample Output
//        4
//        Explanation
//        If we keep student 1, 2 , 3 and 4 in a group and rest in another group then the partition looks like {9,1,7,2} and {3}. Now the sum of beauty is 4 + 0 = 4. This sum is maximum over all types of valid partitions.