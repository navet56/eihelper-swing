package view.content;

import view.components.CategoryComponent;
import view.components.ImageComponent;
import view.components.SettingComponent;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Training JPanel
 */
public class Training extends JPanel {
    public Training() {
        this.setLayout(new BorderLayout());

        JPanel categoryPanel = new JPanel();
        categoryPanel.setLayout(new BoxLayout(categoryPanel, BoxLayout.PAGE_AXIS));
        categoryPanel.add(new CategoryComponent("Activités nautiques"));
        categoryPanel.add(new CategoryComponent("Tout"));
        categoryPanel.add(new CategoryComponent("Autre"));
        categoryPanel.add(new CategoryComponent("Autre"));
        categoryPanel.add(new CategoryComponent("Autre"));
        categoryPanel.add(new CategoryComponent("Autre"));
        categoryPanel.add(new CategoryComponent("Autre"));

        JPanel suggestionPanel = new JPanel(new GridLayout(1,3));
        JButton videoButton = (new ImageComponent("/view/images/video.jpg", 520, 250)).getAsButton();
        JPanel arrowW = new JPanel(new BorderLayout());
        arrowW.add(new ImageComponent("/view/images/arrow_icon_west.png").getAsButton(), BorderLayout.EAST);
        suggestionPanel.add(arrowW);
        suggestionPanel.add(videoButton);
        JPanel arrowE = new JPanel(new BorderLayout());
        arrowE.add(new ImageComponent("/view/images/arrow_icon_east.png").getAsButton(), BorderLayout.WEST);
        suggestionPanel.add(arrowE);

        this.add(categoryPanel, BorderLayout.CENTER);
        this.add(suggestionPanel, BorderLayout.NORTH);

        try {
            URI uri = new URI("https://www.youtube.com/watch?v=Rler3wwQBfw");
            videoButton.addActionListener(e -> Training.open(uri));
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
