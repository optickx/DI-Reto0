package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.*;
import static org.junit.Assert.assertEquals;

/**@author Roke y Dani
 */

public class DBModelTest {
    
    private final DBModel dbModel = new DBModel();
    private String GREET;

    /**Obtains actual chain from the database,
     * so that the value is not modified.
     */
    @Before
    public void setUp() {
        dbModel.openConnection();
        try {
            ResultSet rs = dbModel.con
                .prepareStatement(
                "SELECT * FROM " + dbModel.table + ";")
                    .executeQuery();
            if (rs.next())
                GREET = rs.getString(dbModel.column);
            
        } catch (SQLException sqle) {
            // TODO: handle exception
            sqle.printStackTrace();
        }
    }
    
    @After
    public void tearDown() {
        dbModel.closeConnection();
    }

    /**Test of getGreeting method, of class DBModel.
     */
    @Test
    public void testGetGreeting() {
        String result = dbModel.getGreeting();
        assertEquals(
            GREET, 
            result);

        System.out.println(result);
    }
}