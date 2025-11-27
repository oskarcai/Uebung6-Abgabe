package h2;

public class H2_main {

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 4};
        int[] c = {1, 3, 2};
        int[] d = {1, 2};
        int[] e = {1, 2, 3};

        int[][] allArrays = {a, b, c, d, e};
        char[] array_names = {'a', 'b', 'c', 'c', 'e'};

        for(int y = 0; y < allArrays.length; y++) {
            for(int z = 0; z < allArrays.length; z++) {
                System.out.println("Array " + array_names[y] + " und Array " + array_names[z]
                        + " sind gleich? " + compareArrays(allArrays[y], allArrays[z]));
            }
        }
    }

    public static boolean compareArrays(int[] a, int[] b) {
        if(a.length == b.length) {

            for(int i = 0; i < a.length; i++) {
                if(a[i] != b[i]) {
                    return false;
                }
            }
            return true;

        } else {
            return false;
        }
    }

}
