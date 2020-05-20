package view;

import controller.AppController;
import view.components.ImageComponent;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.*;

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
        JButton mapButton = new ImageComponent("/view/images/place_icon.png").getAsButton();
        JButton planningButton = new ImageComponent("/view/images/agenda_icon.png").getAsButton();
        JButton chatButton = new ImageComponent("/view/images/chat_icon.png").getAsButton();
        JButton trainingButton = new ImageComponent("/view/images/cam_icon.png").getAsButton();

        mapButton.addActionListener(appController.getMapListener());
        planningButton.addActionListener(appController.getPlanningListener());
        chatButton.addActionListener(appController.getChatListener());
        trainingButton.addActionListener(appController.getTrainingListener());

        this.setBackground(new Color(100,12,255));
        this.add(mapButton);
        this.add(planningButton);
        this.add(chatButton);
        this.add(trainingButton);
    }
}
