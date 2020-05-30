package view.components;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;

/**
 * The type Category component.
 */
public class CategoryComponent extends JPanel {
    /**
     * CategoryComponent constructor
     *
     * @param title title of the category like "Swimming"
     */
    public CategoryComponent(String title) {
        this.setMaximumSize(new Dimension(600, 70));
        this.setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));

        this.add(Box.createRigidArea(new Dimension(30, 0)));
        this.add(new JLabel(title));

        this.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, new Color(100, 0, 200)));
    }
}
