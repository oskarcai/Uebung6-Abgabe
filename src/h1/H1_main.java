package h1;

public class H1_main {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {4, 3, 2, 1};
        int[] c = {2, 4, 6};
        int[] d = {6, 4, 9};

        int[][] allArrays = {a, b, c, d};
        char[] array_names = {'a', 'b', 'c', 'd'};

        for(int y = 0; y < allArrays.length; y++) {
            for(int z = 0; z < allArrays.length; z++) {
                System.out.println("Arrays " + array_names[y] + " und " + array_names[z]
                                    + " spiegelbildlich? " + istMirrorArray(allArrays[y], allArrays[z]) );
            }
        }
    }

    public static boolean istMirrorArray(int[] a, int[] b) {
        if (a.length == b.length) {

            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[b.length-1 - i]) {
                    return false;
                }
            }
            return true;

        } else {
            return false;
        }
    }

}