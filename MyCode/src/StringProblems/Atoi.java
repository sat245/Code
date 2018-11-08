package StringProblems;

/**
 * Created by i318862 on 09/12/17.
 */
public class Atoi {
    public static void main(String [] args){
        System.out.println(atoi("-54332872018247709407"));
    }

    public static int atoi(final String a) {
        char [] arr = a.toCharArray();
        String str = "";int a1=0;boolean flag=true;int sign=1;
        if(arr[0]=='+' && ((int)arr[1]>=48 && (int)arr[1]<=57)){
            arr[0]='0';
        }
        if(arr[0]=='-' && ((int)arr[1]>=48 && (int)arr[1]<=57)){
            arr[0]='0';
            sign=-1;
        }

        for(int i=0;i<arr.length;i++){
            if(str=="" && ((int)arr[i]<48 || (int)arr[i]>57)){
                return 0;
            }
            if((int)arr[i]>=48 && (int)arr[i]<=57 && flag){
                str=str+arr[i];
            }else {
                flag=false;
            }
        }
        try{
            a1=Integer.parseInt(str)*sign;
        }catch (NumberFormatException e){
            if(sign>0)
            return Integer.MAX_VALUE;
            return Integer.MIN_VALUE;
        }
        return a1;
    }
}
