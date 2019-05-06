package Competitions.Hackerrank;

public class FirstEvenLongestWord {

    public static String longestEvenWord(String sentence) {
        // Write your code here

        if(sentence==null || sentence.length()==0){
            return sentence;
        }
        String [] array = sentence.split("\\s+");
        String res = "";        int max = 0;
        for(int i=0;i<array.length;i++){
            String str = array[i];
            int len = str.length();
            if(len%2==0 && len>max){
                max = len;
                res=str;
            }
        }
        return res==""?"00":res;
    }


    public static void main(String [] args){
        String str="It is a   pleasant   day today pLeasant";
         str = longestEvenWord(str);
         System.out.println(str);

    }
}
