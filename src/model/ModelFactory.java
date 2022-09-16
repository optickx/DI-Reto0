package model;

import java.util.ResourceBundle;

import model.dao.*;

public class ModelFactory {

    // choose system from file. 
        ;
    private static final String system 
        = ResourceBundle
                .getBundle("resources.configuration")
                    .getString("SYSTEM")
                        .toUpperCase();

    public static Model getAccess() {
        if (system.contains("DATABASE"))
            return new DBModel();
        if (system.contains("FILE"))
            return new FileModel();
        return null;
            
              //throw ModelTypeNotAllowed();
        // TODO: exception? acabar clase
    }
    
}