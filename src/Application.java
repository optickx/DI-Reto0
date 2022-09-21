import controller.Controller;
import model.Model;
import model.ModelFactory;
import view.View;
import view.ViewFactory;

public class Application {
    public static void main(String[] args) {
        Model m = ModelFactory.getAccess();
        View v = ViewFactory.getAccess();
        
        new Controller().run(m, v);
    }
}