package mainFrame;

import javax.swing.*;
import java.awt.*;

public class PanelOfVariableParametres extends JPanel {

    private VariableParametr powerAttack = new VariableParametr();
    private VariableParametr furiousFocus = new VariableParametr();
    private VariableParametr piraniaStrike = new VariableParametr();
    private VariableParametr fightingDefensively = new VariableParametr();
    private VariableParametr weaponFinisse = new VariableParametr();
    private VariableParametr combatExpertise = new VariableParametr();
    private VariableParametr slashingGrace = new VariableParametr();
    private VariableParametr rage = new VariableParametr();
    private VariableParametr fatiquet = new VariableParametr();
    private VariableParametr sikened = new VariableParametr();
    private VariableParametr shaken = new VariableParametr();
    private VariableParametr flanked = new VariableParametr();
    private VariableParametr two_weapon_fighting_with_light_in_off_hand = new VariableParametr();
    private VariableParametr two_weapon_fighting = new VariableParametr();
    private VariableParametr fight_two_weapon = new VariableParametr();
    private VariableParametr fight_two_weapon_with_light_in_off_hand = new VariableParametr();
    private VariableParametr exhaused = new VariableParametr();
    private VariableParametr enchantment = new VariableParametr();
    private JPanel panelOfVariableParametres = new JPanel();
    private Dimension d = new Dimension(500, 750);

    public JPanel PanelOfVariableParametres() {
        panelOfVariableParametres.setMinimumSize(d);
        panelOfVariableParametres.setPreferredSize(d);
        panelOfVariableParametres.setLayout(new GridLayout(0, 1, 5, 5));

        panelOfVariableParametres.add(powerAttack);
        panelOfVariableParametres.add(furiousFocus);
        panelOfVariableParametres.add(piraniaStrike);
        panelOfVariableParametres.add(fightingDefensively);
        panelOfVariableParametres.add(weaponFinisse);
        panelOfVariableParametres.add(combatExpertise);
        panelOfVariableParametres.add(slashingGrace);
        panelOfVariableParametres.add(rage);
        panelOfVariableParametres.add(fatiquet);
        panelOfVariableParametres.add(sikened);
        panelOfVariableParametres.add(shaken);
        panelOfVariableParametres.add(flanked);
        panelOfVariableParametres.add(two_weapon_fighting_with_light_in_off_hand);
        panelOfVariableParametres.add(two_weapon_fighting);
        panelOfVariableParametres.add(fight_two_weapon);
        panelOfVariableParametres.add(fight_two_weapon_with_light_in_off_hand);
        panelOfVariableParametres.add(exhaused);
        panelOfVariableParametres.add(enchantment);

        return panelOfVariableParametres;

    }


}
