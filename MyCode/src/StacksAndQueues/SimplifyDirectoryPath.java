package StacksAndQueues;

import java.util.Stack;

/**
 * Created by satyam mishra, Data Structure on 24/01/18.
 */
public class SimplifyDirectoryPath {

    public static void main(String [] args){
        System.out.println(simplifyPath("/."));
    }
    public static String simplifyPath(String A) {
        Stack <String>stack=new Stack();
        String str[]=A.split("/");
        for(int i=1;i<str.length;i++){
            if(str[i].equals("/") || (str[i].equals("."))){
                continue;
            }
            if(  str[i].equals("..")){
                if(stack.isEmpty())
                    continue;
                stack.pop();
                continue;
            }
            stack.push(str[i]);
        }
        if(stack.isEmpty()){
            return "/";
        }
        StringBuilder s=new StringBuilder();
        while (!stack.isEmpty()){
            if(!stack.peek().equals("")) {
                StringBuilder a = new StringBuilder(stack.peek());
                s =new StringBuilder("/").append(a.append(s));
            }
            stack.pop();
        }
        return s.toString();
    }
}
