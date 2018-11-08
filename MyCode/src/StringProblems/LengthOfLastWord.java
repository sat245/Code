package StringProblems;

/**
 * Created by i318862 on 10/12/17.
 */
public class LengthOfLastWord {
    public static void main(String[] args){
        System.out.println(lengthOfLastWord("Hell "));
    }

    public static int lengthOfLastWord(final String a) {
        int size=a.length();
        int trailingspace=0;
        int count=0;
        for(int i=size-1;i>=0;i--){
            char ch=a.charAt(i);
            if(count==0 && ch==' ') {
                trailingspace++;
                continue;
            }
            if (ch==' '){
                return count;
            }
            count++;

        }
        if(count+trailingspace==a.length())
            return count;
        return 0;
    }

}
