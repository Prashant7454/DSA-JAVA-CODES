package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm implements ActionListener {
    JFrame f;
    JLabel title,userName,password;
    JTextField inuser;
    JPasswordField inpass;
    JCheckBox cb;
    JButton login,reset;

    LoginForm(){
        f = new JFrame("Login Authentication form");
        title = new JLabel("user login by Prerna");
        userName = new JLabel("userName");
        password = new JLabel("password");
        inuser = new JTextField();
        inpass = new JPasswordField();
        cb = new JCheckBox("Show your password");
        login = new JButton("Login");
        reset = new JButton("Reset");

        title.setBounds(200,10,150,40);
        userName.setBounds(80,60,150,30);
        password.setBounds(80,100,150,30);
        inuser.setBounds(230,64,200,20);
        inpass.setBounds(230,105,200,20);
        cb.setBounds(90,130,150,30);
        login.setBounds(100,190,100,30);
        reset.setBounds(290,190,100,30);

        f.add(title);
        f.add(userName);
        f.add(password);
        f.add(inpass);
        f.add(inuser);
        f.add(cb);
        f.add(login);
        f.add(reset);

        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);

        login.addActionListener(this);
        reset.addActionListener(this);
        cb.addActionListener(this);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==login){
            if (inuser.getText().equals("prashant") && inpass.getText().equals("123456")){
                JOptionPane.showMessageDialog(f,"login successfully");
            }
            else{
                JOptionPane.showMessageDialog(f,"wrong Credential! Try again");
            }
        }
        if (e.getSource()==reset){
            inuser.setText("");
            inpass.setText("");
        }
        if(e.getSource()==cb){
            if(cb.isSelected()){
                inpass.setEchoChar('\u0000');
            }
            else{
                inpass.setEchoChar('*');
            }
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginForm();
            }
        });
    }
}
