
package bank.management.system;


import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*; // action listener

public class SignUpOne extends JFrame implements ActionListener{
    
    
    long random;
    JTextField nameTextField, fnameTextField, emailTextField, addressTextField, stateTextField, cityTextField,pinTextField;
    JButton next;
    JRadioButton male, female, married, unmarried;
    JDateChooser dateChooser;
            
    
    SignUpOne(){
        
        setLayout(null);
        
        Random ran = new Random();
        random = (Math.abs(ran.nextLong()%9000L) + 1000L);
            
        JLabel Formno = new JLabel("APPLICATION FORM NO: " + random);
        Formno.setFont(new Font("Arial", Font.BOLD, 32));
        Formno.setBounds(140,20,600,40);
        add(Formno);
        getContentPane().setBackground(Color.WHITE);
        
        
        JLabel personDetails = new JLabel("Page 1: Personal Details ");
        personDetails.setFont(new Font("Arial", Font.BOLD, 24));
        personDetails.setBounds(250,80,400,30);
        add(personDetails);
        
        JLabel name = new JLabel("Name: ");
        name.setFont(new Font("Arial", Font.BOLD, 20));
        name.setBounds(100,140,100,30);
        add(name);
        
        nameTextField = new JTextField ();
        nameTextField.setFont(new Font("Arial", Font.BOLD, 14));
        nameTextField.setBounds(300, 140, 400, 30);
        add(nameTextField);
        
        JLabel fname = new JLabel("Father's Name: ");
        fname.setFont(new Font("Arial", Font.BOLD, 20));
        fname.setBounds(100,190,150,30);
        add(fname);
        
        fnameTextField = new JTextField ();
        fnameTextField.setFont(new Font("Arial", Font.BOLD, 14));
        fnameTextField.setBounds(300, 190, 400, 30);
        add(fnameTextField);
        
        JLabel dob = new JLabel("Date of Birth: ");
        dob.setFont(new Font("Arial", Font.BOLD, 20));
        dob.setBounds(100,240,150,30);
        add(dob);
        
        dateChooser = new JDateChooser();
        dateChooser.setBounds(300,240, 400, 30);
        dateChooser.setForeground(Color.BLACK);
        add(dateChooser);
        
        JLabel gender = new JLabel("Gender: ");
        gender.setFont(new Font("Arial", Font.BOLD, 20));
        gender.setBounds(100,290,150,30);
        add(gender);
        
        male = new JRadioButton("Male");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.WHITE);
        add(male);
        
        female = new JRadioButton("Female");
        female.setBounds(450, 290,120,30);
        female.setBackground(Color.WHITE);
        add(female);
        
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        
        JLabel email = new JLabel("Email Address: ");
        email.setFont(new Font("Arial", Font.BOLD, 20));
        email.setBounds(100,340,150,30);
        add(email);
        
        emailTextField = new JTextField ();
        emailTextField.setFont(new Font("Arial", Font.BOLD, 14));
        emailTextField.setBounds(300, 340, 400, 30);
        add(emailTextField);
        
        JLabel marital = new JLabel("Marital Status: ");
        marital.setFont(new Font("Arial", Font.BOLD, 20));
        marital.setBounds(100,390,150,30);
        add(marital);
        
        married = new JRadioButton("Married");
        married.setBounds(300,390,100,30);
        married.setBackground(Color.WHITE);
        add(married);
        
        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450, 390,120,30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        
        
        
        
        JLabel address = new JLabel("Address: ");
        address.setFont(new Font("Arial", Font.BOLD, 20));
        address.setBounds(100,440,150,30);
        add(address);
        
        addressTextField = new JTextField ();
        addressTextField.setFont(new Font("Arial", Font.BOLD, 14));
        addressTextField.setBounds(300, 440, 400, 30);
        add(addressTextField);
        
        JLabel city = new JLabel("City: ");
        city.setFont(new Font("Arial", Font.BOLD, 20));
        city.setBounds(100,490,150,30);
        add(city);
        
        cityTextField = new JTextField ();
        cityTextField.setFont(new Font("Arial", Font.BOLD, 14));
        cityTextField.setBounds(300, 490, 400, 30);
        add(cityTextField);
        
        JLabel state = new JLabel("State: ");
        state.setFont(new Font("Arial", Font.BOLD, 20));
        state.setBounds(100,540,150,30);
        add(state);
        
        stateTextField = new JTextField ();
        stateTextField.setFont(new Font("Arial", Font.BOLD, 14));
        stateTextField.setBounds(300, 540, 400, 30);
        add(stateTextField);
        
        JLabel pincode = new JLabel("Pin Code: ");
        pincode.setFont(new Font("Arial", Font.BOLD, 20));
        pincode.setBounds(100,590,150,30);
        add(pincode);
        
        pinTextField = new JTextField ();
        pinTextField.setFont(new Font("Arial", Font.BOLD, 14));
        pinTextField.setBounds(300, 590, 400, 30);
        add(pinTextField);
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620,660, 80,30);
        next.addActionListener(this);
        add(next);
        
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        String formno =""+ random; //long - string concad
        String name = nameTextField.getText(); // 
        String fname = fnameTextField.getText();
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        {if(male.isSelected()){
            gender = "Male";
        }
        else if(female.isSelected())
        {
            gender = "Female";
        }
        }
        String email = emailTextField.getText();
        
        String marital = null;
        
        if(married.isSelected())
        {
            marital = "Married";
        }
        else if (unmarried.isSelected())
        {
            marital = "Unmarried";
        }
        
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pincode = pinTextField.getText();
        
        try {
                if(name.equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Name is required");       
                } else{
                    
                    conn c = new conn();
                    String query = "insert into signup values('"+formno+"', '"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                    c.s.executeUpdate(query);
                    
                    setVisible(false);
                    new SignUpTwo(formno).setVisible(true);
                }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    
    public static void main(String args[]){
      new SignUpOne();
        
    }
}
