package CalculatorApplication;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Calci implements ActionListener{
    JFrame f;
    JLabel title;
    JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,mul,div,add,sub,prt,clr,eql,dcml,del;
    JTextField t;
    static double a=0,b=0,result;
    static int op;
    Calci(){
        f = new JFrame("calculator");
        title = new JLabel("Calculator By Himanshu");
        f.add(title);
        title.setBounds(70,40,350,40);
        title.setFont(new Font ("Arial",Font.BOLD,30));
        title.setForeground(Color.blue);

        t = new JTextField();
        f.add(t);
        t.setBounds(70,130,330,50);
        t.setBorder(BorderFactory.createLineBorder(Color.red));
        t.setHorizontalAlignment(JTextField.RIGHT);
        t.setFont(new Font ("Arial",Font.PLAIN,20));

        b7 = new JButton("7");
        f.add(b7);
        b7.setBounds(70,220,60,40);
        b7.addActionListener(this);
        b8 = new JButton("8");
        f.add(b8);
        b8.setBounds(160,220,60,40);
        b8.addActionListener(this);
        b9 = new JButton("9");
        f.add(b9);
        b9.setBounds(250,220,60,40);
        b9.addActionListener(this);
        div = new JButton("/");
        f.add(div);
        div.setBounds(340,220,60,40);
        div.addActionListener(this);
        b4 = new JButton("4");
        f.add(b4);
        b4.setBounds(70,290,60,40);
        b4.addActionListener(this);
        b5 = new JButton("5");
        f.add(b5);
        b5.setBounds(160,290,60,40);
        b5.addActionListener(this);
        b6 = new JButton("6");
        f.add(b6);
        b6.setBounds(250,290,60,40);
        b6.addActionListener(this);
        mul = new JButton("*");
        f.add(mul);
        mul.setBounds(340,290,60,40);
        mul.addActionListener(this);
        b1 = new JButton("1");
        f.add(b1);
        b1.setBounds(70,360,60,40);
        b1.addActionListener(this);
        b2 = new JButton("2");
        f.add(b2);
        b2.setBounds(160,360,60,40);
        b2.addActionListener(this);
        b3 = new JButton("3");
        f.add(b3);
        b3.setBounds(250,360,60,40);
        b3.addActionListener(this);
        sub = new JButton("-");
        f.add(sub);
        sub.setBounds(340,360,60,40);
        sub.addActionListener(this);
        b0 = new JButton("0");
        f.add(b0);
        b0.setBounds(70,430,60,40);
        b0.addActionListener(this);
        dcml = new JButton(".");
        f.add(dcml);
        dcml.setBounds(160,430,60,40);
        dcml.addActionListener(this);
        add = new JButton("+");
        f.add(add);
        add.setBounds(250,430,60,40);
        add.addActionListener(this);
        clr = new JButton("AC");
        f.add(clr);
        clr.setBounds(340,430,60,40);
        clr.addActionListener(this);
        prt = new JButton("%");
        f.add(prt);
        prt.setBounds(70,500,60,40);
        prt.addActionListener(this);
        del = new JButton("Del");
        f.add(del);
        del.setBounds(160,500,60,40);
        del.addActionListener(this);
        eql = new JButton("=");
        f.add(eql);
        eql.setBounds(250,500,150,40);
        eql.addActionListener(this);

        f.setSize(500,600);
        f.setLayout(null);
        f.setResizable(false);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== b0) {
            t.setText(t.getText().concat("0"));
        }
        if(e.getSource()== b1) {
            t.setText(t.getText().concat("1"));
        }
        if(e.getSource()== b2) {
            t.setText(t.getText().concat("2"));
        }
        if(e.getSource()== b3) {
            t.setText(t.getText().concat("3"));
        }
        if(e.getSource()== b4) {
            t.setText(t.getText().concat("4"));
        }
        if(e.getSource()== b5) {
            t.setText(t.getText().concat("5"));
        }
        if(e.getSource()== b6) {
            t.setText(t.getText().concat("6"));
        }
        if(e.getSource()== b7) {
            t.setText(t.getText().concat("7"));
        }
        if(e.getSource()== b8) {
            t.setText(t.getText().concat("8"));
        }
        if(e.getSource()== b9) {
            t.setText(t.getText().concat("9"));
        }
        if(e.getSource()== clr) {
            t.setText("");
        }
        if(e.getSource()==add) {
            a = Double.parseDouble(t.getText());
            op = 1;
            t.setText("");
        }
        if(e.getSource()==sub) {
            a = Double.parseDouble(t.getText());
            op = 2;
            t.setText("");
        }
        if(e.getSource()==mul) {
            a = Double.parseDouble(t.getText());
            op = 3;
            t.setText("");
        }
        if(e.getSource()==div) {
            a = Double.parseDouble(t.getText());
            op = 4;
            t.setText("");
        }
        if(e.getSource()== prt) {
            a = Double.parseDouble(t.getText());
            result = a/100;
            t.setText(""+result);
        }
        if(e.getSource()== eql) {
            b = Double.parseDouble(t.getText());
            switch(op) {
                case 1: result = a+b;break;
                case 2: result = a-b;break;
                case 3: result = a*b;break;
                case 4: result = a/b;break;
                default: result =0;
            }
            t.setText(""+result);
        }
        if(e.getSource()== dcml) {
            t.setText(t.getText().concat("."));
        }
        if(e.getSource()==  del) {
            String s = t.getText();
            t.setText("");
            for(int i=0;i<s.length()-1;i++) {
                t.setText(t.getText()+s.charAt(i));
            }
        }

    }



    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                new Calci();
            }
        });

    }



}