package view.content;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.UtilDateModel;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.util.Properties;

/**
 * The type Planning.
 */
public class Planning extends JPanel {
    /**
     * Instantiates a new Planning.
     */
    public Planning() {
        this.setLayout(new GridLayout(1, 1));
        UtilDateModel model = new UtilDateModel();
        Properties p = new Properties();
        p.setProperty("text.today", "Today");
        p.setProperty("text.month", "Month");
        p.setProperty("text.year", "Year");
        JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
        this.add(datePanel);
    }
}
