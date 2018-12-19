package Competitions;

//Chef is a very experienced and well-known cook. He has participated in many cooking competitions in the past — so many that he does not even remember them all.
//
//        One of these competitions lasted for a certain number of days. The first day of the competition was day S of the week (i.e. Monday, Tuesday etc.) and the last day was day E of the week. Chef remembers that the duration of the competition (the number of days between the first and last day, inclusive) was between L days and R days inclusive. Is it possible to uniquely determine the exact duration of the competition? If so, what is this duration?
//
//        Input
//        The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
//        The first and only line of each test case contains two space-separated strings S and E, followed by a space and two space-separated integers L and R.
//        Output
//        For each test case, print a single line containing:
//
//        the string "impossible" if there is no duration consistent with all given information
//        the string "many" if there is more than one possible duration
//        one integer — the duration of the competition, if its duration is unique
//        Constraints
//        1≤T≤10,000
//        1≤L≤R≤100
//        S is one of the strings "saturday", "sunday", "monday", "tuesday", "wednesday", "thursday" or "friday"
//        E is one of the strings "saturday", "sunday", "monday", "tuesday", "wednesday", "thursday" or "friday"
//        Subtasks
//        Subtask #1 (100 points): original constraints
//
//        Example Input
//        3
//        saturday sunday 2 4
//        monday wednesday 1 20
//        saturday sunday 3 5
//        Example Output
//        2
//        many
//        impossible

import java.util.Scanner;

 class Event {

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();

        while(test>0){
            test--;
            String start = scan.next();
            String  end = scan.next();

            int s= scan.nextInt();
            int e= scan.nextInt();

            int diff = fn(end)-fn(start)+1;

            if(diff<=0){
                diff=diff+7;
            }

            if(diff>e) {
                System.out.println("impossible");
                continue;
            }
            int count=0;int i=0;
            while (diff<=e){
                if(diff>=s && diff<=e){
                    count++;
                    i=diff;
                }
                diff=diff+7;
            }

            if(count==1){
                System.out.println(i);
            }else if(count>1){
                System.out.println("many");

            }else {
                System.out.println("impossible");

            }
        }
    }

    private static int fn(String str){
        if(str.equalsIgnoreCase("MONDAY")){
            return 1;
        }
        if(str.equalsIgnoreCase("TUESDAY")){
            return 2;
        }
        if(str.equalsIgnoreCase("WEDNESDAY")){
            return 3;
        }
        if(str.equalsIgnoreCase("THURSDAY")){
            return 4;
        }
        if(str.equalsIgnoreCase("FRIDAY")){
            return 5;
        }
        if(str.equalsIgnoreCase("SATURDAY")){
            return 6;
        }
        if(str.equalsIgnoreCase("SUNDAY")){
            return 7;
        }
        return -22;
    }
}
