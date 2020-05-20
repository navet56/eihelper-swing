import controller.AppController;
import model.AppModel;
import view.AppView;

import javax.swing.*;

/**
 * Main class
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> initApp());
    }

    /**
     * Allows to start the app (Model init, Controller init and then JFrame init)
     */
    private static void initApp(){
        AppModel appModel = new AppModel();
        AppController appController = new AppController(appModel);
        AppView appView = new AppView(appController);
        appModel.addObserver(appView);
        appView.setVisible(true);
    }
}
