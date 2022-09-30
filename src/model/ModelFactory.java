package model;

import java.util.ResourceBundle;

import model.dao.*;

public class ModelFactory {

    /**obtains view system (Database,File)
     */
    private static final String datamode
            = ResourceBundle
                    .getBundle("resources.configuration")
                    .getString("DATAMODE")
                    .toUpperCase();

    /**@return instanced interface
     */
    public static Model getModel() {
        if (datamode.contains("DATABASE")) {
            return new DBModel();
        }
        if (datamode.contains("FILE")) {
            return new FileModel();
        }
        return null;
    }
}
