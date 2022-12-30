package Ragister;

import javax.swing.*;

import com.toedter.calendar.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.border.Border;

public class Register implements ActionListener {

    JFrame f;
    JPanel p1,p2;
    JLabel title,sname,fname,mname,gender,dob,mno,emid,add,course,branch,doa;
    JTextField insname,infname,inmname,inmno,inemid;
    JTextArea inadd,stdatabase;
    JRadioButton male,female;
    JComboBox incourse,inbranch;
    JDateChooser indob,indoa;
    JCheckBox cb;
    JButton submit,reset,exit;
    Register()
    {
        f=new JFrame("Arya College Registration Desk");
        p1=new JPanel();
        p2=new JPanel();
        title=new JLabel("Student Registration by Shruti");
        title.setBounds(60,20,350,30);
        title.setFont(new Font("Times New Roman",Font.BOLD,20));
        title.setForeground(Color.RED);
        p1.add(title);
        sname=new JLabel("Student Name");
        fname=new JLabel("Father's Name");
        mname=new JLabel("Mother's Name");
        gender=new JLabel("Gender");
        dob=new JLabel("Date Of Birth");
        mno=new JLabel("Mobile Number");
        emid=new JLabel("E-mail Id");
        add=new JLabel("Address");
        course=new JLabel("Course");
        branch=new JLabel("Branch");
        doa=new JLabel("Date Of Admission");
        sname.setBounds(20,60,100,30);
        fname.setBounds(20,100,100,30);
        mname.setBounds(20,140,100,30);
        gender.setBounds(20,180,100,30);
        dob.setBounds(20,220,100,30);
        mno.setBounds(20,265,100,30);
        emid.setBounds(20,310,100,30);
        add.setBounds(20,350,100,30);
        course.setBounds(20,465,100,30);
        branch.setBounds(20,515,100,30);
        doa.setBounds(20,545,150,30);
        p1.add(sname);
        p1.add(fname);
        p1.add(mname);
        p1.add(gender);
        p1.add(dob);
        p1.add(mno);
        p1.add(emid);
        p1.add(add);
        p1.add(course);
        p1.add(branch);
        p1.add(doa);
        insname=new JTextField(20);
        infname=new JTextField(20);
        inmname=new JTextField(20);
        male=new JRadioButton("Male");
        female=new JRadioButton("Female");
        ButtonGroup bg=new ButtonGroup();
        bg.add(male);
        bg.add(female);
        indob=new JDateChooser();
        indob.setDateFormatString("dd-MM-yyyy");
        inmno=new JTextField(10);
        inemid=new JTextField();
        inadd=new JTextArea();
        String courses[]= {"Select your course","B.Tech","M.Tech","MBA","B.S.C"};
        incourse=new JComboBox(courses);
        String branch[]= {"Select your branch","Computer Science","Electronics","Mechanical","Artifical Intelligence","Electrical"};
        inbranch=new JComboBox(branch);
        indoa=new JDateChooser();
        indoa.setDateFormatString("dd-MM-yyyy");
        insname.setBounds(140,70,260,25);
        infname.setBounds(140,110,260,25);
        inmname.setBounds(140,150,260,25);
        male.setBounds(140,190,110,25);
        male.setBackground(Color.WHITE);
        female.setBounds(260,190,260,25);
        female.setBackground(Color.WHITE);
        indob.setBounds(140,230,260,25);
        inmno.setBounds(140,270,260,25);
        inemid.setBounds(140,310,260,25);
        inadd.setBounds(140,360,260,100);
        Border line=BorderFactory.createLineBorder(Color.BLACK,1);
        inadd.setBorder(line);
        incourse.setBounds(140,470,260,25);
        inbranch.setBounds(140,510,260,25);
        indoa.setBounds(140,550,260,25);
        p1.add(insname);
        p1.add(infname);
        p1.add(inmname);
        p1.add(indob);
        p1.add(male);
        p1.add(female);
        p1.add(inmno);
        p1.add(inemid);
        p1.add(inadd);
        p1.add(incourse);
        p1.add(inbranch);
        p1.add(indoa);
        cb=new JCheckBox("Please accept terms and conditions");
        cb.setBounds(100,590,300,25);
        cb.setBackground(Color.WHITE);
        p1.add(cb);
        submit=new JButton("Submit");
        reset=new JButton("Reset");
        exit=new JButton("Exit");
        submit.setBounds(70,615,80,25);
        reset.setBounds(180,615,80,25);
        exit.setBounds(280,615,80,25);
        p1.add(submit);
        p1.add(reset);
        p1.add(exit);
        stdatabase=new JTextArea();
        stdatabase.setBounds(480,100,280,800);
        p2.add(stdatabase);
        f.add(p1);
        f.add(p2);
        p1.setBounds(20,20,430,700);
        p2.setBounds(450,20,150,800);
        p1.setBackground(Color.WHITE);
        p2.setBackground(Color.WHITE);
        Border redLine=BorderFactory.createTitledBorder("Fill Registration Form");
        Border redLine1=BorderFactory.createTitledBorder("Student Database");
        p1.setBorder(redLine);
        p2.setBorder(redLine1);
        p1.setLayout(null);
        p2.setLayout(null);
        f.setSize(800,900);
        f.setVisible(true);
        f.setLayout(null);
        submit.addActionListener(this);
        reset.addActionListener(this);
        exit.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        if(cb.isSelected())
        {
            if(e.getSource()==submit)
            {

                String gen="Male";
                if(female.isSelected())
                {
                    gen="Female";
                }
                DateFormat df=new SimpleDateFormat("DD-MM-YYYY");
                stdatabase.setText("Name :"+ insname.getText()+"\n\nFather name :"+ infname.getText()+"\n\nMother name :"+ inmname.getText()+"\n\nGender :"+ gen + "\n\nDate of Birth :" + indob.getDate()+"\n\nContact no."+ inmno.getText()+"\n\nE-mail id :"+inemid.getText()+"\n\nAddress :" + inadd.getText()+"\n\nCourses :" + incourse.getSelectedItem()+"\n\nBranch :" +inbranch.getSelectedItem()  +"\n\nDate of Admission :"+ indoa.getDate());
            }
        }
        if(e.getSource()==reset)
        {
            insname.setText(null);
            infname.setText(null);
            inmname.setText(null);
            male.setSelected(false);
            female.setSelected(false);
            indob.setDate(null);
            inmno.setText(null);
            inemid.setText(null);
            inadd.setText(null);
            incourse.setSelectedIndex(0);
            inbranch.setSelectedIndex(0);
            indoa.setDate(null);
            cb.setSelected(false);

        }
        if(e.getSource()==exit)
        {
            System.exit(0);
        }

    }
    public static void main(String[] args) {
// TODO Auto-generated method stub
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                new Register();
            }
        });
    }
}
