package view;

import java.util.ResourceBundle;
import view.wo.*;

public class ViewFactory {

    /*
    *Obtains the way the app is gonna show the information (Text,Graphic(Swing),JavaFX)
     */
    private static final String viewmode
            = ResourceBundle
                    .getBundle("resources.configuration")
                    .getString("VIEWMODE")
                    .toUpperCase();

    /*
    *Checks the way the app is gonna be executed
     */
    public static View getView() {
        if (viewmode.contains("GRAPHIC")) {
            return new GraphicView();
        }
        if (viewmode.contains("TEXT")) {
            return new TextView();
        }
        if (viewmode.contains("JAVAFX")) {
            return new JFXView();
        }
        return null;
        // TODO: exception?
    }
}
