package h3;

import java.util.Arrays;

public class H3_main {

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 4};
        int[] c = {1, 3, 2};
        int[] d = {1, 2};
        int[] e = {1, 2, 3};
        int[] f = {1, 1, 2};

        int[][] allArrays = {a, b, c, d, e ,f};
        char[] array_names = {'a', 'b', 'c', 'd', 'e', 'f'}; // statt char[] auch String[] möglich

        for(int y = 0; y < allArrays.length; y++) {
            for(int z = 0; z < allArrays.length; z++) {
                System.out.println("Array " + array_names[y] + " und Array " + array_names[z]
                                    + " sind gleich? " + compareArraysVal(allArrays[y], allArrays[z]));
            }
        }
    }

    public static boolean compareArraysVal(int[] a, int[] b) {
        int counterA = 0;
        int counterB = 0;

        if (a.length == b.length) {

            for (int i = 0; i < a.length; i++) {

                for (int j = 0; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        counterA++;
                    }
                }

                for (int k = 0; k < a.length; k++) {
                    if (a[i] == b[k]) {
                        counterB++;
                    }
                }

                if (counterA != counterB) {
                    return false;
                }

            }
            return true;

        } else {
            return false;
        }
    }

}


