package mainFrame;



import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class VariableParametr  extends JPanel{
    private JLabel field = new JLabel();
    private JCheckBox box = new JCheckBox();
    private JRadioButton radioButton = new JRadioButton();
    private ButtonGroup buttonGroup = new ButtonGroup();
    private JPanel variableParametr = new JPanel();

//    public void variableParametr(String name){
//        variableParametr.getName();
//    }

    public JPanel VariableParametr (){
        field.setText(variableParametr.getName());
        box.setVisible(true);
        box.setMinimumSize(new Dimension(5,5));
        box.setPreferredSize(new Dimension(5,5));
        box.setSelected(false);
        //field.add(box);
        field.setSize(700,10);
        variableParametr.add(box);
        variableParametr.add(field);

        return variableParametr;
    }


}
