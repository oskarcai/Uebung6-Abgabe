package p1;

public class P1_main {

    public static void main(String[] args) {
        int a = 8;
        System.out.println("Zahl " + a + " wird inkrementiert und quadriert: ("
                            + a + "+1)² = " + squared(a));
    }

    public static int squared(int zahl) {
        return (zahl + 1) * (zahl + 1);
    }

}
