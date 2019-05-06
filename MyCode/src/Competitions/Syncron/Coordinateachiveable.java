package Competitions.Syncron;

import java.util.ArrayDeque;
import java.util.Queue;

public class Coordinateachiveable {


    public static String isPossible(int a, int b, int c, int d) {
        // Write your code here

        if(a>c || b>d) {
            return "No";
        }
            Queue<a> queue = new ArrayDeque<>();
                queue.add(new a(a,b));
                //&& (queue.peek().x<=c || queue.peek().y<=d)
            while (!queue.isEmpty() ){
                a obj = queue.poll();
                int a1=obj.x;
                int b1 = obj.y;
                if(a1==c && b1==d){
                    return "Yes";
                }else {

                    int a3 = a1+b1;
                    if(a3<=c){
                        a obj1 = new a(a3,b1);
                        queue.add(obj1);
                    }

                    if(a3<=d){
                        a obj2 = new a(a1,a1+b1);
                        queue.add(obj2);
                    }


                }
            }
        return "No";
    }

    static class a {
        int x;
        int y;

        public a(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getSum(){
            return x+y;
        }
    }

    public static void main(String[] args){
        System.out.println(isPossible(1,4,5,9));
    }
}
