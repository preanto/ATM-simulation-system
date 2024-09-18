
package bank.management.system;

 import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;
import java.awt.event.*; //action listener
import java.sql.*;
public class BalanceEnquiry extends JFrame implements ActionListener{
    
    JButton back;
    JTextField t1, t2;
    JButton b1, b2, b3;
    JLabel l1, l2, l3;
    String pinnumber;
 BalanceEnquiry(String pinnumber) {
        this.pinnumber = pinnumber;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 960, 1080);
        add(l3);

        l1 = new JLabel();
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System", Font.BOLD, 16));

        b1 = new JButton("BACK");

        setLayout(null);

        l1.setBounds(190, 350, 400, 35);
        l3.add(l1);

        b1.setBounds(390, 633, 150, 35);
        l3.add(b1);
        int balance = 0;
        try{
            conn c1 = new conn();
            ResultSet rs = c1.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
            while (rs.next()) {
                if (rs.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(rs.getString("amount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
        }catch(Exception e){System.out.println(e);}
        
        l1.setText("Your Current Account Balance is Taka :"+balance);

        b1.addActionListener(this);

        setSize(960, 1080);
        setUndecorated(true);
        setLocation(500, 0);
        setVisible(true);
    }
  
    
    
    public void actionPerformed(ActionEvent ae)
    {
        setVisible(false);
        new Transection(pinnumber).setVisible(true);
    }
    public static void main(String []args)
    {
        new BalanceEnquiry("");
    }
}
