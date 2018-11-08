package Flipkart;

/**
 * Created by i318862 on 10/02/18.
 */
public class WordWrap {

    public static int[][] costTable(int [] arr,int width){
        int n=arr.length;
        int count[][]=new int[n][n];

        for(int i=0;i<n;i++){
            int tempSize=arr[i];
            for(int j=i;j<n;j++){
                if(j==i){

                }else{
                    tempSize=tempSize+arr[j]+1;
                }
                if(tempSize>width){
                    count[i][j]=-1;
                    break;
                }else {
                    count[i][j]=(width-tempSize)*(width-tempSize);
                }

            }
        }
        return count;
    }

    public static void optimiseCost(int [][]count,int n ){
        int [] cost= new int[n+1];
        int [] wordBreak=new int[n+1];

        for(int i=n-1;i>=0;i--){
            for(int j=n-1;j>=i;j--){
                if(count[i][j]>0){
                    if((count[i][j] + cost[j+1])<cost[i] || cost[i]==0) {
                        cost[i] = count[i][j] + cost[j+1];
                        wordBreak[i] = j + 1;
                    }
                }
            }
        }
        System.out.print("");
    }

    public static void main(String [] args){
        int [] arr={6,3,5,2,4};
       int count[][]= costTable(arr,10);
        optimiseCost(count,5);
        System.out.println();
    }
}
