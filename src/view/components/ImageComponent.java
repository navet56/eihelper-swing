package view.components;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Cursor;
import java.awt.Image;

/**
 * A generic component to show images (in a label or a button)
 */
public class ImageComponent {
    /**
     * The image of the component
     */
    private final ImageIcon miniature;
    /**
     * The size of the component
     */
    private int size;

    /**
     * ImageComponent constructor with custom width and height
     *
     * @param path   path of the image
     * @param width  width of the image
     * @param height height of the image
     */
    public ImageComponent(String path, int width, int height) {
        ImageIcon icon = new ImageIcon(ImageComponent.class.getResource(path));
        Image image = icon.getImage();

        this.miniature = new ImageIcon(image.getScaledInstance(width, height, Image.SCALE_SMOOTH));
        this.size = Math.max(width, height);
    }

    /**
     * ImageComponent constructor in default size
     *
     * @param path path of the image
     */
    public ImageComponent(String path) {
        this.miniature = new ImageIcon(ImageComponent.class.getResource(path));
    }

    /**
     * ImageComponent constructor with custom size (squared component)
     *
     * @param path path of the image
     * @param size size of the image
     */
    public ImageComponent(String path, int size) {
        this(path, size, size);
    }

    /**
     * Get the imageComponent as a button
     *
     * @return the button containing the image
     */
    public JButton getAsButton() {
        JButton button = new JButton();
        button.setBorderPainted(false);
        button.setFocusPainted(false);
        button.setContentAreaFilled(false);
        button.setIcon(this.miniature);
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button.setSize(this.size, this.size);

        return button;
    }

    /**
     * Get the imageComponent as a label
     *
     * @return the label containing the image
     */
    public JLabel getAsLabel() {
        return new JLabel(this.miniature);
    }
}
