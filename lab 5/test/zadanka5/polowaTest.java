
package zadanka5;

import org.junit.Test;
import static org.junit.Assert.*;


public class polowaTest {
    
    polowa pol = new polowa();
    private String tekst = "Bardzo lubie lody";
    @Test
    public void test1() {
        assertEquals("Bardzo lu",pol.ciag(tekst));
    }
    
    @Test
    public void test2() {
        assertNotEquals("Bardzo",pol.ciag(tekst));
    }
    @Test
    public void test3() {
        assertNotEquals("Bardzo lubie lody",pol.ciag(tekst));
    }

    
   
    
}
