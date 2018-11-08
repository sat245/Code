import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import static javafx.scene.input.KeyCode.T;

/**
 * Created by i318862 on 29/10/17.
 */
public class MaximumTipCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 0, n = 0;
        if (sc.hasNext()) {
            t = sc.nextInt();
        }
        while (t > 0) {
            t--;
            if (sc.hasNext()) {
                n = sc.nextInt();
            }
            int[] a = new int[n];
            int[] b = new int[n];
            if (n > 0) {
                int x = 0, y = 0;
                if (sc.hasNext()) {
                    x = sc.nextInt();
                }
                if (sc.hasNext()) {
                    y = sc.nextInt();
                }

                for (int i = 0; i < n; i++) {
                    if (sc.hasNext()) {
                        a[i] = sc.nextInt();
                    }
                }
                for (int i = 0; i < n; i++) {
                    if (sc.hasNext()) {
                        b[i] = sc.nextInt();
                    }
                }
                fn(a, b, n, x, y);
            } else {
                System.out.println(0);
            }
        }
    }

    private static void fn(int[] a, int[] b, int n, int x, int y) {

        int sum = 0, ai = 0, bi = 0;
        a1bc[] max = new a1bc[n];
        int maxLast = 0;

        for (int i = 0; i < n; i++) {
            a1bc obj = new a1bc();
            obj.index = i;
            obj.value = Math.abs(a[i] - b[i]);
            max[i] = obj;
        }

        Collections.sort(new ArrayList<a1bc>(Arrays.asList(max)), new Comparator<a1bc>() {
            @Override
            public int compare(a1bc o1, a1bc o2) {
                return o1.value - o2.value;
            }
        });

        for (int i = 0; i < n; i++) {
            int index = max[i].index;
            if (a[index] > b[index] ) {
                if (ai <= x) {
                    sum = sum + a[index];
                    ai++;
                } else {
                    sum = sum + b[index];
                    bi++;
                }
            } else if (b[index] > a[index] ){
                if (bi <= y) {
                    sum = sum + b[index];
                    bi++;
                } else {
                    sum = sum + a[index];
                    ai++;
                }
            } else {
                if ( ai > bi ) {
                    sum = sum + b[index];
                    bi++;
                } else {
                    sum = sum + a[index];
                    ai++;
                }
            }
        }
        System.out.println(sum);

    }

}

class a1bc {
    int index;
    int value;

    a1bc() {

    }

    public a1bc(int index, int value) {
        this.index = index;
        this.value = value;
    }

}




