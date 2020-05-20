package view;

import controller.AppController;
import view.components.ImageComponent;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

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

        this.setBackground(new Color(255,255,255));

        this.add(settingsButton, BorderLayout.EAST);
        this.add(backButton, BorderLayout.WEST);
    }
}
