/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanka5;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hrabianka
 */
public class odwrotnaaTest {
    
    public odwrotnaaTest() {
    }

    public odwrotnaa odw = new odwrotnaa(); 
    int [] tab = new int [] {1,2,3,4,5};
    
    
    @Test
    public void test1() {
        assertEquals(odwrotnaa.odwroc(tab), "54321");
    }
    @Test
    public void test2() {
        assertNotEquals(odwrotnaa.odwroc(tab), "543");
    }
    @Test
    public void test3() {
        assertNotEquals(odwrotnaa.odwroc(tab), "1654298");
    }
    @Test
    public void test4() {
        assertNotEquals(odwrotnaa.odwroc(tab), "12345");
    }
    
    
}
