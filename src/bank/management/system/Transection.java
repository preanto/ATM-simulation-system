
package bank.management.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Transection extends JFrame implements ActionListener{
    
    JButton deposit, withdrawal, ministatement, pinchange, fastcash, balanceenquiry,exit;
    String pinnumber;
    Transection(String pinnumber){
        this.pinnumber = pinnumber;
        //this.diposit = diposit;
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text = new JLabel("Please select your Transaction");
        text.setBounds(210, 300,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway", Font.BOLD, 16));
        image.add(text);
        
         deposit = new JButton("Deposit");
        deposit.setBounds(170, 415, 150,30);
        deposit.addActionListener(this);
        image.add(deposit);
        
         withdrawal = new JButton("Cash Withdrawal");
        withdrawal.setBounds(355, 415, 150,30);
        withdrawal.addActionListener(this);
        image.add(withdrawal);
       
        fastcash = new JButton("Fast Cash");
        fastcash.setBounds(355, 450, 150,30);
        fastcash.addActionListener(this);
        image.add(fastcash);
        /*
         ministatement = new JButton("Mini Statement");
        ministatement.setBounds(355, 450, 150,30);
        ministatement.addActionListener(this);
        image.add(ministatement);
        */
        /*
        pinchange = new JButton("Change Pin");
        pinchange.setBounds(170, 485, 150,30);
        pinchange.addActionListener(this);
        image.add(pinchange);
        */
         balanceenquiry = new JButton("Balance Enquiry");
        //balanceenquiry.setBounds(355, 485, 150,30);
        balanceenquiry.setBounds(170, 450, 150,30);
        balanceenquiry.addActionListener(this);
        image.add(balanceenquiry);
        
         exit = new JButton("Exit");
        exit.setBounds(355, 520, 150,30);
        exit.addActionListener(this);
        image.add(exit);
        
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==exit)
        {
        System.exit(0);
        }
        else if(ae.getSource() == deposit)
        {
            setVisible(false);
            new Diposit(pinnumber).setVisible(true);
        }
        else if(ae.getSource()==withdrawal)
        {
        setVisible(false);
        new Withdrawal(pinnumber).setVisible(true);
        }
        
        else if(ae.getSource()==balanceenquiry)
        {
        setVisible(false);
        new BalanceEnquiry(pinnumber).setVisible(true);
        }
        else if(ae.getSource()==fastcash)
        {
        setVisible(false);
        new FastCash(pinnumber).setVisible(true);
        }
        
    }
    
public static void main(String args[])
{
    new Transection("");
}
}
