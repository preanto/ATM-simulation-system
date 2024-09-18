
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    JButton login,signup,clear;
    JTextField cardTextField;
    JPasswordField pinTextField;
    Login(){
        setTitle ("DESHI BANK LIMITED");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel (i3);
        label.setBounds(20,20, 100,100);
        add(label);
        
        JLabel text = new JLabel ("Welcome to DESHI BANK LTD.");
        text.setFont(new Font("Ariel", Font.BOLD, 38));
        text.setBounds(200,40, 600,40);
        add(text);
        
        JLabel cardno = new JLabel ("Card No: ");
        cardno.setFont(new Font("Verdana", Font.BOLD, 38));
        cardno.setBounds(200,120, 200,40);
        add(cardno);
        
        cardTextField = new JTextField();
        cardTextField.setBounds(420, 120, 250, 40);
        cardTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(cardTextField);
        
        JLabel pin = new JLabel ("PIN: ");
        pin.setFont(new Font("Verdana", Font.BOLD, 38));
        pin.setBounds(200,200, 250,40);
        add(pin);
        
        pinTextField = new JPasswordField();
        pinTextField.setBounds(420, 200, 250, 40);
        pinTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(pinTextField);
        
         login = new JButton("Sign In");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        
        add(login);
        
         clear = new JButton("Clear");
        clear.setBounds(450,300,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
        
         signup = new JButton("Sign Up");
        signup.setBounds(600,300,100,30);
        signup.setBackground(Color.RED);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);
        
        getContentPane().setBackground(Color.WHITE);
        
        
        setSize(1000, 600);
        setVisible(true);
        setLocation(350,200);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if (ae.getSource() == clear)
         {
            cardTextField.setText("");
            pinTextField.setText("");
         } 
        else if(ae.getSource()== login)
         {
             conn conn = new conn();
             String cardnumber = cardTextField.getText();
             String pinnumber = pinTextField.getText();
             String query = "select * from login where cardnumber = '"+cardnumber+"' and pin = '"+pinnumber+"'";
             try{
                 ResultSet rs = conn.s.executeQuery(query);
                 if(rs.next())
                 {
                     setVisible(false);
                     new Transection(pinnumber).setVisible(true);
                     
                 }
                 else {
                 JOptionPane.showMessageDialog(null, "Invalid Login Details");
                 
                 
                 
                 }
             }catch (Exception e)
             {
             System.out.println(e);
             }
         }
        else if(ae.getSource()==signup)
         {
             setVisible(false);
             new SignUpOne().setVisible(true);
         }
        
        
   }
    public static void main(String args[]){
      new Login();
        
    }
    
}
