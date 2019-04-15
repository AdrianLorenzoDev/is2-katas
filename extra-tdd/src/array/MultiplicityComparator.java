package array;

import java.util.Arrays;

import static java.lang.Math.pow;

public class MultiplicityComparator {
    public static boolean compareMultiplicities(int[] baseArray, int[] powerArray) {
        Arrays.sort(baseArray);
        Arrays.sort(powerArray);
        return (baseArray.length != powerArray.length) ? false : comparePower(baseArray, powerArray, 2);

    }

    public static boolean comparePower(int[] baseArray, int[] powerArray, int power) {
        for (int i = 0; i < powerArray.length; i++) {
            if (pow(baseArray[i], 2) != powerArray[i]) {
                return false;
            }
        }
        return true;
    }


}
