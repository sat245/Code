package tOPTEL;

/**
 * Data Structures & Algorithms
 * https://github.com/SatyamMishra245/Code/tree/master/MyCode
 *
 * @ author : satyam mishra
 * @ created : 02-06-2021
 */
public class Reformat {
    public static String solution(String S) {
        // write your code in Java SE 8
        String str = "";
        for(int i = 0;i<S.length();i++) {
            char ch = S.charAt(i);
            if(ch >= '0' && ch <= '9') {
                str+=ch;
            }
        }

        int len = str.length();
        int maxIndex = len;
        if(len%3 == 1 ) {
            maxIndex = len-4;
        }
        String str1 = "";
        String str2 = "";
        int count = 0;int i = 0;
        for(; i <maxIndex; i++) {
            count++;
            str2=str2+str.charAt(i);
            if(count==3 || (count==2 && i==maxIndex-1)) {
                if(str1.equals("")) {
                    str1+=str2;
                }else {
                    str1 = str1 + "-" + str2;
                }
                str2="";
                count=0;

            }
        }

        if(maxIndex<len) {
            count=0;
            str2="";
            for(; i <len; i++) {
                count++;
                str2=str2+str.charAt(i);
                if(count==2) {
                    if(str1.equals("")) {
                        str1+=str2;
                    }else {
                        str1 = str1 + "-" + str2;
                    }
                    str2="";
                    count=0;

                }
            }

        }
        return str1;
    }

    public static void main(String [] args) {
        String str = "00-44  48 5555 8361";
        System.out.println(solution(str));
    }
}
