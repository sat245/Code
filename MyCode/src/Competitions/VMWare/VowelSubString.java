package Competitions.VMWare;
//this code is not right
//we have to run two loops
//i =0 to len-5
//j=i to len
//for each substring we have to
// check if it has all 5 vowels then we will check if it does not have any consonant
public class VowelSubString {
    public static int vowelsubstring(String s) {
        // Write your code here

        char [] arr = s.toCharArray();
        int count = 0;

        for(int i=0;i<=s.length()-5;i++){

            int j =i;

            while (j<arr.length &&
                    (arr[j]=='a' || arr[j]=='e' ||  arr[j]=='i' ||  arr[j]=='o'  ||  arr[j]=='u'
                    ||  arr[j]=='A' || arr[j]=='E' ||  arr[j]=='I' ||  arr[j]=='O'  ||  arr[j]=='U'
                    )){
                j++;
            }
            int k=i;
             int cou=0;
            while ((j-k+cou)<s.length() &&  (j-k+cou)>=5) {
                String s1 = s.substring(k+cou, j);
                String s2 = s.substring(k,j-cou);
                String s3 =  s.substring(k+cou,j-cou);


                if ((s1.contains("a") || s1.contains("A")) &&
                        (s1.contains("e") || s1.contains("E"))
                    && (s1.contains("i") || s1.contains("I")) &&
                        (s1.contains("o") || s1.contains("O")) &&
                        (s1.contains("u")|| s1.contains("U"))) {

                    count++;
                  //  i=i+j;
                } if(cou>0) {
                    if ((s2.contains("a") || s2.contains("A")) &&
                            (s2.contains("e") || s2.contains("E"))
                            && (s2.contains("i") || s2.contains("I")) &&
                            (s2.contains("o") || s2.contains("O")) &&
                            (s2.contains("u") || s2.contains("U"))) {

                        count++;
                        //  i=i+j;
                    }

                    if ((s3.contains("a") || s3.contains("A")) &&
                            (s3.contains("e") || s3.contains("E"))
                            && (s3.contains("i") || s3.contains("I")) &&
                            (s3.contains("o") || s3.contains("O")) &&
                            (s3.contains("u") || s3.contains("U"))) {

                        count++;

                        if(j>i)
                         i=i+j;
                    }
                }
               // k++;
                cou++;
            }


        }
        return count;
    }

    public static void main(String [] args){
        String str = "axyzaeiou";
        System.out.println(vowelsubstring(str));
    }
}

