package view.wo;
import view.View;

public class TextView implements View{

    @Override
    public void showGreeting(String greeting) {
        System.out.println(greeting);
    }
    
}
