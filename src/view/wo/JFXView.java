package view.wo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import view.View;


public class JFXView extends Application implements View {

    public void start(Stage primaryStage) {
        String parameter;
        parameter = getParameters().getRaw().get(0);
        Text text = new Text(parameter);

        StackPane root = new StackPane();
        root.getChildren().add(text);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle(parameter);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void showGreeting(String greeting) throws ExceptionManager {
        launch(greeting);
    }
}