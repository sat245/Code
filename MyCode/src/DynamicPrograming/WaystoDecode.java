package DynamicPrograming;

public class WaystoDecode {
    public static int numDecodings(String A) {

        int count = 0;int x =0;
        //char [] arr = A.toCharArray();
        for (int  i =0;i<A.length();i++){
                if (Character.getNumericValue(A.charAt(i))==0 ){
                    A=A.substring(0,i);
                    continue;

                }
            if(count==0)count=1;
                if(i!=A.length()-1) {

                    int num = 10 * Character.getNumericValue(
                            A.charAt(i)) + Character
                            .getNumericValue(
                                    A.charAt(i + 1));
                    if (num <= 26) {
                        count *= 2;
                        x++;
                    } else {

                    }

                }
        }

        if (x>1){
            count=count-x-1;
        }


        if(A.length()>=1 && Character.getNumericValue(A.charAt(A.length()-1))==0){
            count/=2;
        }

        return
                count;
    }

    public static void main(String [] args){
        String s = "8";
        System.out.println(numDecodings(s));
    }
}
