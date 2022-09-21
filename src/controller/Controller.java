package controller;

import model.Model;
import view.View;

public class Controller {
    public void run(Model pModel, View pView) {
        String greet = 
            pModel
                .getGreeting();
            pView
                .showGreeting(greet);
    }
}
