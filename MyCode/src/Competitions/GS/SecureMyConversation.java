package Competitions.GS;

import java.util.Scanner;

public class SecureMyConversation {
    static String secureChannel(int operation, String message, String key) {
        if(message.length()==0){
            return "-1";
        }
        // what if key is 0
        if(key.length()<=0){
            return message;
        }
        String str ="";                int count = 0;

        //must check valid key property
        try {
            int a  = Integer.parseInt(key);
        }catch (IllegalArgumentException e){
            return "-1";
        }
        switch (operation) {
            case 1:{
                //encoding
                while (message.length()>count && key.length()>count){
                    char ch = message.charAt(count);
                    int loop = Character.getNumericValue(key.charAt(count));
                    while (loop>0){
                        loop--;
                        str = str+ch;
                    }
                    count++;
                }

                for(int i=count;i<message.length();i++){
                    str = str+message.charAt(i);
                }
                return str;
            }

            case 2:{
                int j=0;count=0;
                for(int i=0;i<message.length();){
                    str=str+message.charAt(i);
                    j=i;
                    if(count<key.length()) {
                        i=i+Character.getNumericValue(key.charAt(count));
                        count++;
                    }else {
                        i++;
                    }
                }

                return str;
            }

        }
        return "-1";
    }

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int op = scan.nextInt();
        String msg = scan.next();
        String key = scan.next();
        System.out.println(secureChannel(op,msg,key));
    }
}
