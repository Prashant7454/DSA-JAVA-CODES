import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Data extends JFrame {
    private JPanel contentPane;
    private JTextField id;
    private JTextField name;
    private JTextField number;
    private JTextField idt;

    public Data(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 473);
        contentPane = new JPanel();
        contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Employee Registration By Sunidhi");
        lblNewLabel.setBounds(69, 0, 326, 50);
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel.setForeground(Color.BLUE);
        contentPane.add(lblNewLabel);

        JPanel panel = new JPanel();
        panel.setBounds(10, 72, 216, 219);
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

        JButton btnNewButton = new JButton("Save");
        btnNewButton.setBounds(53, 173, 89, 23);
        panel.add(btnNewButton);
        btnNewButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                try
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/javaconnectivity","root","");
                    Statement stmt=con.createStatement();
                    String sql="insert into employee(id,name,number) values(?,?,?)";
                    PreparedStatement st=con.prepareStatement(sql);
                    st.setString(1,id.getText());
                    st.setString(2,name.getText());
                    st.setString(3,number.getText());

                    st.executeUpdate();
                    con.close();
                    JOptionPane.showMessageDialog(null,"inserted successfully");
                }

                catch(Exception ea)
                {
                    System.out.println(ea);
                }
            }});
        JPanel panel_1 = new JPanel();
        panel_1.setBounds(240, 72, 216, 219);
        contentPane.add(panel_1);
        panel_1.setLayout(null);
        panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));

        JTextArea JSHow = new JTextArea();
        JSHow.setDropMode(DropMode.INSERT);
        JSHow.setBounds(3,3,215,210);
        JSHow.setToolTipText("");
        panel_1.add(JSHow);

    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run()
            {
                try
                {
                    Data frame=new Data();
                    frame.setVisible(true);
                }
                catch(Exception ex)
                {
                    ex.printStackTrace();
                }
            }
        });
    }
}
