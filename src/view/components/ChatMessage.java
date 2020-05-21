package view.components;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

/**
 * A Chat Component
 */
public class ChatMessage extends JPanel {
    /**
     * ChatMessage contructor
     *
     * @param title       Group title
     * @param lastSender  last sender name
     * @param lastMessage last message like "Hello everyone"
     * @param hour        hour of the message like "14:46"
     * @param imagePath   the image path like "view/images/test_image.png"
     */
    public ChatMessage(String title, String lastSender, String lastMessage, String hour, String imagePath) {
        this.setMaximumSize(new Dimension(580,100));
        this.setLayout(new BorderLayout());
        this.add(new ImageComponent(imagePath, 60, 60).getAsLabel(), BorderLayout.WEST);

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

        this.setBorder(BorderFactory.createMatteBorder(0,0,1,0, new Color(100,0,200)));
    }
}
