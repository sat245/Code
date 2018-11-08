import java.util.Scanner;

/**
 * Created by i318862 on 29/10/17.
 */
public class Findkthcharacterinstring {

    public static void main(String[] args) {
        int test = 0;
        Scanner sc = new Scanner(System.in);

        if (sc.hasNext()) {
            test = sc.nextInt();

        }

        while (test > 0) {
            test--;
            int m = 0, k = -1, n = 0;

            if (sc.hasNext()) {
                m = sc.nextInt();

            }
            if (sc.hasNext()) {
                k = sc.nextInt();

            }
            if (sc.hasNext()) {
                n = sc.nextInt();

            }
            fn(m,k,n);
        }
        return;
    }

    private static void fn(int m, int k, int n) {
        int length  = Integer.toBinaryString(m).length();
        double number = k;
        int flip = 0;
        double k1 = length*(Math.pow(2,n));
        number=k1-k;
        while (n > 0) {
            n--;

            if (number % 2 != 0) {
                flip++;
            }
            number = Math.ceil(number / 2);
        }

        int flag = (int) number-1;
        flag = 1 << flag;
        m = m & (flag);

        if (m == 0) {
            if (flip % 2 == 0) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
        } else {
            m = 1;
            if (flip % 2 == 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }

        }
    }


}


//Downloaded ArrayLeftRotation
//import java.util.*;
//        import java.lang.*;
//        import java.io.*;
//
//class Findkthcharacterinstring {
//    static Map<String, String>memo = new HashMap<>();
//    public static void main (String[] args) throws Exception{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int times = Integer.parseInt(br.readLine());
//        while(times-- > 0){
//            String[] input = br.readLine().split(" ");
//            int m = Integer.parseInt(input[0]);
//            int k = Integer.parseInt(input[1]);
//            int n = Integer.parseInt(input[2]);
//            String binary = dToB(m);
//            String processed = "";
//            for(int i=0; i<n; i++){
//                processed = convert(binary);
//                binary = processed;
//            }
//            System.out.println(processed.charAt(k));
//        }
//
//    }
//
//    private static String dToB(int m){
//        StringBuilder sb = new StringBuilder("");
//        while(m>0){
//            sb.append(m%2);
//            m/=2;
//        }
//        return sb.reverse().toString();
//    }
//
//    private static String convert(String in){
//        if(memo.containsKey(in)){
//            return memo.get(in);
//        }
//        if(in.equals("")){
//            return "";
//        }
//        if(in.equals("0")){
//            return "01";
//        }
//        if(in.equals("1")){
//            return "10";
//        }
//        return convert(in.substring(0, in.length()/2))+convert(in.substring(in.length()/2));
//    }
//}