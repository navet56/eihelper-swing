package view.components;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
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
        this.setMaximumSize(new Dimension(580,100));
        this.setLayout(new BorderLayout());
        this.add(new ImageComponent(imagePath, 60, 60).getAsLabel(), BorderLayout.WEST);

        this.add(new JLabel("<html><h1> &nbsp &nbsp &nbsp " + title + "</h1></html>"), BorderLayout.CENTER);

        this.setBorder(BorderFactory.createMatteBorder(0,0,1,0, new Color(100,0,200)));
    }
}
