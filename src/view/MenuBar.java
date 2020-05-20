package view;

import controller.AppController;
import view.components.ImageComponent;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridLayout;

/**
 * The type Menu bar.
 */
public class MenuBar extends JPanel {
    /**
     * Instantiates a new Menu bar.
     *
     * @param appController the app controller
     */
    public MenuBar(AppController appController) {
        this.setLayout(new GridLayout(1, 4));
        JButton mapButton = new ImageComponent("/view/images/map.png").getAsButton();
        JButton planningButton = new ImageComponent("/view/images/planning.png").getAsButton();
        JButton chatButton = new ImageComponent("/view/images/chat.png").getAsButton();
        JButton trainingButton = new ImageComponent("/view/images/training.png").getAsButton();

        mapButton.addActionListener(appController.getMapListener());
        planningButton.addActionListener(appController.getPlanningListener());
        chatButton.addActionListener(appController.getChatListener());
        trainingButton.addActionListener(appController.getTrainingListener());

        this.add(mapButton);
        this.add(planningButton);
        this.add(chatButton);
        this.add(trainingButton);
    }
}
