/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplesofnumbers;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author maria
 */
public class CalculateTest {
    
    public CalculateTest() {
    }

    @Test
    public void testSomeMethod() {
        
         Calculate calculate = new Calculate();
        calculate.calculateMultiples(2,10); 
    }
    
}
