package model;

import java.util.ResourceBundle;

import model.dao.*;

public class ModelFactory {

    // choose system from file. 
        ;
    private static final String datamode 
        = ResourceBundle
                .getBundle("resources.configuration")
                    .getString("DATAMODE")
                        .toUpperCase();

    public static Model getModel() {
        if (datamode.contains("DATABASE"))
            return new DBModel();
        if (datamode.contains("FILE"))
            return new FileModel();
        return null;
        // TODO: exception?
    }
    
}