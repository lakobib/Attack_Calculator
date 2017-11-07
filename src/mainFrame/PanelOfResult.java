package mainFrame;



import javax.swing.*;
import javax.swing.JPanel;
import java.awt.*;

public class PanelOfResult extends  JPanel{
    private JLabel label = new JLabel();
    private JTextField field = new JTextField();
    private JPanel panelOfResult = new JPanel();

    public JPanel PanelOfResult(){
        label.setText(panelOfResult.getName());
        label.setSize(80,25);
        label.setMinimumSize(new Dimension(50, 10));

        boolean focusable = field.isFocusable();
        focusable = false;
        boolean editable = field.isEditable();
        editable = false;
        field.setColumns(3);

        panelOfResult.setSize(200,50);
        panelOfResult.setMinimumSize(new Dimension(150,30));
        panelOfResult.add(label);
        panelOfResult.add(field);

        panelOfResult.setVisible(true);

        return panelOfResult;
    }
}

