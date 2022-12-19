package com.company;

import javax.swing.*;

public class JTextFieldDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("My first Text Field");
        JTextField t = new JTextField("Text Field");
        t.setBounds(100,100,150,50);
        f.add(t);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(400,400);

    }
}
