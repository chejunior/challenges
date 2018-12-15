package codility.test01;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CodilityTwoTest {
    
    private Cod sol = new Cod();
    @Test
    public void shouldWorkExampleA() {
        ArrayList A = new ArrayList();
        A.add(7);
        A.add(8);
        A.add(6);
        A.add(5);
        
        
        ArrayList b = new ArrayList();
        b.add(1);
        b.add(2);
        b.add(3);
        List solution = sol.rearrange(A);
        assertEquals(b, solution);
    }
    
}

