/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.buttons;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author zafer
 */
public class myFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    myFrame() {

        ImageIcon icon = new ImageIcon("logo.png");

        label = new JLabel();
        label.setBounds(100, 250, 150, 150);
        label.setText("deneme");
        label.setVisible(false);

        button = new JButton("asd", icon);
        button.setBounds(200, 100, 250, 100);
        //button.addActionListener(e -> System.out.println("poo"));
        button.addActionListener(this);
        button.setText("Text");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setIconTextGap(-15);
        button.setForeground(Color.cyan);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button) {
            System.out.println("foo");
            button.setEnabled(false);
            label.setVisible(true);
        }
    }

}
