import org.junit.Test;


import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class KataTest {

    @Test
    public void test1(){
        haveSameMultiplicity(
                new int[]{121, 144, 19, 161, 19, 144, 19, 11},
                new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361});
        haveDifferentMultiplicity(
                new int[]{121, 144, 19, 161, 19, 144, 19, 11},
                new int[]{234, 0, 23, 361, 25921, 361, 20736, 361});
        haveSameMultiplicity(
                new int[]{121, 144, 19, 161, 19, 144, 19, 11},
                new int[]{121, 361, 20736, 14641, 25921, 361, 20736, 361});
    }

    @Test
    public void test2() {
        haveSameMultiplicity(
                new int[]{},
                new int[]{});
        haveSameMultiplicity(
                new int[]{2},
                new int[]{4});
        haveSameMultiplicity(
                new int[]{2,3},
                new int[]{4,9});
        haveSameMultiplicity(
                new int[]{2,3},
                new int[]{9,4});
    }

    @Test
    public void test3() {
        haveDifferentMultiplicity(
                new int[]{1},
                new int[]{});
        haveDifferentMultiplicity(
                new int[]{2},
                new int[]{2});
        haveDifferentMultiplicity(
                new int[]{2,3},
                new int[]{8,4});
        haveDifferentMultiplicity(
                new int[]{2,2,3},
                new int[]{4,9,9});
    }


    public void haveSameMultiplicity(int[] array1, int[] array2) {
        assertTrue(array.MultiplicityComparator.compareMultiplicities(array1, array2));
    }


    public void haveDifferentMultiplicity(int[] array1, int[] array2) {
        assertFalse(array.MultiplicityComparator.compareMultiplicities(array1, array2));
    }


}
