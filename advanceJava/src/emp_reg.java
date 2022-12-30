import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import javax.swing.*;

import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;


public class emp_reg extends JFrame {

    private JPanel contentPane;
    private JTextField id;
    private JTextField name;
    private JTextField number;
    private JTextField idt;

    /**
     * Launch the application.
     */
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable() {
            public void run()
            {
                try
                {
                    emp_reg frame=new emp_reg();
                    frame.setVisible(true);
                }
                catch(Exception ex)
                {
                    ex.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public emp_reg() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 471, 473);
        contentPane = new JPanel();
        contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Employee Registration By Prashant");
        lblNewLabel.setBounds(69, 0, 326, 50);
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel.setForeground(Color.BLUE);
        contentPane.add(lblNewLabel);

        JPanel panel = new JPanel();
        panel.setBounds(10, 72, 191, 219);
        panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel l1 = new JLabel("Emp ID");
        l1.setBounds(10, 28, 46, 14);
        panel.add(l1);

        id = new JTextField();
        id.setDropMode(DropMode.INSERT);
        id.setBounds(95, 25, 86, 20);
        id.setToolTipText("");
        panel.add(id);
        id.setColumns(10);

        JLabel l2 = new JLabel("Emp Name");
        l2.setBounds(10, 82, 80, 14);
        panel.add(l2);

        name = new JTextField();
        name.setDropMode(DropMode.INSERT);
        name.setBounds(95, 79, 86, 20);
        panel.add(name);
        name.setColumns(10);



        JLabel l3 = new JLabel("Mobile No.");
        l3.setBounds(10, 132, 60, 14);
        panel.add(l3);

        number = new JTextField();
        number.setDropMode(DropMode.INSERT);
        number.setBounds(95, 129, 86, 20);
        panel.add(number);
        number.setColumns(10);

        JPanel panel_1 = new JPanel();
        panel_1.setBounds(259, 255, 145, -162);
        contentPane.add(panel_1);

        JPanel panel_3 = new JPanel();
        panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panel_3.setBounds(233, 72, 191, 219);
        contentPane.add(panel_3);
        panel_3.setLayout(null);

        JTextArea t2 = new JTextArea();
        t2.setBounds(3, 3, 163, 210);
        panel_3.add(t2,BorderLayout.CENTER);

        JLabel lblNewLabel_1 = new JLabel("Fill Details");
        lblNewLabel_1.setBounds(79, 58, 78, 14);
        contentPane.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("Employee Database");
        lblNewLabel_2.setBounds(269, 58, 155, 14);
        contentPane.add(lblNewLabel_2);

        JButton btnNewButton_1 = new JButton("Search");
        btnNewButton_1.setBounds(10, 364, 89, 23);
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try
                {
                    t2.setText(null);
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaconnectivity","root","");
                    Statement st=con1.createStatement();
                    String sql2="select * from employee where id='" + idt.getText() + "'";
                    ResultSet rs = st.executeQuery(sql2);

                    if(rs.next()){
                        t2.setText("Id :"+ rs.getInt("id")+"\n\nname :"+ rs.getString("name")+"\n\nnumber :"+ rs.getInt("number"));
                    }
                    else{
                        throw new Exception("Data not found");
                    }

                    JOptionPane.showMessageDialog(null,"successful display");
                    con1.close();



                }

                catch(Exception ea)
                {
                    JOptionPane.showMessageDialog(null,"Data Not Found");
                }
            }
        });
        contentPane.add(btnNewButton_1);

        JButton btnNewButton_2 = new JButton("Update");
        btnNewButton_2.setBounds(129, 364, 89, 23);
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaconnectivity","root","");

                    Statement stmt=con2.createStatement();
                    String sql3="update employee set name=?,number=? where id='"+idt.getText()+"'";
                    PreparedStatement st=con2.prepareStatement(sql3);

                    st.setString(1,name.getText());
                    st.setString(2,number.getText());
                    st.executeUpdate();
                    con2.close();

                    JOptionPane.showMessageDialog(null,"updated successfully");
                }

                catch(Exception ea)
                {
//JOptionPane.showMessageDialog(null,"unsuccessful insertion");
                    System.out.println(ea);
                    JOptionPane.showMessageDialog(null,"id not found");
                }
            }
        });
        contentPane.add(btnNewButton_2);

        JButton btnNewButton_3 = new JButton("delete");
        btnNewButton_3.setBounds(244, 364, 89, 23);
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try
                {
                    t2.setText(null);
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaconnectivity","root","");

                    Statement stmt=con1.createStatement();
                    String sql2="delete from employee where id='"+idt.getText()+"'";
                    PreparedStatement st=con1.prepareStatement(sql2);
                    st.executeUpdate();
                    JOptionPane.showMessageDialog(null,"successful deletion");
                    con1.close();



                }

                catch(Exception ea)
                {
                    JOptionPane.showMessageDialog(null,"Data Not Found");
                    System.out.println(ea);
                }
            }
        });
        contentPane.add(btnNewButton_3);

        JButton btnNewButton_4 = new JButton("Display");
        btnNewButton_4.setBounds(356, 364, 89, 23);
        btnNewButton_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaconnectivity","root","");

                    Statement st=con1.createStatement();
                    String sql2="select * from employee";
                    ResultSet rs = st.executeQuery(sql2);
                    while(rs.next())
                    {
                        t2.append("Id :"+ rs.getInt("id")+"\n\nname :"+ rs.getString("name")+"\n\nnumber :"+ rs.getInt("number")+"\n\n");
                    }
                    JOptionPane.showMessageDialog(null,"successful display");
                    con1.close();



                }

                catch(Exception ea)
                {
                    JOptionPane.showMessageDialog(null,"Data Not Found");
                    System.out.println(ea);
                }
            }
        });
        contentPane.add(btnNewButton_4);

        JButton btnNewButton = new JButton("Save");
        btnNewButton.setBounds(53, 173, 89, 23);
        btnNewButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                try
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaconnectivity","root","");
                    Statement stmt=con.createStatement();
                    String sql="insert into employee(id,name,number) values(?,?,?)";
                    PreparedStatement st=con.prepareStatement(sql);
                    st.setString(1,id.getText());
                    st.setString(2,name.getText());
                    st.setString(3,number.getText());

                    st.executeUpdate();
                    con.close();
                    JOptionPane.showMessageDialog(null,"inserted successfully");
                    id.setText(null);
                    name.setText(null);
                    number.setText(null);
                    t2.setText(null);

                }

                catch(Exception ea)
                {
//JOptionPane.showMessageDialog(null,"unsuccessful insertion");
                    System.out.println(ea);
                }
            }});

        panel.add(btnNewButton);

        JLabel lblNewLabel_6 = new JLabel("Enter Emp ID");
        lblNewLabel_6.setBounds(23, 315, 76, 14);
        contentPane.add(lblNewLabel_6);

        idt = new JTextField();
        idt.setBounds(109, 312, 86, 20);
        idt.setDropMode(DropMode.INSERT);
        contentPane.add(idt);
        idt.setColumns(10);

        JPanel panel_2 = new JPanel();
        panel_2.setBounds(301, 72, -47, 117);
        contentPane.add(panel_2);



        JScrollPane scrollBar = new JScrollPane(t2,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollBar.setBounds(174, 0, 17, 215);
        panel_3.add(scrollBar);
    }}