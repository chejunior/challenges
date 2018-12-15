package codility.test01;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class CodilityTest {
    
    private Sol sol = new Sol();
    @Test
    public void shouldWorkExampleA() {
        String A = "xy";
        String expected = "yx";
        String solution = sol.solution(A);
        assertEquals(expected, solution);
    }
    
    @Test
    public void shouldWorkExampleD() {
        String A = "pp";
        String expected = "no answer";
        String solution = sol.solution(A);
        assertEquals(expected, solution);
    }
    
    @Test
    public void shouldWorkExampleC() {
        String A = "hefg";
        String expected = "hegf";
        String solution = sol.solution(A);
        assertEquals(expected, solution);
    }
}
