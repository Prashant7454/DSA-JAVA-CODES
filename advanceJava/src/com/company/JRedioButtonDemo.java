package com.company;

import javax.swing.*;

public class JRedioButtonDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("MY redio button");
        JRadioButton b1,b2;
        ButtonGroup bg = new ButtonGroup();
        b1 = new JRadioButton("FirstButton");
        b2 = new JRadioButton("SecondButton");
        b1.setBounds(100,100,100,100);
        b2.setBounds(250,100,100,100);
        f.add(b1);
        f.add(b2);
        bg.add(b1);
        bg.add(b2);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(400,400);

    }
}
