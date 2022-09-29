package view.wo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import view.View;

public class JFXView extends Application implements View {

    /*
    *Setup the Scene for the greeting to appear
     */
    public void start(Stage primaryStage) {
        String parameter;
        parameter = getParameters().getRaw().get(0);
        Text text = new Text(parameter);

        StackPane root = new StackPane();
        root.getChildren().add(text);

        Scene scene = new Scene(root, 800, 600);

        primaryStage.setTitle(parameter);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /*
    *Launch the JavaFX 
     */
    @Override
    public void showGreeting(String greeting) {
        try {
            launch(greeting);
        } catch (Exception e) {
            // TODO: do stuff.
        }
    }
}
