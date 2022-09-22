package app;

import controller.Controller;
import model.ModelFactory;
import view.ViewFactory;

public class Application {
    public static void main(String[] args) {        
        new Controller().run(
            ModelFactory
                .getModel(), 
            ViewFactory
                .getView());
    }
}