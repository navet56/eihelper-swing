package view.content;

import view.components.ChatMessage;
import view.components.ImageComponent;
import view.components.SettingComponent;

import javax.swing.*;
import java.awt.*;

/**
 * Settings JPanel
 */
public class Settings extends JPanel {
    public Settings() {
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        this.add(new SettingComponent("Compte", "/view/images/login_icon.png"));
        this.add(new SettingComponent("Apparence", "/view/images/image_icon.png"));
        this.add(new SettingComponent("Aide", "/view/images/help_icon.png"));
    }
}
