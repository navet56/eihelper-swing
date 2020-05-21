package view.content;

import view.components.ChatMessage;
import view.components.ImageComponent;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import java.awt.BorderLayout;

/**
 * The type Chat.
 */
public class Chat extends JPanel {
    /**
     * Instantiates a new Chat.
     */
    public Chat() {
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        this.add(new ChatMessage("Annonces", "Vous", "Désolé", "14:46", "/view/images/annonces.png"));
        this.add(new ChatMessage("Coachs", "Patrick", "Tous près ?", "12:41", "/view/images/coachs.png"));
        this.add(new ChatMessage("Groupe privé 1", "Vous", "C'est pas faux", "08:25", "/view/images/priv1.png"));
        this.add(new ChatMessage("Groupe privé 2", "Evan", "Bonjour à tous !", "11:44", "/view/images/priv2.png"));
        this.add(new ChatMessage("Général", "Vous", "Bonjour", "14:34", "/view/images/general.png"));
        JPanel plusPanel = new JPanel(new BorderLayout());
        plusPanel.add(new ImageComponent("/view/images/plus_icon.png").getAsLabel(), BorderLayout.EAST);
        this.add(plusPanel);
    }
}
