package model.dao;

import java.util.ResourceBundle;

import model.Model;

public class FileModel implements Model {

    // access to the configuration file.
    protected ResourceBundle file = 
        ResourceBundle.getBundle("resources.greet");
    private String greetToString 
        = file.getString("GREET");

    @Override
    public String getGreeting() {
        return greetToString;
    }
}
