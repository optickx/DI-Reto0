/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.ResourceBundle;
import org.junit.Test;
import static org.junit.Assert.*;

/**@author Dani y Roke
 */
public class FileModelTest {
    
    private final FileModel fileModel = new FileModel();
    private final String greet = 
            ResourceBundle
                .getBundle("resources.greet")
                    .getString("GREET");
    
    /**
     * Test of getGreeting method, of class FileModel.
     */
    @Test
    public void testGetGreeting() {
        String result = fileModel.getGreeting();
        assertEquals(greet, result);
        
        System.out.println(greet);
    }
    
}
