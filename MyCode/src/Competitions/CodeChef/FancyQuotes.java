package Competitions.CodeChef;

//"I don't have any fancy quotes." - vijju123
//
//        Chef was reading some quotes by great people. Now, he is interested in classifying all the fancy quotes he knows. He thinks that all fancy quotes which contain the word "not" are Real Fancy; quotes that do not contain it are regularly fancy.
//
//        You are given some quotes. For each quote, you need to tell Chef if it is Real Fancy or just regularly fancy.
//
//        Input
//        The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
//        The first and only line of each test case contains a single string S denoting a quote.
//        Output
//        For each test case, print a single line containing the string "Real Fancy" or "regularly fancy" (without quotes).
//
//        Constraints
//        1≤T≤50
//        1≤|S|≤100
//        each character of S is either a lowercase English letter or a space
//        Subtasks
//        Subtask #1 (100 points): original constraints
//
//        Example Input
//        2
//        i do not have any fancy quotes
//        when nothing goes right go left
//        Example Output
//        Real Fancy
//        regularly fancy
//        Explanation
//        Example case 1: "i do not have any fancy quotes"
//
//        Example case 2: The word "not" does not appear in the given quote.


import java.util.Scanner;

public class FancyQuotes {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner scan = new Scanner(System.in);
        int test = 0;
        if(scan.hasNextLine()){
            test= scan.nextInt();
        }


        if(scan.nextLine()!=null){

        }
        while(test>0){
            test--;
            String str = scan.nextLine();
            String [] arr = str.split(" ");
            boolean flag = false;
            for(int i=0;i<arr.length;i++){
                if(arr[i].equalsIgnoreCase("not")){
                    flag = true;
                }
            }
            if(flag){
                System.out.println("Real Fancy");
            }else {
                System.out.println("regularly fancy");
            }
        }
    }
}
