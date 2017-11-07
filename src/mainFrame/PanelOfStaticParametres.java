package mainFrame;




import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class PanelOfStaticParametres extends  JPanel {
    private StaticElement str = new StaticElement();
    private StaticElement dex = new StaticElement();
    private StaticElement cha = new StaticElement();
    private StaticElement bab = new StaticElement();
    private JPanel panelOfStaticParametres = new JPanel();


    public JPanel PanelOfStaticParametres(){
        panelOfStaticParametres.setSize(500,800);
        panelOfStaticParametres.setLayout(new GridLayout(0,1,5,5));
        panelOfStaticParametres.setMaximumSize(new Dimension(500, 800));
        panelOfStaticParametres.setPreferredSize(new Dimension(500, 800));
        panelOfStaticParametres.add(str);
        panelOfStaticParametres.add(dex);
        panelOfStaticParametres.add(cha);
        panelOfStaticParametres.add(bab);

        return PanelOfStaticParametres();
    }

}
