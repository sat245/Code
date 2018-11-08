/**
 * Created by i318862 on 28/07/17.
 */
public class Run_Length_Encoding {

    public static void main(String [] args) {
        String str = "wwwwaaadexxxxxx";
        String str1 = "";
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            str1= str1+ch;
            int count=1;
            while((i+1)<str.length() && ch==str.charAt(i+1)){
                count++;
                i++;
            }
            str1 = str1+count;


        }
        System.out.println(str1);
    }
}
