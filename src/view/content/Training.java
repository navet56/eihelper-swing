package view.content;

import view.components.ImageComponent;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Training JPanel
 */
public class Training extends JPanel {

    public Training() {
        final URI uri;
        try {
            uri = new URI("https://www.youtube.com/watch?v=Rler3wwQBfw");
            JButton videoButton = (new ImageComponent("/view/images/video.jpg", 500, 310)).getAsButton();

            this.add(videoButton);

            videoButton.addActionListener(e -> open(uri));
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

    }

    private static void open(URI uri) {
        if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(uri);
            }
            catch (IOException e){
                System.out.println("Oupsi");
            }
        }
        else System.out.println("Oupsi doupsi");
    }
}
