package view.content;

import view.components.SettingComponent;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

/**
 * Settings JPanel
 */
public class Settings extends JPanel {
    /**
     * Instantiates a new Settings.
     */
    public Settings() {
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        this.add(new SettingComponent("Compte", "/view/images/login_icon.png"));
        this.add(new SettingComponent("Apparence", "/view/images/image_icon.png"));
        this.add(new SettingComponent("Aide", "/view/images/help_icon.png"));
    }
}
