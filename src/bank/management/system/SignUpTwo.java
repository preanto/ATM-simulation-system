
package bank.management.system;



import javax.swing.*;
import java.awt.*;
import java.awt.event.*; // action listener

public class SignUpTwo extends JFrame implements ActionListener{
    
    
    
    JTextField pan,nid;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    JComboBox religeon,category, occupation, education,income;
    String formno;
    
    SignUpTwo(String formno){
        this.formno = formno;
        setLayout(null);
        setTitle("New Account Application Form - PG:2");
        
        
        
        
        JLabel additionalDetails = new JLabel("Page 2: Additional Details ");
        additionalDetails.setFont(new Font("Arial", Font.BOLD, 24));
        additionalDetails.setBounds(250,80,400,30);
        add(additionalDetails);
        
        JLabel name = new JLabel("Religeon: ");
        name.setFont(new Font("Arial", Font.BOLD, 20));
        name.setBounds(100,140,100,30);
        add(name);
        
        String valReligeon[] = {"Islam", "Hindu","Christian", "Other"};
        religeon= new JComboBox(valReligeon);
        religeon.setBounds(300, 140, 400, 30);
        religeon.setBackground(Color.WHITE);
        add(religeon);
        
        
        
        
        JLabel fname = new JLabel("Category: ");
        fname.setFont(new Font("Arial", Font.BOLD, 20));
        fname.setBounds(100,190,150,30);
        add(fname);
        
        String valCategory[] = {"General", "Savings", "Student"};
        category = new JComboBox(valCategory);
        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.WHITE);
        add(category);
        
        JLabel dob = new JLabel("Income: ");
        dob.setFont(new Font("Arial", Font.BOLD, 20));
        dob.setBounds(100,240,150,30);
        add(dob);
        
        String incomecategory[] = {"<100000", "<50000", "<1000000"};
        income = new JComboBox(incomecategory);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.WHITE);
        add(income);
        
        
        JLabel gender = new JLabel("Education ");
        gender.setFont(new Font("Arial", Font.BOLD, 20));
        gender.setBounds(100,290,150,30);
        add(gender);
        
        
        
        
        
        JLabel email = new JLabel("Qualification: ");
        email.setFont(new Font("Arial", Font.BOLD, 20));
        email.setBounds(100,320,150,30);
        add(email);
        
        String educationValue[] = {"Primary", "High School", "College","Undergrad","PostGrad","others"};
        education = new JComboBox(educationValue);
        education.setBounds(300, 320, 400, 30);
        education.setBackground(Color.WHITE);
        add(education);
        
        
     
        
        JLabel marital = new JLabel("Occupation: ");
        marital.setFont(new Font("Arial", Font.BOLD, 20));
        marital.setBounds(100,390,150,30);
        add(marital);
        
        String occupationValue[] = {"Self Employee", "Unemployee", "Business","Student","Retired","others"};
        occupation = new JComboBox(occupationValue);
        occupation.setBounds(300, 390, 400, 30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
        
        
       
        JLabel address = new JLabel("PAN Number: ");
        address.setFont(new Font("Arial", Font.BOLD, 20));
        address.setBounds(100,440,150,30);
        add(address);
        
        pan = new JTextField ();
        pan.setFont(new Font("Arial", Font.BOLD, 14));
        pan.setBounds(300, 440, 400, 30);
        add(pan);
        
        JLabel city = new JLabel("NID Number: ");
        city.setFont(new Font("Arial", Font.BOLD, 20));
        city.setBounds(100,490,150,30);
        add(city);
        
        nid = new JTextField ();
        nid.setFont(new Font("Arial", Font.BOLD, 14));
        nid.setBounds(300, 490, 400, 30);
        add(nid);
        
        JLabel state = new JLabel("Senior Citizen?: ");
        state.setFont(new Font("Arial", Font.BOLD, 20));
        state.setBounds(100,540,200,30);
        add(state);
        
        syes = new JRadioButton("YES");
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(450, 540,120,30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(syes);
        maritalgroup.add(sno);
        
        
        
        
        /*
        stateTextField = new JTextField ();
        stateTextField.setFont(new Font("Arial", Font.BOLD, 14));
        stateTextField.setBounds(300, 540, 400, 30);
        add(stateTextField);
        */
        JLabel pincode = new JLabel("Existing account?: ");
        pincode.setFont(new Font("Arial", Font.BOLD, 20));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
        eyes = new JRadioButton("YES");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
  
        
        eno = new JRadioButton("No");
        eno.setBounds(450, 590,120,30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        ButtonGroup emaritalgroup = new ButtonGroup();
        maritalgroup.add(eyes);
        maritalgroup.add(eno);
        
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
       // String formno =""+ random; //long - string concad
        String sreligeon = (String)religeon.getSelectedItem();
        String scategory = (String)category.getSelectedItem();
        String sincome = (String)income.getSelectedItem();
        String seducation = (String)education.getSelectedItem();
        String soccupation = (String)occupation.getSelectedItem();
        String seniorcitizen = null;
        if(syes.isSelected()){
            seniorcitizen = "Yes";
        }
        else if(sno.isSelected())
        {
            seniorcitizen = "No";
        }
        
        String existingaccount = null;
        if(eyes.isSelected())
        {
            existingaccount = "yes";
        }
        
        
        String span = pan.getText();
        String snid = nid.getText();
        
        try {
            conn c = new conn();
            String query = "insert into signuptwo values('"+formno+"', '"+sreligeon+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+snid+"','"+seniorcitizen+"','"+existingaccount+"')";
            c.s.executeUpdate(query);
            
            setVisible(false);
            new SignUpThree(formno).setVisible(true);
  
            
            }
        
        //Sign up Object
        catch (Exception e){
            System.out.println(e);
        }
    }
    
    public static void main(String args[]){
      new SignUpTwo("");
        
    }
}
