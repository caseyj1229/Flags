import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlagsTest {
    @Test
    void solution() {
        //Simple Input for Corrrectness
        int[] A = {1,5,3,4,3,4,1,2,3,4,6,2};
        assertEquals(3,Flags.solution(A));

        //Single Peak
        int[] B = {1,1,1,1,5,1,1,1,1};
        assertEquals(1,Flags.solution(B));

        //No Peaks
        int[] C = {4,5,6,7,8,9,10,11};
        assertEquals(0,Flags.solution(C));

        //No Peaks
        int[] D = {10,1,1,1,1,1,1,1,1,10};
        assertEquals(0,Flags.solution(D));

        //Simple check for flag distance rule
        int[] E = {3,1,3,7,3,7,1,1,1,1,1,1,1,1,1,45,4};
        assertEquals(2,Flags.solution(E));
    }
}