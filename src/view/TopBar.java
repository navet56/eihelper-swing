package view;

import controller.AppController;
import model.MenuPage;
import view.components.ImageComponent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

/**
 * The type Menu bar.
 */
public class TopBar extends JPanel {
    private final JLabel pageName;

    /**
     * Instantiates a new Menu bar.
     *
     * @param appController the app controller
     */
    public TopBar(AppController appController) {
        this.setLayout(new BorderLayout());

        JButton backButton = new ImageComponent("/view/images/back_icon.png").getAsButton();
        this.pageName = new JLabel();
        this.pageName.setForeground(new Color(190, 0, 255));
        JButton settingsButton = new ImageComponent("/view/images/settings_black_icon.png").getAsButton();

        backButton.addActionListener(appController.getPreviousPageListener());
        settingsButton.addActionListener(appController.getSettingsListener());

        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(Color.WHITE);
        leftPanel.add(backButton);
        leftPanel.add(this.pageName);

        this.setBackground(Color.WHITE);

        this.add(leftPanel, BorderLayout.WEST);
        this.add(settingsButton, BorderLayout.EAST);
    }

    public void updatePage(MenuPage menuPage) {
        this.pageName.setText("<html><h1>" + menuPage.name() + "</h1></html>");
    }
}
