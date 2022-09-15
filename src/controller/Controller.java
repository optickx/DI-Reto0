package controller;

import model.ModelFactory;

public class Controller {
    
    public static void run() {
        String greet = 
            ModelFactory
            .getAccess()
                .getGreeting();

        System.out.println(greet);
    }
}
