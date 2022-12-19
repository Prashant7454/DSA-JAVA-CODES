package com.company;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;

public class JFormDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("My first Form");

        JTextField tf1 = new JTextField("");
        JTextField tf2 = new JTextField("");
        JTextField tf3 = new JTextField("");

        tf1.setBounds(680,166,210,30);
        tf2.setBounds(680,216,210,30);
        tf3.setBounds(680,366,210,30);

        f.add(tf1);
        f.add(tf2);
        f.add(tf3);

        ButtonGroup bg = new ButtonGroup();

        JRadioButton rb1 = new JRadioButton("Male");
        JRadioButton rb2 = new JRadioButton("Female");


        rb1.setBounds(680,308,80,40);
        rb2.setBounds(760,308,80,40);


        f.add(rb1);
        f.add(rb2);


        bg.add(rb1);
        bg.add(rb2);


        JLabel l1 = new JLabel("Name of Student");
        JLabel l2 = new JLabel("Father's Name");
        JLabel l3 = new JLabel("D.O.B");
        JLabel l4 = new JLabel("Gender");
        JLabel l5 = new JLabel("Email ID");
        JLabel l6 = new JLabel("College");
        JLabel l7 = new JLabel("Branch");
        JLabel l8 = new JLabel("course");
        JLabel l9 = new JLabel("General Form of Student");

        l1.setFont(new Font("Serif", Font.PLAIN, 20));
        l2.setFont(new Font("Serif", Font.PLAIN, 20));
        l3.setFont(new Font("Serif", Font.PLAIN, 20));
        l4.setFont(new Font("Serif", Font.PLAIN, 20));
        l5.setFont(new Font("Serif", Font.PLAIN, 20));
        l6.setFont(new Font("Serif", Font.PLAIN, 20));
        l7.setFont(new Font("Serif", Font.PLAIN, 20));
        l8.setFont(new Font("Serif", Font.PLAIN, 20));
        l9.setFont(new Font("Serif", Font.PLAIN, 20));

        l1.setBounds(530,150,150,50);
        l2.setBounds(530,200,150,50);
        l3.setBounds(530,250,150,50);
        l4.setBounds(530,300,150,50);
        l5.setBounds(530,350,150,50);
        l6.setBounds(530,400,150,50);
        l7.setBounds(530,450,150,50);
        l8.setBounds(530,500,150,50);
        l9.setBounds(610,70,300,50);

        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);
        f.add(l6);
        f.add(l7);
        f.add(l8);
        f.add(l9);

        JButton b1 = new JButton("EXIT");
        JButton b2 = new JButton("RESET");
        JButton b3 = new JButton("SUBMIT");

        b3.setBounds(530,700,100,30);
        b2.setBounds(660,700,100,30);
        b1.setBounds(790,700,100,30);

        f.add(b1);
        f.add(b2);
        f.add(b3);

        f.setLayout(null);
        f.setVisible(true);
        f.setSize(400,400);

       JDateChooser d = new JDateChooser();
       d.setBounds(680,270,210,30);
       f.add(d);

        String[] collegeName = { "Arya college of engineering and it","Arya college of engineering and research center","Purnima university","Jaipur engineering college"};
        final JComboBox<String> cb4 = new JComboBox<String>(collegeName);
        f.add(cb4);
        cb4.setBounds(680,416,210,30);

        String[] branch = {"CS","EE","IT","AI&DS","EC","Mech."};
        final JComboBox<String> cb5 = new JComboBox<String>(branch);
        f.add(cb5);
        cb5.setBounds(680,462,210,30);
        String[] course = {"JAVA","C++","C","HTML","JS","CSS"};
        final JComboBox<String> cb6 = new JComboBox<String>(course);
        f.add(cb6);
        cb6.setBounds(680,510,210,30);

    }
}
