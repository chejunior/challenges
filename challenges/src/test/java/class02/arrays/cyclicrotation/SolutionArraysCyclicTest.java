package class02.arrays.cyclicrotation;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class SolutionArraysCyclicTest {
    
    private SolutionCyclicRotation cyclic = new SolutionCyclicRotation();
    
    @Test
    public void shouldWorkExampleA() {
        int[] A = {3, 8, 9, 7, 6};
        int[] expected = {9, 7, 6, 3, 8};
        int[] solution = cyclic.solution(A, 3);
        assertEquals(Arrays.toString(expected), Arrays.toString(solution));
    }
    
    @Test
    public void shouldWorkExampleB() {
        int[] A = {0, 0, 0};
        int[] expected = {0, 0, 0};
        int[] solution = cyclic.solution(A, 1);
        assertEquals(Arrays.toString(expected), Arrays.toString(solution));
    }
    
    @Test
    public void shouldWorkExampleC() {
        int[] A = {1, 2, 3, 4};
        int[] expected = {1, 2, 3, 4};
        int[] solution = cyclic.solution(A, 4);
        assertEquals(Arrays.toString(expected), Arrays.toString(solution));
    }

}
