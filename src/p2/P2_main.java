package p2;

public class P2_main {

    public static void main(String[] args) {
        int[] testArray = {1,2,3,4};

        System.out.println("Ist das Array paarweise verschieden? "
                            + pairwiseDifferent(testArray));
    }

    public static boolean pairwiseDifferent(int[] someNumbers) {
        for (int i = 0; i < someNumbers.length; i++) {
            for (int j = i + 1; j < someNumbers.length; j++) {

                System.out.println("Vergleiche Index ["+i+"] = "+someNumbers[i]+" mit Index ["+j+"] = "+someNumbers[j]+":");

                if (someNumbers[i] == someNumbers[j]) {

                    System.out.println("Duplikat -> nicht paarweise verschieden!");

                    return false;
                }
            }
        }

        System.out.println("Kein Duplikat -> alle paarweise verschieden!");

        return true;
    }
}

