import java.util.Arrays;

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {-2,5,-7,8,-3};
        subsetSumProblem(numbers);
    }
    public static void subsetSumProblem(int[] set) {
        int[] subset = new int[set.length];
        Arrays.sort(set);
        if (set[set.length-1] <= 0 ||
           (set[0] >= 0)) {
            System.out.println("Não há subconjunto que somado resulte em zero.");
            return;
        }
        int pivot = set[set.length/2];
        if (pivot < 1) pivot = findFirstPositive(set);
        if (abs(set[0]) < set[set.length - 1]) {

        }
        for (int i = pivot; i < set.length - 1; i++) {

        }

        System.out.println(Arrays.toString(set));
    }
    public static int findFirstPositive(int[] set) {
        int aux = set.length / 2;
        while (set[aux] > 0) {
            aux += 1;
        }
        return aux;
    }
}