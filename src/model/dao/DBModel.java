package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.mysql.cj.protocol.SocksProxySocketFactory;

import model.Model;

public class DBModel implements Model {

    private Connection con;
    // access to the database access credentials.
    private final ResourceBundle config = 
        ResourceBundle
            .getBundle("resources.database_access");

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
        ResultSet rs;
        String greet = null;
        openConnection();
        try {
            rs = con
                .prepareStatement("select * from " + table + ";")
                    .executeQuery();
            // do not forget to check the ResultSet
            System.out.println(rs.getMetaData());
            if (rs.next())
                greet = rs.getString(column);
            closeConnection();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        return greet;
    }
}