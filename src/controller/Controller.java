package controller;

import model.ModelFactory;
import view.ViewFactory;

public class Controller {
    
    public static void run() {
        String greet = 
            ModelFactory
            .getAccess()
                .getGreeting();
       ViewFactory
            .getAccess()
                .showGreeting(greet);
    }
}
