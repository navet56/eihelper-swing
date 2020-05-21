package view.components;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

public class ChatMessage extends JPanel {
    public ChatMessage(String title, String lastSender, String lastMessage, String hour, String imagePath) {
        this.setMaximumSize(new Dimension(500,70));
        this.setLayout(new BorderLayout());
        this.add(new ImageComponent(imagePath, 50, 50).getAsLabel(), BorderLayout.WEST);

        JPanel rightPanel = new JPanel();
        rightPanel.setPreferredSize(new Dimension(440, 70));
        rightPanel.setLayout(new GridLayout(2, 1));

        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(new BorderLayout());
        titlePanel.add(new JLabel("<html><strong>" + title + "</strong></html>"), BorderLayout.WEST);
        titlePanel.add(new JLabel(hour), BorderLayout.EAST);

        JPanel lastMessagePanel = new JPanel();
        lastMessagePanel.setLayout(new BoxLayout(lastMessagePanel, BoxLayout.LINE_AXIS));

        JLabel senderLabel = new JLabel(lastSender + " : ");
        senderLabel.setForeground(Color.BLUE);
        lastMessagePanel.add(senderLabel);
        lastMessagePanel.add(new JLabel(lastMessage));

        rightPanel.add(titlePanel, BorderLayout.NORTH);
        rightPanel.add(lastMessagePanel, BorderLayout.SOUTH);

        this.add(rightPanel, BorderLayout.EAST);

        this.setBorder(BorderFactory.createMatteBorder(0,0,1,0, Color.LIGHT_GRAY));
    }
}
