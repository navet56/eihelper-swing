package view.content;

import view.components.ChatMessage;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.GridLayout;

/**
 * The type Chat.
 */
public class Chat extends JPanel {
    public Chat() {
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        this.add(new ChatMessage("Annonces", "Vous", "Désolé", "14:46"));
        this.add(new ChatMessage("Annonces", "Vous", "Désolé", "14:46"));
        this.add(new ChatMessage("Annonces", "Vous", "Désolé", "14:46"));
        this.add(new ChatMessage("Annonces", "Vous", "Désolé", "14:46"));
        this.add(new ChatMessage("Annonces", "Vous", "Désolé", "14:46"));
        this.add(new ChatMessage("Annonces", "Vous", "Désolé", "14:46"));
    }
}
