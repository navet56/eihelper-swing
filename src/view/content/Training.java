package view.content;

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
        super(new GridLayout(2,2));
        final URI uri;
        try {
            uri = new URI("https://www.youtube.com/watch?v=Rler3wwQBfw");
            JButton button = new JButton("CLICK HERE");
            this.add(button);
            button.addActionListener(e -> open(uri));
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
