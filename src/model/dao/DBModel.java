package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import model.Model;

public class DBModel implements Model {

    private Connection con;
    // access to the database access credentials.
    private final ResourceBundle config = 
        ResourceBundle.getBundle("resources.database_access");

    // store the credentials in local Strings.
    private final String 
        url = config.getString("URL"),
        user = config.getString("USER"),
        pass = config.getString("PASSWORD"),
        table = config.getString("TABLE"),
        column = config.getString("COLUMN");

    private void openConnection() {
        con = null;
        try {
            con = DriverManager
                .getConnection(url, user, pass);
        } catch (SQLException sqle) {
            // TODO: throw the exception.
        }
    }

    private void closeConnection() {
        try {
            con.close();
        } catch (SQLException sqle) {
            // TODO: handle exception.
        }
    }

    @Override
    public String getGreeting() {
        String greet = null;
        ResultSet rs;
        openConnection();
        try {
            rs = con
            .prepareStatement("select * from " + table + ";")
            .executeQuery();
            // do not forget to check the ResultSet
                if (rs.next())
                    greet = rs
                    .getString(column);
        } catch (SQLException sqle) {
            // TODO: handle exception
        }
        closeConnection();
        return greet;
    }
}