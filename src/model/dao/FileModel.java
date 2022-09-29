package model.dao;

import java.util.ResourceBundle;

import model.Model;

public class FileModel implements Model {

    /**
     * access to the configuration file to obtain the greet
     */
    protected ResourceBundle file
            = ResourceBundle.getBundle("resources.greet");
    private final String greetToString
            = file.getString("GREET");

    @Override
    public String getGreeting() {
        return greetToString;
    }
}
