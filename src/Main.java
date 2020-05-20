import controller.AppController;
import model.AppModel;
import view.AppView;

import javax.swing.*;

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
        SwingUtilities.invokeLater(() -> initApp());
    }

    private static void initApp(){
        AppModel appModel = new AppModel();
        AppController appController = new AppController(appModel);
        AppView appView = new AppView(appController);
        appModel.addObserver(appView);
        appView.setVisible(true);
    }
}
