package view.components;

import javax.swing.*;
import java.awt.*;

public class CategoryComponent extends JPanel {
    /**
     * CategoryComponent constructor
     * @param title title of the category like "Swimming"
     */
    public CategoryComponent(String title) {
        this.setMaximumSize(new Dimension(600,70));
        this.setLayout(new BorderLayout());

        this.add(new JLabel("<html><h3> &nbsp &nbsp &nbsp " + title + "</h1></html>"), BorderLayout.CENTER);

        this.setBorder(BorderFactory.createMatteBorder(0,0,1,0, new Color(100,0,200)));
    }
}
