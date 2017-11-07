package mainFrame;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StaticElement extends JPanel {
    private JTextField field = new JTextField();
    private JButton tbUp = new JButton();
    private JButton tbDown = new JButton();
    private JPanel panel = new JPanel();
    private JLabel label = new JLabel();


    public JPanel StaticElement (String name){
        label.setText(name);
        label.setSize(20,10);
        label.setVisible(true);
        field.setColumns(2);
        field.setText("00");

        tbUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tbUp.isSelected()){
                    int i = (Integer.parseInt(tbUp.getText()));
                    i++;
                    tbUp.setText(new String("" + i));
                }
            }
        });
        tbDown.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tbDown.isSelected()){
                    int i = (Integer.parseInt(tbDown.getText()));
                    i--;
                    tbDown.setText(new String("" + i));
                }
            }
        });
        tbDown.setSize(5,5);
        tbUp.setSize(5,5);
        tbUp.setIcon(new ImageIcon("src\\out\\img\\up.png"));
        tbDown.setIcon(new ImageIcon("src\\out\\img\\down.png"));

        panel.setSize(100,15);
        panel.setPreferredSize(new Dimension(100,15));
        panel.setMinimumSize(new Dimension(80,15));
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 7, 3));

        panel.add(label);
        panel.add(field);
        panel.add(tbUp);
        panel.add(tbDown);

        panel.setVisible(true);
        return panel;
    }




}
