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
public class liczbyTest {
    
    private liczby numb = new liczby();
    int [] przod = new int[] {1,2,3,4,5,6};
    int[] srodek = new int[] {3,2,7,5,1,2,3,76,87,88,87};
    int [] koniec = new int [] {15,112,33,76,87,44,1,2,3};
    int [] czesc = new int[] {16,34,2,55,1,2,6};
    int [] pusta = new int[]{};
    int [] brak = new int[] {8,23,15,4,3,8,54};
    @Test
    public void test1() {
         assertTrue(numb.sekwencja(przod));
    }
     @Test
    public void test2() {
         assertTrue(numb.sekwencja(srodek));
    }
     @Test
    public void test3() {
         assertTrue(numb.sekwencja(koniec));
    }
     @Test
    public void test4() {
         assertFalse(numb.sekwencja(czesc));
    }
     @Test
    public void test5() {
         assertFalse(numb.sekwencja(pusta));
    }
    @Test
    public void test6() {
         assertFalse(numb.sekwencja(brak));
    }
    
}
