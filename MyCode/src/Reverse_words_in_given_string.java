/**
 * Created by satyam mishra, Data Structure on 27/07/17.
 */
public class Reverse_words_in_given_string {

    public static void main(String [] args) {
        String str = "  getting good at coding needs a lot of practice";
        if(str==null)return;
        String str1 ="";
        int length = str.length();

        for(int i = length-1;i>=0;i-- ) {       //==0 is required
            if(str.charAt(i)!=' ') {
                continue;
            } else {
                str1 = str1 + str.substring(i+1,length) + " ";
                length = i;
            }

        }
        str1 = str1+str.substring(0,length);
        System.out.println(str1);
        System.out.println(str1.equals("practice of lot a needs coding at good getting  "));
    }
}

//works also if starting is space