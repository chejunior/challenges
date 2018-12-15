package class02.arrays.oddoccurrences;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SolutionOddOccurrencesInArrayTest {
 private SolutionOddOccurrencesInArray odd = new SolutionOddOccurrencesInArray();
    
    @Test
    public void shouldWorkExampleA() {
        int[] A = {9, 3, 9, 3, 9, 7, 9};
        int expected = 7;
        int solution = odd.solution(A);
        assertEquals(expected, solution);
    }

}
