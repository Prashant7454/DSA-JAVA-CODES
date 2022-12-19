package com.company;

import javax.swing.JApplet;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class FillOvel extends JApplet{
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.fillOval(20,20,60,60);
    }
}
