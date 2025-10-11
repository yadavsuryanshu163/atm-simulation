
package bank.management.system;
import java.lang.*;
import java.awt.Color;
import java.awt.Font;
import java.util.Random;
import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.event.*;

public class Signup extends JFrame implements ActionListener
{
    long random;
    JButton next;
    JTextField nameTextField,FathersnameTextField,mnameTextField,mailTextField,addressTextField,cityTextField,stateTextField,pinTextField;
    JDateChooser DateChooser;
    JRadioButton male,female,married,unmarried,other;
    ButtonGroup gendergroup,martialgroup;
   
    Signup()
    {  setLayout(null);

      Random ran=new Random();
      random=Math.abs((ran.nextLong()%9000L)+1000L);
       
      getContentPane().setBackground(Color.WHITE);
      
      JLabel formno=new JLabel("APPLICATION FORM NO "+random);
      formno.setFont(new Font("Raleway",Font.BOLD,38));
      formno.setBounds(140,40,600,40);
      add(formno);

      JLabel Persondetails=new JLabel("page:1 PERSONAL DETAILS");
      Persondetails.setFont(new Font("Raleway",Font.BOLD,28));
      Persondetails.setBounds(230,100,600,40);
      add(Persondetails);

      JLabel name=new JLabel("Name : ");
      name.setFont(new Font("Raleway",Font.BOLD,20));
      name.setBounds(130,150,100,40);
      add(name);
      
      nameTextField=new JTextField();
      nameTextField.setBounds(500,150,300,40);
      nameTextField.setFont(new Font("Raleway",Font.BOLD,19));
      add(nameTextField);

      JLabel Fathersname=new JLabel("Fathers Name : ");
      Fathersname.setFont(new Font("Raleway",Font.BOLD,20));
      Fathersname.setBounds(130,200,300,40);
      add(Fathersname);
      
      FathersnameTextField=new JTextField();
      FathersnameTextField.setBounds(500,200,300,40);
      FathersnameTextField.setFont(new Font("Raleway",Font.BOLD,19));
      add(FathersnameTextField);

      JLabel mname=new JLabel("Mothers Name : ");
      mname.setFont(new Font("Raleway",Font.BOLD,20));
      mname.setBounds(130,250,300,40);
      add(mname);
      
      mnameTextField=new JTextField();
      mnameTextField.setBounds(500,250,300,40);
      mnameTextField.setFont(new Font("Raleway",Font.BOLD,19));
      add(mnameTextField);

      JLabel dob=new JLabel("DOB :");
      dob.setFont(new Font("Raleway",Font.BOLD,20));
      dob.setBounds(130,300,100,40);
      add(dob);
      

      DateChooser=new JDateChooser();
      DateChooser.setBounds(500,300,300,40);
      DateChooser.setFont(new Font("Raleway",Font.BOLD,19));
      add(DateChooser);

      JLabel gender=new JLabel("Gender : ");
      gender.setFont(new Font("Raleway",Font.BOLD,20));
      gender.setBounds(130,350,100,40);
      add(gender);
      
        male=new JRadioButton("MALE");
      male.setBounds(500,350,100,40);
      male.setBackground(Color.WHITE);
      add(male);
      
       female=new JRadioButton("FEMALE");
      female.setBounds(620,350,100,40);
      female.setBackground(Color.WHITE);
      add(female);
      
     gendergroup= new ButtonGroup();
      gendergroup.add(male);
      gendergroup.add(female);
      
     
      JLabel mail=new JLabel("Email : ");
      mail.setFont(new Font("Raleway",Font.BOLD,20));
      mail.setBounds(130,400,100,40);
      add(mail);
      
      mailTextField=new JTextField();
      mailTextField.setBounds(500,400,300,40);
      mailTextField.setFont(new Font("Raleway",Font.BOLD,19));
      add(mailTextField);

      JLabel martial=new JLabel("Martial status : ");
      martial.setFont(new Font("Raleway",Font.BOLD,20));
      martial.setBounds(130,450,190,40);
      add(martial);
      
        married=new JRadioButton("MARRIED");
        married.setBounds(500,450,100,40);
      married.setBackground(Color.WHITE);
      add(married);
      
       unmarried=new JRadioButton("UNMARRIED");
      unmarried.setBounds(600,450,100,40);
      unmarried.setBackground(Color.WHITE);
      add(unmarried);
      
       other=new JRadioButton("OTHER");
      other.setBounds(700,450,100,40);
      other.setBackground(Color.WHITE);
      add(other);
      
     martialgroup= new ButtonGroup();
      martialgroup.add(married);
      martialgroup.add(unmarried);
      martialgroup.add(other);
     
     
      JLabel add=new JLabel("Address : ");
      add.setFont(new Font("Raleway",Font.BOLD,20));
      add.setBounds(130,500,150,40);
      add(add);
      
       addressTextField=new JTextField();
      addressTextField.setBounds(500,500,300,40);
      addressTextField.setFont(new Font("Raleway",Font.BOLD,19));
      add(addressTextField);

      JLabel city=new JLabel("City : ");
      city.setFont(new Font("Raleway",Font.BOLD,20));
      city.setBounds(130,550,100,40);
      add(city);
      
       cityTextField=new JTextField();
      cityTextField.setBounds(500,550,300,40);
      cityTextField.setFont(new Font("Raleway",Font.BOLD,19));
      add(cityTextField);

      JLabel state=new JLabel("State : ");
      state.setFont(new Font("Raleway",Font.BOLD,20));
      state.setBounds(130,600,100,40);
      add(state);
      
      stateTextField=new JTextField();
      stateTextField.setBounds(500,600,300,40);
      stateTextField.setFont(new Font("Raleway",Font.BOLD,19));
      add(stateTextField);

      JLabel pin=new JLabel("Pincode : ");
      pin.setFont(new Font("Raleway",Font.BOLD,20));
      pin.setBounds(130,650,100,40);
      add(pin);
      
       pinTextField=new JTextField();
      pinTextField.setBounds(500,650,300,40);
      pinTextField.setFont(new Font("Raleway",Font.BOLD,19));
      add(pinTextField);

       next=new JButton("NEXT");
        next.setBounds(700,700,100,30);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);
        
        

      setSize(850,800);
      setLocation(300,10);
      setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
       String formno=""+random;
       String name=nameTextField.getText();
       String Fathersname=FathersnameTextField.getText();
       String mname=mnameTextField.getText();
       String dob=((JTextField)DateChooser.getDateEditor().getUiComponent()).getText();
       String gender=null;
       if(male.isSelected())
       {
           gender="male";
          
       }
       else if(female.isSelected())
       {
           gender="female";
       }
      String mail=mailTextField.getText(); 
      String martial=null;
      if(married.isSelected())
      {
          martial="married";
      }
      else if(unmarried.isSelected())
      {
         martial="unmarried";
        
      }
      else if(other.isSelected())
      {
          martial="other";
      }
      String address=addressTextField.getText();
      String city=cityTextField.getText();
      String state=stateTextField.getText();
      String pin=pinTextField.getText();
      
      try
      {
          if(name.equals(""))
          {
           JOptionPane.showMessageDialog(null,"Name is required");
          }
          else
          {
              conn c=new conn();
              String query="insert into Signup values('"+formno+"','"+name+"','"+Fathersname+"','"+mname+"','"+dob+"','"+gender+"','"+mail+"','"+martial+"','"+address+"','"+city+"','"+state+"','"+pin+"')";
              c.s.executeUpdate(query);
              
              setVisible(false);
              new Signuptwo(formno).setVisible(true);
          }
      }
      catch (Exception e)
      {
          System.out.println(e);
      }
       
    }
    public static void main(String[] args)
    {
        new Signup();
    }
}
