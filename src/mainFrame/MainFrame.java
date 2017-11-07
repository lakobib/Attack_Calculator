package mainFrame;

import javax.swing.*;
import com.jtattoo.plaf.noire.NoireLookAndFeel;
import jdk.internal.dynalink.support.ClassMap;

import java.awt.*;


public class MainFrame extends JFrame {
    private JFrame calculator = new JFrame();
    private JPanel rightPanel = new JPanel(new GridLayout(0, 1, 5, 0));
    private JPanel realiseVariableParametres = new PanelOfVariableParametres();
    private JPanel realiseStaticParametres = new PanelOfStaticParametres();
    private JPanel realiseResults = new PanelOfResults();

    public  JFrame calculator(JFrame calculator){
        UIManager.getSystemLookAndFeelClassName();
//        try {
//            UIManager.setLookAndFeel(new NoireLookAndFeel());
//        } catch (UnsupportedLookAndFeelException e) {
//            e.printStackTrace();
//        }

        calculator.setDefaultLookAndFeelDecorated(true);
        calculator.setLayout(new FlowLayout(FlowLayout.CENTER, 1,1));
        calculator.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //calculator.setLocationRelativeTo(null);
        calculator.setPreferredSize(new Dimension(1000,800));
        calculator.setMinimumSize(new Dimension(1000, 800));
        calculator.setName("Battle calculator");

        rightPanel.setPreferredSize(new Dimension(450,750));
        realiseResults.setPreferredSize(new Dimension(450,300));
        realiseVariableParametres.setPreferredSize(new Dimension(450, 720));
        realiseStaticParametres.setPreferredSize(new Dimension(450, 400));

        calculator.add(realiseVariableParametres);
        rightPanel.add(realiseStaticParametres);
        rightPanel.add(realiseResults);
        calculator.add(rightPanel);

        realiseResults.setVisible(true);
        realiseVariableParametres.setVisible(true);
        realiseStaticParametres.setVisible(true);
        rightPanel.setVisible(true);
        calculator.setVisible(true);
        return calculator;
    }



public JFrame getCalculator(){
    //calculator(calculator);
    return calculator(calculator);
    }


}
