package model.dao;

import java.util.ResourceBundle;

import model.Model;

public class FileModel implements Model {

    // access to the configuration file.
    private ResourceBundle file = 
        ResourceBundle
            .getBundle("resources.greet");

    @Override
    public String getGreeting() {
        try {
            return file.getString("GREET");
        } catch (Exception e) {
            return null;
        }
    }
}