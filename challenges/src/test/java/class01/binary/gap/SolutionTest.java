package class01.binary.gap;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
    
    private Solution solution = new Solution();
    
    @Test
    public void shouldWorkWith1041() {
        int binaryGap = solution.solution(1041);
        assertEquals(5, binaryGap);
    }
    
    @Test
    public void shouldWorkWith15() {
        int binaryGap = solution.solution(15);
        assertEquals(0, binaryGap);
    }
    

}
