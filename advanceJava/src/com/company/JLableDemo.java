package com.company;

import javax.swing.*;

public class JLableDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("My first Jlable Demo");
        JLabel l = new JLabel("My Lable");
        l.setBounds(100,100,150,50);
        f.add(l);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(400,400);
    }
}
