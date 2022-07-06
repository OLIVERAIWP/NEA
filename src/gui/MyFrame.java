package gui;

import java.awt.Color;

import javax.swing.ImageIcon;

/**
 * @author isaac
 *
 */
public class MyFrame extends javax.swing.JFrame {

    MyFrame() {

        this.setTitle("Social Media Manger"); //sets the title

        this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE); //exit out of application

        this.setSize(750, 750); //sets a x and y dimention for the frame

        this.setVisible(true); //makes frame visable

        this.setLayout(null);

        ImageIcon image = new ImageIcon("Nessie_Vibe.png"); //create image icon

        this.setIconImage(image.getImage()); //change icon image

        this.getContentPane().setBackground(new Color(0x2F303A));

    }

}
