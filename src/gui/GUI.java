package gui;

import java.awt.Color;
import javax.swing.*;

/**
 * * * @author isaac
 */
public class GUI {

    /**
     * @param args
     */
    public static void main(String[] args) {
        JLabel label = new JLabel("Cool Section");
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        JPanel REDpanel = new JPanel();
        REDpanel.setBackground(Color.red);
        REDpanel.setBounds(0, 0, 250, 250);

        JPanel BLUEpanel = new JPanel();
        BLUEpanel.setBackground(Color.blue);
        BLUEpanel.setBounds(250, 0, 250, 250);
        JPanel GREENpanel = new JPanel();
        
        GREENpanel.setBackground(Color.green);
        GREENpanel.setBounds(0, 250, 500, 250);
        MyFrame MyFrame = new MyFrame();
        
        REDpanel.add(label);
        MyFrame.add(REDpanel);
        MyFrame.add(BLUEpanel);
        MyFrame.add(GREENpanel);
    }
}
