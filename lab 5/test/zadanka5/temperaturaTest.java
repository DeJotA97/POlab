
package zadanka5;

import org.junit.Test;
import static org.junit.Assert.*;


public class temperaturaTest {
    
    public temperaturaTest() {
    }

    private temperatura tmp =new temperatura(); 
    @Test
    public void test1() {
         assertTrue(tmp.porownaj(289,165));
    }
     @Test
    public void test2() {
         assertTrue(tmp.porownaj(198,25));
    }
     @Test
    public void test3() {
         assertTrue(tmp.porownaj(67,165));
    }
     @Test
    public void test4() {
         assertFalse(tmp.porownaj(18,81));
    }
     @Test
    public void test5() {
         assertFalse(tmp.porownaj(100,100));
    }
    @Test
    public void test6() {
         assertFalse(tmp.porownaj(100,57));
    }
     @Test
    public void test7() {
         assertTrue(tmp.porownaj(100,189));
    }
    @Test
    public void test8() {
         assertFalse(tmp.porownaj(18,100));
    }
     @Test
    public void test9() {
         assertTrue(tmp.porownaj(135,100));
    }
    
}
