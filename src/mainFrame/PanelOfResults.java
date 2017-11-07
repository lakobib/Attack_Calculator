package mainFrame;


import javax.swing.*;
import java.awt.*;

public class PanelOfResults extends JPanel {

    private PanelOfResult meeleWeaponAttack = new PanelOfResult();
    private PanelOfResult meeleeDmg = new PanelOfResult();
    private PanelOfResult meleeOffHandWeaponAttack = new PanelOfResult();
    private PanelOfResult meleeOffHandWeaponDmg = new PanelOfResult();
    private PanelOfResult primaryNaturalAttack = new PanelOfResult();
    private PanelOfResult primaryNaturalAttacksDmg = new PanelOfResult();
    private PanelOfResult seconadaryNaturalAttack = new PanelOfResult();
    private PanelOfResult getSeconadaryNaturalAttacksDma = new PanelOfResult();
    private PanelOfResult rangedAttack = new PanelOfResult();
    private PanelOfResult rangedDmg = new PanelOfResult();
    private JPanel PanelOfResults = new JPanel();
    private Dimension d = new Dimension(500,600);

    public JPanel PanelOfResults(){
        PanelOfResults.setSize(500,600);
        PanelOfResults.setMinimumSize(d);
        PanelOfResults.setPreferredSize(d);
        PanelOfResults.setLayout(new GridLayout(0, 1, 5, 5));

        PanelOfResults.add(meeleWeaponAttack);
        PanelOfResults.add(meeleeDmg);
        PanelOfResults.add(meleeOffHandWeaponAttack);
        PanelOfResults.add(meleeOffHandWeaponDmg);
        PanelOfResults.add(primaryNaturalAttack);
        PanelOfResults.add(primaryNaturalAttacksDmg);
        PanelOfResults.add(seconadaryNaturalAttack);
        PanelOfResults.add(getSeconadaryNaturalAttacksDma);
        PanelOfResults.add(rangedAttack);
        PanelOfResults.add(rangedDmg);

        return PanelOfResults;
    }


}

