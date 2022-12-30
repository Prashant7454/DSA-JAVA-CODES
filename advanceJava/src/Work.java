import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.*;

public class Work extends JFrame{
    JLabel JL_fname,JL_lname,JL_age,JL_id;
    JTextField JT_fname,JT_lname,JT_age,JT_id;
    JButton btn_insert,btn_update,btn_delete;
    public Work(){
        super("INSERT UPDATE DELETE");
        JL_id = new JLabel("Id:");
        JL_fname = new JLabel("First Name:");
        JL_lname = new JLabel("Last Name:");
        JL_age = new JLabel("Age:");
        JL_id.setBounds(20, 20, 100, 20);
        JL_fname.setBounds(20, 50, 100, 20);
        JL_lname.setBounds(20, 80, 100, 20);
        JL_age.setBounds(20, 110, 100, 20);

        JT_id = new JTextField(20);
        JT_fname = new JTextField(20);
        JT_lname = new JTextField(20);
        JT_age = new JTextField(20);
        JT_id.setBounds(130,20,150,20);
        JT_fname.setBounds(130, 50, 150, 20);
        JT_lname.setBounds(130, 80, 150, 20);
        JT_age.setBounds(130, 110, 150, 20);
        btn_insert = new JButton("Insert");
        btn_update = new JButton("Update");
        btn_delete = new JButton("Delete");
        btn_insert.setBounds(300, 50, 80, 20);
        btn_update.setBounds(300, 80, 80, 20);
        btn_delete.setBounds(300, 110, 80, 20);


        setLayout(null);
        add(JL_id);
        add(JL_fname);
        add(JL_lname);
        add(JL_age);
        add(JT_id);
        add(JT_fname);
        add(JT_lname);
        add(JT_age);
        add(btn_insert);
        add(btn_update);
        add(btn_delete);



        //button insert
        btn_insert.addActionListener(new  ActionListener() {

            public void actionPerformed(ActionEvent e) {
                try{
                    theQuery("insert into users (fname,lname,age) values('"+JT_fname.getText()+"','"+JT_lname.getText()+"',"+JT_age.getText()+")");
                }
                catch(Exception ex){}
            }
        });

        //button update
        btn_update.addActionListener(new  ActionListener() {

            public void actionPerformed(ActionEvent e) {
                try{

                    theQuery("update users set fname = '"+JT_fname.getText()+"',lname = '"+JT_lname.getText()+"', age = "+JT_age.getText()+" where id = "+JT_id.getText());
                }
                catch(Exception ex){}
            }
        });

        //button delete
        btn_delete.addActionListener(new  ActionListener() {

            public void actionPerformed(ActionEvent e) {
                try{

                    theQuery("delete from users where id = "+JT_id.getText());
                }
                catch(Exception ex){}
            }
        });


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(500,200);

    }



    //function to execute the insert update delete query
    public void theQuery(String query){
        Connection con = null;
        Statement st = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaconnectivity","root","root");
            st = con.createStatement();
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Query Executed");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }


    public static void main(String[] args){

        new Work();
    }
}