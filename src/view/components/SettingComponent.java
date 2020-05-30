package view.components;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;

/**
 * The type Setting component.
 */
public class SettingComponent extends JPanel {
    /**
     * SettingComponent constructor
     *
     * @param title     title of the setting component like "Login"
     * @param imagePath the image path like "view/images/test_image.png"
     */
    public SettingComponent(String title, String imagePath) {
        this.setMaximumSize(new Dimension(580, 100));
        this.setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
        this.add(new ImageComponent(imagePath, 60, 60).getAsLabel());
        this.add(Box.createRigidArea(new Dimension(30, 0)));
        this.add(new JLabel("<html><h1>" + title + "</h1></html>"));

        this.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(100, 0, 200)));
    }
}
