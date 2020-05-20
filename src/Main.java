import controller.AppController;
import model.AppModel;
import view.AppView;

/**
 * The type Main.
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        AppModel appModel = new AppModel();
        AppController appController = new AppController(appModel);
        AppView appView = new AppView(appController);
        appView.setVisible(true);
        appModel.addObserver(appView);
    }
}
