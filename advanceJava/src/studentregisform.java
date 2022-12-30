
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.border.Border;
import com.toedter.calendar.*;

public class studentregisform implements ActionListener {
    JFrame f ;
    JPanel p1,p2;
    JLabel title,stdname,ftname,moname,gender,dob, mobileno,emid,add,course,branch,doaddmission;
    JTextField instname,infname,inmname,inmno,inemid;
    JTextArea inadd,stdatabase;
    JRadioButton male, female;
    JComboBox incourse,inbranch;
    JDateChooser indob,indoa;
    JCheckBox cb;
    JButton submit,reset,exit;
    studentregisform (){

        f=new JFrame("Arya College Registration Desk");
        p1=new JPanel();
        p2=new JPanel();

        title=new JLabel("Student Registration by Ayush");
        title.setBounds(40,20,300,30);
        title.setFont(new Font("times New Roman",Font.BOLD,20));
        title.setForeground(Color.BLUE);
        p1.add(title);


        stdname=new JLabel("Student Name");
        ftname=new JLabel("Father Name");
        moname =new JLabel("Mother Name");
        gender=new JLabel("Gender");
        dob=new JLabel("Date of Birth");
        mobileno=new JLabel("Mobile Number");
        emid=new JLabel("E-Mail ID");

        add=new JLabel("Address");
        course=new JLabel("Course");
        branch=new JLabel("Branch");
        doaddmission=new JLabel("Date of Admission");

        stdname.setBounds(20,60,100,30);
        ftname.setBounds(20,100,100,30);
        moname.setBounds(20,140,100,30);
        gender.setBounds(20,180,100,30);
        dob.setBounds(20,220,100,30);
        mobileno.setBounds(20,260,100,30);
        emid.setBounds(20,300,100,30);
        add.setBounds(20,350,100,30);
        course.setBounds(20,465,100,30);
        branch.setBounds(20,515,100,30);
        doaddmission.setBounds(20,545,100,30);


        p1.add(stdname);
        p1.add(ftname);
        p1.add(moname);
        p1.add(gender);
        p1.add(dob);
        p1.add(mobileno);
        p1.add(emid);
        p1.add(add);
        p1.add(course);
        p1.add(branch);
        p1.add(doaddmission);

        instname=new JTextField(20);
        infname=new JTextField(20);

        inmname=new JTextField(20);

        male=new  JRadioButton("Male");


        female= new JRadioButton("Female");


        ButtonGroup bg= new ButtonGroup();
        bg.add(male);
        bg.add(female);

        indob=new JDateChooser();
        indob.setDateFormatString("dd-MM-yyyy");

        inmno=new JTextField(10);

        inemid=new JTextField();

        inadd=new JTextArea();
        stdatabase=new JTextArea();

        String courses[]= {"Select Your Course ","B.Tech","M.Tech","MBA","B.Sc.","M.Sc."};
        incourse=new JComboBox(courses);

        String branches[]= {"Select Your Branch ","Computer Science"," Electronics","Information Technology"};
        inbranch=new JComboBox(branches);

        indoa=new JDateChooser();
        indoa.setDateFormatString("dd-MM-yyyy");


        instname.setBounds(140,70,260,25);
        infname.setBounds(140,110,260,25);
        inmname.setBounds(140,150,260,25);
        male.setBounds(140,190,110,25);
        male.setBackground(Color.white);
        female.setBounds(260,190,110,25);
        female.setBackground(Color.white);
        indob.setBounds(140,230,260,25);
        inmno.setBounds(140,270,260,25);
        inemid.setBounds(140,310,260,25);
        inadd.setBounds(140,360,260,100);
        Border line=BorderFactory.createLineBorder(Color.BLACK,1);
        inadd.setBorder(line);
        incourse.setBounds(140,470,260,25);
        inbranch.setBounds(140,550,260,25);

        p1.add(instname);
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

        cb=new JCheckBox("Please Accept Term & Condition");
        cb.setBounds(100,590,300,25);
        cb.setBackground(Color.WHITE);
        p1.add(cb);

        submit=new JButton ("Submit");
        reset=new JButton("Reset");
        exit=new JButton("Exit");

        submit.setBounds(70,615,80,25);
        reset.setBounds(180,615,80,25);
        exit.setBounds(280,615,80,25);

        p1.add(submit);
        p1.add(reset);
        p1.add(exit);

        stdatabase=new JTextArea();
        stdatabase.setBounds(10,40,280,300);
        p2.add(stdatabase);

        f.add(p1);
        f.add(p2);
        p1.setBounds(20,20,430,700);
        p2.setBounds(470,20,300,400);

        p1.setBackground(Color.WHITE);
        p2.setBackground(Color.WHITE);

        Border redline=BorderFactory.createTitledBorder("Fill Registration Form");
        Border redline1=BorderFactory.createTitledBorder("Student DataBase");
        p1.setBorder(redline);
        p2.setBorder(redline1);
        p1.setLayout(null);
        p2.setLayout(null);
        f.setSize(800,750);
        f.setLayout(null);
        f.setVisible(true);

        submit.addActionListener(this);
        reset.addActionListener(this);
        exit.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(cb.isSelected()) {
            if(e.getSource()==submit){
                String Sex="Male";
                if(female.isSelected())
                {
                    Sex="female";
                }
                DateFormat df=new SimpleDateFormat("dd-MM-yyyy");
                stdatabase.setText("Name:"+instname.getText()+"\nFather Name:"+infname.getText()+"\nMother Name: "+inmname.getText()+"\nGender :"+Sex+"\nDate of Birth: "+df.format(indob.getDate())+"\nMobile No. :"+inmno.getText()+"\nEmail-Id:"+inemid.getText()+"\nAddress:"+inadd.getText()+"\nCourse: "+incourse.getSelectedItem()+"\nBranch: "+inbranch.getSelectedItem()+"\nDate of Admission: "+df.format(indoa.getDate()));


            }
        }

        if(e.getSource()==reset)
        {
            instname.setText(null);
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
        if(e.getSource()==exit) {
            System.exit(0);
        }
    }
    public static void main(String[]args)
    {SwingUtilities.invokeLater(new Runnable(){
        public void run() {
            new studentregisform();
        }
    });
    }}