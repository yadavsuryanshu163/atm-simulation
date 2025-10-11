

package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.util.Random;
import javax.swing.*;
import java.awt.event.*;



public class Signuptwo extends JFrame implements ActionListener
{   
    JButton next;
    JTextField panTextField,phoneTextField, AadharTextField;
    JComboBox religion,category,income,Occupation,Qualification,citizen,customer;
    String formno;
    Signuptwo(String formno)
    { 
        this.formno=formno;
        setLayout(null);

     setTitle("NEW ACCOUNT APPLICATION FORM-PAGE 2");

      getContentPane().setBackground(Color.WHITE);
      
      JLabel Formno=new JLabel("Page 2: ADDITIONAL DETAILS");
      Formno.setFont(new Font("Raleway",Font.BOLD,38));
      Formno.setBounds(140,40,600,40);
      add(Formno);

      
      JLabel Religion=new JLabel("Religion : ");
      Religion.setFont(new Font("Raleway",Font.BOLD,20));
      Religion.setBounds(130,150,100,40);
      add(Religion);
      
      String valRegion[]={"HINDU","MUSLIM","SIKH","CHRISTIAN","JAIN","OTHERS"};
      religion=new JComboBox(valRegion);
      religion.setBounds(500,150,300,40);
      religion.setFont(new Font("Raleway",Font.BOLD,19));
      religion.setBackground(Color.WHITE);
      add(religion);

      JLabel Category=new JLabel("category : ");
      Category.setFont(new Font("Raleway",Font.BOLD,20));
      Category.setBounds(130,200,300,40);
      add(Category);
      
      String valcategory[]={"GENERAL","OBC-1","OBC-2","EBC","SC","ST","OTHERS"};
      category=new JComboBox(valcategory);
      category.setBounds(500,200,300,40);
      category.setFont(new Font("Raleway",Font.BOLD,19));
      category.setBackground(Color.WHITE);
      add(category);

      JLabel Income=new JLabel("income : ");
      Income.setFont(new Font("Raleway",Font.BOLD,20));
      Income.setBounds(130,250,300,40);
      add(Income);
      
      String valincome[]={"NULL","BELOW 1LAKH","BELOW 5LAKH","ABOVE 8LAKH","ABOVE 20LAKH","ABOVE 50LAKH"};
      income=new JComboBox(valincome);
      income.setBounds(500,250,300,40);
      income.setFont(new Font("Raleway",Font.BOLD,19));
      income.setBackground(Color.WHITE);
      add(income);

      JLabel Education=new JLabel("Educational");
      Education.setFont(new Font("Raleway",Font.BOLD,20));
      Education.setBounds(130,300,150,40);
      add(Education);
      
      JLabel Q=new JLabel("Qualification : ");
      Q.setFont(new Font("Raleway",Font.BOLD,20));
      Q.setBounds(130,320,150,40);
      add(Q);
      
      String valq[]={"10","10+2","GRADUATE","MASTERS","PHD","OTHERS"};
      Qualification=new JComboBox(valq);
      Qualification.setBounds(500,320,300,40);
      Qualification.setFont(new Font("Raleway",Font.BOLD,19));
      Qualification.setBackground(Color.WHITE);
      add(Qualification);
      
     
      JLabel ph=new JLabel("Phone number : ");
      ph.setFont(new Font("Raleway",Font.BOLD,20));
      ph.setBounds(130,400,180,40);
      add(ph);
      
      phoneTextField=new JTextField();
      phoneTextField.setBounds(500,400,300,40);
      phoneTextField.setFont(new Font("Raleway",Font.BOLD,19));
      add(phoneTextField);

      JLabel occup=new JLabel("Occupation : ");
      occup.setFont(new Font("Raleway",Font.BOLD,20));
      occup.setBounds(130,450,190,40);
      add(occup);
      
      String valO[]={"SALIRIED","SELF EMPLOYED","BUSSINESS","STUDENT","RETIRED","OTHERS"};
      Occupation=new JComboBox(valO);
      Occupation.setBounds(500,450,300,40);
      Occupation.setFont(new Font("Raleway",Font.BOLD,19));
      Occupation.setBackground(Color.WHITE);
      add(Occupation);
       
     
     
      JLabel Pan=new JLabel("PAN NO : ");
      Pan.setFont(new Font("Raleway",Font.BOLD,20));
      Pan.setBounds(130,500,150,40);
      add(Pan);
      
       panTextField=new JTextField();
      panTextField.setBounds(500,500,300,40);
      panTextField.setFont(new Font("Raleway",Font.BOLD,19));
      add(panTextField);

      JLabel aadhar=new JLabel("AADHAR NO : ");
      aadhar.setFont(new Font("Raleway",Font.BOLD,20));
      aadhar.setBounds(130,550,190,40);
      add(aadhar);
      
       AadharTextField=new JTextField();
      AadharTextField.setBounds(500,550,300,40);
      AadharTextField.setFont(new Font("Raleway",Font.BOLD,19));
      add(AadharTextField);

      JLabel Citizen=new JLabel("Senior Citizen : ");
      Citizen.setFont(new Font("Raleway",Font.BOLD,20));
      Citizen.setBounds(130,600,190,40);
      add(Citizen);
      
       String vala[]={"YES","NO"};
      citizen=new JComboBox(vala);
      citizen.setBounds(500,600,300,40);
      citizen.setFont(new Font("Raleway",Font.BOLD,19));
      citizen.setBackground(Color.WHITE);
      add(citizen);
      
     

      JLabel Customer=new JLabel("Existing account : ");
      Customer.setFont(new Font("Raleway",Font.BOLD,20));
      Customer.setBounds(130,650,190,40);
      add(Customer);
      
       String valb[]={"YES","NO"};
      customer=new JComboBox(valb);
      customer.setBounds(500,650,300,40);
      customer.setFont(new Font("Raleway",Font.BOLD,19));
      customer.setBackground(Color.WHITE);
      add(customer);
      
      

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
       
       String Religion=(String) religion.getSelectedItem();
       String Category=(String) category.getSelectedItem();
       String Income=(String) income.getSelectedItem();
       String Education=(String) Qualification.getSelectedItem();
       String ph=phoneTextField.getText();
     
      String occup=(String) Occupation.getSelectedItem();
      String Pan=panTextField.getText();
      String Aadhar=AadharTextField.getText();
      String Citizen=(String) citizen.getSelectedItem();
      String Customer=(String) customer.getSelectedItem();
      
      
     
      
      try
      {
          if(Pan.equals(""))
          {
           JOptionPane.showMessageDialog(null,"Pan is required");
          }
          else
          {
              conn c=new conn();
              String query="insert into SignupTwo values('"+formno+"','"+Religion+"','"+Category+"','"+Income+"','"+Education+"','"+ph+"','"+occup+"','"+Pan+"','"+Aadhar+"','"+Citizen+"','"+Customer+"')";
              c.s.executeUpdate(query);
              setVisible(false);
              new SignupThree(formno).setVisible(true);
          }
      }
      catch (Exception e)
      {
          System.out.println(e);
      }
       
    }
    public static void main(String[] args)
    {
        new Signuptwo("");
    }
}
