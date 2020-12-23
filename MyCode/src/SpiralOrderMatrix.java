/**
 * Created by satyam mishra, Data Structure on 01/11/17.
 */
public class SpiralOrderMatrix {

    public static void generateMatrix(int a) {
        int n=a;
        double len = 0.0;
        int [][] arr = new int[a][a];
        int i=0,j=0,k=0,count=1;
            if(a%2==0) {
                len = a/2;
            }
                else {
                len = (a/2) +1;
            }

            for(k=0;k<len;k++) {
                i=k;
                j=k;
                while(j<a) {
                    arr[i][j]=count++;
                    j++;
                }
                j=a-1;
                i++;
                while(i<a) {
                    arr[i][j]=count++;
                    i++;
                }
                i--;
                j--;
                while(j>=k) {
                    arr[i][j]=count++;
                    j--;

                }
                j=k;
                i--;

                while(i>k) {
                    arr[i][j]=count++;
                    i--;

                }

                i++;
                a--;
            }

        for( i =0;i<n;i++) {
            for(j=0;j<n;j++) {
                System.out.print(" " +arr[i][j]);
            }

            System.out.println("");
        }


    }

    public static void main(String [] args) {
        generateMatrix(80);
    }



}
