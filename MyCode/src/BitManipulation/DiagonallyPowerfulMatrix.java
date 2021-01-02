package BitManipulation;

import java.util.ArrayList;
// not complete
public class DiagonallyPowerfulMatrix {
    public int solve(ArrayList<ArrayList<Integer>> A) {
        if (A == null || A.size() == 0) {
            return 0;
        }
        int row = A.size();
        int col = A.get(0).size();
        int count = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int num = A.get(i).get(j);
                if (num < 2) {
                    A.get(i).add(j, 2);
                    count++;
                } else if (num > 2 && row > 1 && col > 1) {
                    if ((num & 2) != 2) {
                        count++;
                        num = (int) Math.floor(num / 2);
                    }
                }
            }
        }
        return count;
    }

}
