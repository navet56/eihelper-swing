package view;

import controller.AppController;
import model.AppModel;
import utils.observer.Observer;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.BorderLayout;

/**
 * The type App view.
 */
public class AppView extends JFrame implements Observer<AppView, AppModel> {
    private final AppController appController;
    private final Content content;
    private final MenuBar menuBar;

    /**
     * Instantiates a new App view.
     *
     * @param appController the app controller
     */
    public AppView(AppController appController) {
        this.appController = appController;

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(1280, 800);
        this.setResizable(false);
        this.getContentPane().setLayout(new BorderLayout());

        this.menuBar = new MenuBar(this.appController);
        this.content = new Content();

        this.add(this.menuBar, BorderLayout.SOUTH);
    }

    /**
     * Update the whole state of the view. Generally used when big changes occurs or when the view starts to observe the model.
     */
    @Override
    public void updateEverything(AppModel observable) {
        this.content.switchPage(observable.getActualPage());

        this.revalidate();
        this.repaint();
    }
}
