package view;

import controller.AppController;
import view.components.ImageComponent;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

/**
 * The type Menu bar.
 */
public class TopBar extends JPanel {
    /**
     * Instantiates a new Menu bar.
     *
     * @param appController the app controller
     */
    public TopBar(AppController appController) {
        this.setLayout(new BorderLayout());

        JButton settingsButton = new ImageComponent("/view/images/settings_black_icon.png").getAsButton();
        JButton backButton = new ImageComponent("/view/images/back_icon.png").getAsButton();

        settingsButton.addActionListener(appController.getSettingsListener());
        backButton.addActionListener(appController.getPreviousPageListener());

        this.setBackground(new Color(255,255,255));

        this.add(settingsButton, BorderLayout.EAST);
        this.add(backButton, BorderLayout.WEST);
    }
}
