package view;

import java.util.ResourceBundle;
import view.wo.GraphicView;
import view.wo.TextView;

public class ViewFactory {
        private static final String viewmode 
        = ResourceBundle
                .getBundle("resources.configuration")
                    .getString("VIEWMODE")
                        .toUpperCase();

    public static View getAccess() {
        if (viewmode.contains("GRAPHIC"))
            return new GraphicView();
        if (viewmode.contains("TEXT"))
            return new TextView();
        return null;
        // TODO: exception?
    }
}
