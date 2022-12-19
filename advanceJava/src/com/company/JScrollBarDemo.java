package com.company;

import javax.swing.*;

public class JScrollBarDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("My first Scroll bar");
        JScrollBar b = new JScrollBar();
        b.setBounds(100,100,50,300);
        f.add(b);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(400,400);
    }
}
