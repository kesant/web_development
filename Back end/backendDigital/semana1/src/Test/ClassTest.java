package Test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClassTest {
    @Test
    void testearQueseanIguales(){
        int numero1=1;
        int numero2=2;
        assertEquals(numero1,numero2);
        assertNotEquals(numero1,numero2);
    }
    @Test
    void testeasVerdaderoOFalso(){
        assertTrue(7<9);
        assertFalse(9>7);
    }

}
