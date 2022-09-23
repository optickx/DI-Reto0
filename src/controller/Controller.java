package controller;

import model.Model;
import view.View;

public class Controller {
    /**@param pModel is a Model interface.
     * @param pView is a View interface.
     */
    public void run(Model pModel, View pView) {
        String greet = 
            pModel
                .getGreeting();
            pView
                .showGreeting(greet);
    }
}