package model.dao;

import static org.junit.Assert.assertEquals;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**@author Roke y Dani
 */

public class DBModelTest {
    
    private final DBModel dbModel = new DBModel();
    private final String GREET = getDatabaseChain();

    @Before
    public void setUp() {
        dbModel.openConnection();
        System.out.println(GREET);
        try {
            dbModel.con
                .prepareStatement(
                "UPDATE " + dbModel.table +
                " SET " + dbModel.column + "= '" + GREET + "';")
                    .executeUpdate();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }
    
    @After
    public void tearDown() {
        dbModel.closeConnection();
    }

    /**Obtains actual chain from the database,
     * so that the value is not modified.
     */
    public String getDatabaseChain() {
        try {
            ResultSet rs = dbModel.con
                .prepareStatement(
                "SELECT * FROM " + dbModel.table + ";")
                    .executeQuery();
            if (rs.next())
                return rs.getString(dbModel.column);
            
        } catch (SQLException sqle) {
            // TODO: handle exception
            sqle.printStackTrace();
        }
        return null;
    }

    /**
     * Test of getGreeting method, of class DBModel.
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