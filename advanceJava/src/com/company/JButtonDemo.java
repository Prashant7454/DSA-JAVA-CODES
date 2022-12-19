package com.company;

import javax.swing.*;

public class JButtonDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("My First JButton Demo");
        JButton b = new JButton("Click by Prashant");
        b.setBounds(100,100,150,50);
        f.add(b);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(400,400);

    }
}
