public class ForTest {

    private static int[][] res;

    private static void populate(int i, int j) {
        if(j == 0 || j == i) {
            res[i][j] = 1;
        } else {
            res[i][j] = res[i-1][j] + res[i-1][j-1];
        }
    }

    public static  int[][] generate(int n) {

        res = new int[n][];

        for(int i = 0; i < res.length; i++) {
            res[i] = new int[i+1];
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                populate(i,j);
            }

        }

        return res;
    }

    public static void main(String [] args) {
        int [][] aa = generate(3);
        for(int i = 0;i<3;i++ ){
            for(int j=0;j<3;j++) {
                System.out.print(" "+aa[i][j]);
            }
            System.out.println();
        }

    }
}
