package view.content;

import view.components.ImageComponent;

import javax.swing.JPanel;

/**
 * The Map JPanel
 */
public class Map extends JPanel {
    public Map(){
        this.add((new ImageComponent("/view/images/map.png")).getAsLabel());
    }

}
