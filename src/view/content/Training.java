package view.content;

import view.components.ImageComponent;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Desktop;
import java.awt.GridLayout;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Training JPanel
 */
public class Training extends JPanel {
    /**
     * Instantiates a new Training.
     */
    public Training() {
        this.setLayout(new GridLayout(1, 1));
        try {
            URI uri = new URI("https://www.youtube.com/watch?v=njHE4S-HD3I");
            JButton videoButton = (new ImageComponent("/view/images/video.png", 724, 540)).getAsButton();
            videoButton.addActionListener(e -> Training.open(uri));

            this.add(videoButton);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    private static void open(URI uri) {
        if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(uri);
            } catch (IOException e) {
                System.out.println("Can't find the URI of the video.");
            }
        } else System.err.println("Desktop not supported");
    }
}
