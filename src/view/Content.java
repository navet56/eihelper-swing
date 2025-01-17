package view;

import model.MenuPage;
import view.content.Chat;
import view.content.Map;
import view.content.Planning;
import view.content.Settings;
import view.content.Training;

import javax.swing.JPanel;
import java.awt.CardLayout;

/**
 * The type Content.
 */
public class Content extends JPanel {
    /**
     * Instantiates a new Content.
     */
    public Content() {
        this.setLayout(new CardLayout());
        this.add(new Map(), MenuPage.CARTE.name());
        this.add(new Planning(), MenuPage.PLANNING.name());
        this.add(new Chat(), MenuPage.CHAT.name());
        this.add(new Training(), MenuPage.ENTRAINEMENT.name());
        this.add(new Settings(), MenuPage.PARAMETRES.name());
    }

    /**
     * Switch page.
     *
     * @param menuPage the menu page
     */
    public void switchPage(MenuPage menuPage) {
        ((CardLayout) this.getLayout()).show(this, menuPage.name());
    }
}
