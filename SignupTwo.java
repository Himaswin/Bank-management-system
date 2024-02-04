import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;


public class SignupTwo extends JFrame implements ActionListener{


  JTextField pan, aadhartext;
  JButton next;
  JRadioButton syes, sno, eyes, eno;
  String formno;

   JComboBox religion, category, income, occupation, education;



  SignupTwo(String formno){
    this.formno = formno;

    setLayout(null);
    setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");


    JLabel  additionLabelDetails  = new JLabel("PAGE 2: Addition Details");
    additionLabelDetails.setFont(new Font("Raleway", Font.BOLD,38));
    additionLabelDetails.setBounds(140, 30, 600, 40);
    add(additionLabelDetails);

    JLabel personalDetails = new JLabel("Page 1: Personal Details");
    personalDetails.setFont(new Font("Raleway", Font.BOLD,22));
    personalDetails.setBounds(290,90, 400, 30);
    add(personalDetails);


    JLabel name = new JLabel("Religion:");
    name.setFont(new Font("Raleway", Font.BOLD,20));
    name.setBounds(100, 140, 200, 30);
    add(name);

    String valReligion[] = {"Hindu","Muslim", "Sikh", "Christian", "other"};
     religion = new JComboBox(valReligion);
    religion.setBounds(300, 140,400, 30);
    religion.setBackground(Color.WHITE);
    add(religion);

;


    JLabel fname = new JLabel("Category: ");
    fname.setFont(new Font("Raleway", Font.BOLD,20));
    fname.setBounds(100, 190, 200, 30);
    add(fname);


    
    String valCategory[] ={"General", "OBC", "SC", "ST", "other"};
     category = new JComboBox(valCategory);
    category.setBounds(300,190, 400, 30);
    category.setBackground(Color.WHITE);
    add(category);


    JLabel DOB = new JLabel("Income: ");
    DOB.setFont(new Font("Raleway", Font.BOLD,20));
    DOB.setBounds(100, 240, 200, 30);
    add(DOB);

    String incomeCategory[] = {"Null", "< 1,50,000 ", "< 2,50,000 "," < 5,00,000", "Upto 10,00,000", "other"};
     income = new JComboBox(incomeCategory);
    income.setBounds(300,240, 400, 30);
    income.setBackground(Color.WHITE);
    add(income);



    JLabel gender = new JLabel("Educational ");
    gender.setFont(new Font("Raleway", Font.BOLD,20));
    gender.setBounds(100,290, 200, 30);
    add(gender);   



    
    JLabel email = new JLabel("Qualification:");
    email.setFont(new Font("Raleway", Font.BOLD,20));
    email.setBounds(100, 315, 200, 30);
    add(email);  

    String educationval[] = {"Non-graduate", "Graduate ", "Post Graduation","Doctorate", "others"};
     education = new JComboBox(educationval);
    education.setBounds(300,315, 400, 30);
    education.setBackground(Color.WHITE);
    add(education);



    JLabel marital = new JLabel("Ocuupation");
    marital.setFont(new Font("Raleway", Font.BOLD,20));
    marital.setBounds(100, 390, 200, 30);
    add(marital);   

    String occuval[] = {"Salaried", "Self-Employed ", " Bussiness","Retired", "others"};
    occupation = new JComboBox(occuval);
    occupation.setBounds(300,390, 400, 30);
    occupation.setBackground(Color.WHITE);
    add(occupation);



    JLabel address = new JLabel("Pan Number: ");
    address.setFont(new Font("Raleway", Font.BOLD,20));
    address.setBounds(100, 440, 200, 30);
    add(address);    

    pan = new JTextField();
    pan.setFont(new Font("Raleway", Font.BOLD,14));
    pan.setBounds(300, 440, 400, 30);
    add(pan);

    JLabel aadhar = new JLabel("Aaadhar Number:");
    aadhar.setFont(new Font("Raleway", Font.BOLD,20));
    aadhar.setBounds(100, 490, 200, 30);
    add(aadhar);     

      aadhartext = new JTextField();
    aadhartext.setFont(new Font("Raleway", Font.BOLD,14));
    aadhartext.setBounds(300, 490, 400, 30);
    add(aadhartext);

// Senior Citizen
JLabel state = new JLabel("Senior Citizen:");
state.setFont(new Font("Raleway", Font.BOLD, 20));
state.setBounds(100, 540, 200, 30);
add(state);

syes = new JRadioButton("Yes");
syes.setBounds(300, 540, 100, 30);
syes.setBackground(Color.WHITE);
add(syes);

sno = new JRadioButton("No");
sno.setBounds(400, 540, 100, 30);
sno.setBackground(Color.WHITE);
add(sno);

ButtonGroup senior = new ButtonGroup();
senior.add(syes);
senior.add(sno);

// Existing Account
JLabel pincode = new JLabel("Existing Account: ");
pincode.setFont(new Font("Raleway", Font.BOLD, 20));
pincode.setBounds(100, 590, 200, 30);
add(pincode);

eyes = new JRadioButton("Yes");
eyes.setBounds(300, 590, 100, 30);
eyes.setBackground(Color.WHITE);
add(eyes);

eno = new JRadioButton("No");
eno.setBounds(400, 590, 100, 30);
eno.setBackground(Color.WHITE);
add(eno);

ButtonGroup eacc = new ButtonGroup();
eacc.add(eyes);
eacc.add(eno);


    next = new JButton("Next");
    next.setBackground(Color.BLACK);
    next.setForeground(Color.WHITE);
    next.setFont(new Font("Raleway", Font.BOLD, 14));
    next.setBounds(620, 660, 80, 30);
    next.addActionListener(this);
    add(next);

    getContentPane().setBackground(Color.WHITE);

     setSize(850,800);
     setLocation(350,10);
     setVisible(true);
  }

  public void actionPerformed(ActionEvent ae){
    String sreligion = (String)religion.getSelectedItem();
    String scategory = (String)category.getSelectedItem();
    String sincome = (String)income.getSelectedItem();
    String seducation = (String)education.getSelectedItem();
    String soccupation = (String)occupation.getSelectedItem();
    String seniorcitizen = null;

    if(syes.isSelected()){
      seniorcitizen = "Yes";
    }else if (sno.isSelected()){
      seniorcitizen = "No";
    }

    String existingaccount = null;
    if(eyes.isSelected()){
      existingaccount = "Yes";
    }else if (eno.isSelected()){
      existingaccount = "No";
    }
    String span = pan.getText();
    String saadhar = aadhartext.getText();


    try{

        Conn c = new Conn();
        String query = "insert into signuptwo values('"+formno+"', '"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+existingaccount+"')";
        c.s.executeUpdate(query);


        //signup3 object
        setVisible(false);
        new SignupThree(formno).setVisible(true);
    }catch(Exception e){
      System.out.println(e);
    }

  }

  public static void main(String[] args) {
    new SignupTwo("");
  } 
}
